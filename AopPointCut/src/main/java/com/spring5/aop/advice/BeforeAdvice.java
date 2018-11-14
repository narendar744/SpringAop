package com.spring5.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAdvice {
	@Pointcut("execution(* com.spring5.aop.*.*.*(..))")
	private void expression() {
	}

	@Before("expression()")
	public void message1() {
		System.out.println("1  =======>>>>>>>>messgage1 :dummy message");
	}

	// reusing advice....
	@Before("expression()")
	public void message2() {
		System.out.println("2  =======>>>>>>>>messgage2 :dummy message 2");
	}

	/*
	 * combine advice using AND, OR NOT
	 *
	 */
	
	
	//setter advice
	@Pointcut("execution(* com.spring5.aop.*.*.set*(..))")
	private void setadvice() {
	}

	//getter advice
	@Pointcut("execution(* com.spring5.aop.*.*.get*(..))")
	private void getadvice() {
	}

	@Pointcut("expression() && !(setadvice()|| getadvice())")
	private void noSetterGetter() {
	}

	@Before("noSetterGetter()")
	public void nosetterAndGetter() {
		System.out.println("3  =======>>>>>>>>messgage3 : advice applying on all methods except getter and setter");
	}
	
}
