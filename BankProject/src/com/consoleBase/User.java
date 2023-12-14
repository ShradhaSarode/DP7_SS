package com.consoleBase;

public class User
{
	private String userName;
	private long aadharNum;
	private String panCardNum;
	private String email;
	private long phoneNum;
	private String address;
	private String password;
	public User() {
		super();
		
	}
	public User(String userName, long aadharNum, String panCardNum, String email, long phoneNum, String address,
			String password) {
		super();
		this.userName = userName;
		this.aadharNum = aadharNum;
		this.panCardNum = panCardNum;
		this.email = email;
		this.phoneNum = phoneNum;
		this.address = address;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getPanCardNum() {
		return panCardNum;
	}
	public void setPanCardNum(String panCardNum) {
		this.panCardNum = panCardNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "[userName=" + userName + ", aadharNum=" + aadharNum + ", panCardNum=" + panCardNum + ", email="
				+ email + ", phoneNum=" + phoneNum + ", address=" + address + ", password=" + password + "]";
	}
}
