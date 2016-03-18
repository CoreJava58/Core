package com.core.model;

public class User {

	private Integer id;
	private String userName;
	private String userAddress;
	private int age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userAddress=" + userAddress + ", age=" + age + "]";
	}
	public User(){}
	public User(Integer id){
		this.id=id;
	}
	public User(Integer id, String userName, String userAddress, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAddress = userAddress;
		this.age = age;
	}
	
	
	
	
}
