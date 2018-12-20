package com.ethanwy.ethan.framework.config;

import com.ethanwy.ethan.framework.redis.ShiroCacheManager;
import com.ethanwy.ethan.framework.shiro.realm.UserRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * shiro配置
 *
 * @author Ethan
 * @date 2018/12/19
 */
@Configuration
@Import(ShiroCacheManager.class)
public class ShiroConfig {

    @Bean
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public UserRealm getUserRealm(ShiroCacheManager shiroCacheManager){
        UserRealm userRealm = new UserRealm();
        userRealm.setCacheManager(shiroCacheManager);
        return userRealm;
    }
    
}
