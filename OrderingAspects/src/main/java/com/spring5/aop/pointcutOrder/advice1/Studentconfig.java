package com.spring5.aop.pointcutOrder.advice1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring5.aop.pointcutOrder.*")
@EnableAspectJAutoProxy
public class Studentconfig {
	

}
