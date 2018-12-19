package com.ethanwy.ethan.framework.redis;

import com.ethanwy.ethan.framework.base.model.AbstractUser;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Ethan
 * @date 2018/12/19
 */
public class ShiroRedisCache<K, V> implements Cache<K, V> {

    private long survivalTime = 5;

    private String cacheKey;

    private final RedisTemplate redisTemplate;

    public ShiroRedisCache(String cacheKey, RedisTemplate redisTemplate) {
        this.cacheKey = cacheKey;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public V get(K key) throws CacheException {
        return (V) redisTemplate.opsForValue().get(key);
    }

    @Override
    public V put(K key, V value) throws CacheException {
        redisTemplate.opsForValue().set(key, value, survivalTime, TimeUnit.MINUTES);
        return null;
    }

    @Override
    public V remove(K key) throws CacheException {
        return null;
    }

    @Override
    public void clear() throws CacheException {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Set<K> keys() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    protected Object hashKey(K key) {
        if (key instanceof PrincipalCollection) {
            PrincipalCollection pc = (PrincipalCollection) key;
            AbstractUser user = (AbstractUser) pc.getPrimaryPrincipal();
            return user.getId();
        }
        return key;
    }
}
