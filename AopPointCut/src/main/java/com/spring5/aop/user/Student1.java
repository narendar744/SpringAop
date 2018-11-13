package com.spring5.aop.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.spring5.aop.user.address.Address;
@Component
public class Student1  {
	@Value("${name1}")
	private String name1;
	@Value("${id1}")
	private int id1;
	
	private Address address;
	public String getName1() {
		System.out.println("getter calling....name1");
		return name1;
	}
	public void setName1(String name1) {
		System.out.println("setter calling......name1");
		this.name1 = name1;
	}
	public int getId1() {
		System.out.println("getter calling....Id1");
		return id1;
	}
	public void setId1(int id1) {
		System.out.println("setter calling....Id1");
		this.id1 = id1;
	}
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String studentDetails1() {
		return "Student1 [name1=" + name1 + ", id1=" + id1 + ", address=" + address.getCity() + "]";
	}
	public void message(String name,int id) {
		System.out.println("hey student1(one) wel come "+name+id);
	}
	
}
