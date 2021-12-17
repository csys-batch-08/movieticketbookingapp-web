package com.pojo;

public class User {
      private String user_name ;
      private String gender;
      private String email_id;
      private long mobile_num;
      private String e_password;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}
	public String getE_password() {
		return e_password;
	}
	public void setE_password(String e_password) {
		this.e_password = e_password;
	}
	@Override
	public String toString() {
		return "Mv4project [user_name=" + user_name + ", gender=" + gender + ", email_id="
				+ email_id + ", mobile_num=" + mobile_num + ", e_password=" + e_password + "]";
	}
	public User(String user_name, String gender, String email_id, long mobile_num,
			String e_password) {
		super();
		this.user_name = user_name;
		this.gender = gender;
		this.email_id = email_id;
		this.mobile_num = mobile_num;
		this.e_password = e_password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
      
}