package com.spring5.aop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAdvice {
	
	  @Before("execution(public String studentDetails1())") 
	  public void message1() {
	  System.out.println("1  =======>>>>>>>>messgage1 :execution(public String studentDetails1())");
	  }
	 
		// modifiers are optional..so remove public
	 
	
	  @Before("execution(String studentDetails1())") 
	  public void message2() {
		  System.out.println("2  =======>>>>>>>>messgage2 :execution( String studentDetails1())");
	  }
	 

	  //return type should be anything. Use "*" instead of String
	 
	
	  @Before("execution(* studentDetails1())") 
	  public void message3() { 
		  System.out.println("3  =======>>>>>>>>messgage3 :execution( String studentDetails1())");
		  }
	 
	  		//return type should be anything and method name start with letter s
	 

	@Before("execution(* s*())")
	public void message4() {
		System.out.println("4  =======>>>>>>>>messgage4 :execution(* s*)" ); }
	
	
	// with in the same package all methods and all classes
	
	@Before("execution(* com.spring5.aop.user.*.*(..))")
	public void message5() {
		System.out.println("5  =======>>>>>>>>messgage5 :execution(* com.spring5.aop.user.*.*(..))");
	}
	
	// with in the same package all methods and only on Student1 class any number of parameters
	@Before("execution(* com.spring5.aop.user.Student1.*(..))")
	public void message6() {
		System.out.println("6  =======>>>>>>>>messgage6 :execution(* com.spring5.aop.user.*.*(..))");
	}
	
	// with in the same package all methods and only on Student1 class and one argument any type
	@Before("execution(* com.spring5.aop.user.Student1.*(*))")
	public void message7() {
		System.out.println("7  =======>>>>>>>>messgage6 :execution(* com.spring5.aop.user.Student1.*(*))");
	}
	
	
	// with in the same package all methods and only on Student2 class any number of parameters
	@Before("execution(* com.spring5.aop.user.Student2.*(..))")
	public void message8() {
		System.out.println("8  =======>>>>>>>>messgage7 :execution(* com.spring5.aop.user.Student2.*(..))");
	}
	
	// with in the same package all methods and only on Student2 class and one argument any type
		@Before("execution(* com.spring5.aop.user.Student2.*(*))")
		public void message9() {
			System.out.println("9  =======>>>>>>>>messgage6 :execution(* com.spring5.aop.user.Student2.*(*))");
		}
	
	
}
