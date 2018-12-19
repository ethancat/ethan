package com.ethanwy.ethan.framework.redis;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.CacheException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Ethan
 * @date 2018/12/19
 */
public class MybatisRedisCache implements Cache {

    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisRedisCache.class);

    private final String id;

    private long survivalTime = 3;

    private final RedisTemplate<Object, Object> redisTemplate;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public MybatisRedisCache(String id, long survivalTime, RedisTemplate<Object, Object> redisTemplate) {
        this.id = id;
        this.survivalTime = survivalTime;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        redisTemplate.opsForValue().set(key, value, survivalTime, TimeUnit.DAYS);
    }

    @Override
    public Object getObject(Object key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public Object removeObject(Object key) {
        redisTemplate.delete(key);
        return null;
    }

    @Override
    public void clear() {
        Set<Object> keys = redisTemplate.keys("*:" + id + "*");
        if(!CollectionUtils.isEmpty(keys)){
            redisTemplate.delete(keys);
        }
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }
}
