package com.spring5.aop.pointcutOrder.advice1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoginAdvice1 {
	@Before("com.spring5.aop.pointcutOrder.Aspect.OdersAspect.AllMethodsAdvice()")
	public void advice1() {
		System.out.println("============================>>>>>>>>>>>>>>>>>>>>advice 1:  this is loging details......with order 2");
	}

}
