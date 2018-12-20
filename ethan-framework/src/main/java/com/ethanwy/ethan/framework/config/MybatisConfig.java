package com.ethanwy.ethan.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ethan
 * @date 2018/12/20
 */
@Configuration
@MapperScan("com.ethanwy.ethan.framework.base.mapper.*")
public class MybatisConfig {

}
