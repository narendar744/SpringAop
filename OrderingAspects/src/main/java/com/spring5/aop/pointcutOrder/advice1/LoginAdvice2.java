package com.spring5.aop.pointcutOrder.advice1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class LoginAdvice2 {
	@Before("com.spring5.aop.pointcutOrder.Aspect.OdersAspect.getterAdvice()")
	public void advice2() {
		System.out.println("============================>>>>>>>>>>>>>>>>>>>>advice 2:  this is API details...... with order 3");
	}

}
