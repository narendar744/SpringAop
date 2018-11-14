package com.spring5.aop.pointcutOrder.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class OdersAspect {
	@Pointcut("execution(* com.spring5.aop.pointcutOrder.user.Student.set*(..))")
	public void setterAdvice() {}
	@Pointcut("execution(* com.spring5.aop.pointcutOrder.user.Student.get*(..))")
	public void getterAdvice() {}
	@Pointcut("execution(* com.spring5.aop.pointcutOrder.user.Student.*(..))")
	public void AllMethodsAdvice() {}

}
