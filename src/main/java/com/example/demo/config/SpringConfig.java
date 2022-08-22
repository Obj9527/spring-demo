package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-16
 */
@Configuration
@ComponentScan("com.example.demo")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
