package com.yazbyz.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.yazbyz.daoexam.dao"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
