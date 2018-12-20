package com.ethanwy.ethan.framework.redis;

import com.ethanwy.ethan.framework.base.constant.RedisConstant;
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
public class ShiroCacheManager implements CacheManager {

    private String globalPrefix  = RedisConstant.GLOBAL_PREFIX;

    private final RedisTemplate redisTemplate;

    @Autowired
    public ShiroCacheManager(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {

        return new ShiroRedisCache<K, V>(globalPrefix + s, redisTemplate);
    }
}
