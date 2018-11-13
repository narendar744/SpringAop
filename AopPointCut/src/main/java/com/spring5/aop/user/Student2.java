package com.spring5.aop.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring5.aop.user.address.Address;
@Component
public class Student2 {
	@Value("${name2}")
	private String name2;
	@Value("${id2}")
	private int id;
	@Autowired
	private Address address2;
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	public String studentDetails2() {
		return "Student2 [name2=" + name2 + ", id=" + id + ", address2=" + address2.getCity() + "]";
	}
	public void message(String greeting) {
		System.out.println("hey student2(two) wel come "+greeting);
	}
}
