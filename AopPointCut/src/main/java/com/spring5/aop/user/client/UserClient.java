package com.spring5.aop.user.client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.aop.user.Student1;
import com.spring5.aop.user.Student2;

public class UserClient {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Userconfig.class);
Student1 s1= context.getBean("student1",Student1.class);
Student2 s2= context.getBean("student2",Student2.class);


System.out.println(s1.studentDetails1());
s1.setId1(111);
s1.setName1("narendar");
s1.getId1();
s1.getName1();
System.out.println(s2.studentDetails2());

	}

}
