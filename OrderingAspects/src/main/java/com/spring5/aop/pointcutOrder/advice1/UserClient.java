package com.spring5.aop.pointcutOrder.advice1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.aop.pointcutOrder.user.Student;


public class UserClient {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Studentconfig.class);
Student student = context.getBean("student",Student.class);
student.setId(1777);
student.setName("narendar");
student.getName();
student.getId();
System.out.println(student.toString());
student.message();
((AnnotationConfigApplicationContext) context).close();




	}

}
