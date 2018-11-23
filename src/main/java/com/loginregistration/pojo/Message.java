package com.loginregistration.pojo;

public class Message {
	
	String name;
	String age;
	/**
	 * @param name
	 * @param age
	 */
	public Message(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
