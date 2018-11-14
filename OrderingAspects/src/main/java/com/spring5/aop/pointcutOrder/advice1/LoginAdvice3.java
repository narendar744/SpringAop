package com.spring5.aop.pointcutOrder.advice1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoginAdvice3 {
	@Before("com.spring5.aop.pointcutOrder.Aspect.OdersAspect.setterAdvice()")
	public void advice3() {
		System.out.println("============================>>>>>>>>>>>>>>>>>>>>advice 3:  this is remote details...... with oder 1");
	}

}
