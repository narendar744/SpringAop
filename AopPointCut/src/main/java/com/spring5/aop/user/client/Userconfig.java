package com.spring5.aop.user.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring5.aop.user, com.spring5.aop.user.address,com.spring5.aop.advice")
@PropertySource("user.properties")
@EnableAspectJAutoProxy
public class Userconfig {
	

}
