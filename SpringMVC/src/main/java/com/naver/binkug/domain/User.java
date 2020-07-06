package com.naver.binkug.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	private String phone;
	private int age;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	
	
	
}
