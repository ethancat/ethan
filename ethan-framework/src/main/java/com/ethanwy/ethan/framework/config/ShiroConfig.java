package com.ethanwy.ethan.framework.config;

import com.ethanwy.ethan.framework.shiro.realm.UserRealm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro配置
 *
 * @author Ethan
 * @date 2018/12/19
 */
@Configuration
public class ShiroConfig {

    @Bean
    public UserRealm getUserRealm(){
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }
    
}
