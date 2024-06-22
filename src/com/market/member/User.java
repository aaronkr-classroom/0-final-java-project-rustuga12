package com.market.member;

public class User {
	private static User mUser;
	


	public static void setmUser(User mUser) {
		User.mUser = mUser;
	}
	
	public static void init(String name, int phone) {
		mUser = new User(name, phone);
	}


	public static User getmUser() {
		return mUser;
	}
}