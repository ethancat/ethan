package com.ethanwy.ethan.framework.redis;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Ethan
 * @date 2018/12/19
 */
@Component
public class RedisCacheManager implements CacheManager {

    private String cacheKeyPrefix = "shiro:";

    private final RedisTemplate redisTemplate;

    @Autowired
    public RedisCacheManager(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public <K, V> Cache<K, V> getCache(String name) throws CacheException {

        return new ShiroRedisCache<K, V>(cacheKeyPrefix + name, redisTemplate);
    }
}
