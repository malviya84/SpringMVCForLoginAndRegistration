package com.loginregistration.pojo;

public class User {
	
	String userFname;
	String userLname;
	String userEmail;
	String userMobileNumber;
	String userAge;
	String userAddress;
		
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		/**
	 * @param userFname
	 * @param userLname
	 * @param userEmail
	 * @param userMobileNumber
	 * @param userAge
	 * @param userAddress
	 */
	public User(String userFname, String userLname, String userEmail, String userMobileNumber, String userAge,
			String userAddress) {
		super();
		this.userFname = userFname;
		this.userLname = userLname;
		this.userEmail = userEmail;
		this.userMobileNumber = userMobileNumber;
		this.userAge = userAge;
		this.userAddress = userAddress;
	}


	public String getUserFname() {
		return userFname;
	}
	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}
	public String getUserLname() {
		return userLname;
	}
	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	

}
