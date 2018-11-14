package com.spring5.aop.pointcutOrder.user;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	private int id;
	public String getName() {
		System.out.println("student getter method calling for name="+name);
		return name;
	}
	public void setName(String name) {
		System.out.println("student setter method calling for name="+name);
		this.name = name;
	}
	public int getId() {
		System.out.println("student getter method calling for id ="+id);
		return id;
	}
	public void setId(int id) {
		System.out.println("student setter method calling for id="+id);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public void message() {
		System.out.println("this is aop pointcut aspect orderring application...");
	}
	

}
