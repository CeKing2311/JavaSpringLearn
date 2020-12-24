package com.ceking.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 *@author ceking
 *@description 完全注解开发
 *@date 2020-12-24 16:49
 */
//配置类，代替xml
@Configuration
@ComponentScan(basePackages = {"com.ceking"})
public class SpringConfig {

}
