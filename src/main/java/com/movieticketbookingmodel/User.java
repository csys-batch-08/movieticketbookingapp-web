package com.movieticketbookingmodel;

public class User {
	private int userid;
	private String username;
	private String gender;
	private String emailid;
	private long mobilenum;
	private String epassword;
	private int wallet;

	public int getwallet() {
		return wallet;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getEpassword() {
		return epassword;
	}

	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", gender=" + gender + ", emailid=" + emailid
				+ ", mobilenum=" + mobilenum + ", epassword=" + epassword + ", wallet=" + wallet + "]";
	}

	public User(String username, String gender, String emailid, long mobilenum, String epassword) {
		super();
		this.username = username;
		this.gender = gender;
		this.emailid = emailid;
		this.mobilenum = mobilenum;
		this.epassword = epassword;
	}

	public User(String username, String emailid, String epassword) {
		super();
		this.username = username;
		this.emailid = emailid;
		this.epassword = epassword;
	}

	public User(String username, int userId, String emailid, String epassword) {
		super();
		this.username = username;
		this.userid = userId;
		this.emailid = emailid;
		this.epassword = epassword;
	}

	public User(int userId) {

		this.userid = userId;

	}

	public User(int userid, int wallet) {
		super();
		this.userid = userid;

		this.wallet = wallet;
	}

	public User(int userid, String username, String gender, String emailid, long mobilenum, String epassword,
			int wallet) {
		super();
		this.userid = userid;
		this.username = username;
		this.gender = gender;
		this.emailid = emailid;
		this.mobilenum = mobilenum;
		this.epassword = epassword;
		this.wallet = wallet;

	}

	public User(int wallet, String email) {

		this.wallet = wallet;
		this.emailid = email;
	}

	public User(String email1, String password) {

		this.emailid = email1;
		this.epassword = password;
	}

	public User(String username) {

		this.username = username;
	}

	public User(String username, String gender, String emailid, long mobilenum, String epassword, int wallet) {
		super();

		this.username = username;
		this.gender = gender;
		this.emailid = emailid;
		this.mobilenum = mobilenum;
		this.epassword = epassword;
		this.wallet = wallet;
	}

	public User(String username, int userid, String gender, String emailid, long mobilenum, String epassword,
			int wallet) {
		this.username = username;
		this.userid = userid;
		this.gender = gender;
		this.emailid = emailid;
		this.mobilenum = mobilenum;
		this.epassword = epassword;
		this.wallet = wallet;

	}

	public User(String email, long mobilenum) {
		this.emailid = email;
		this.mobilenum = mobilenum;

	}

}