package com.market.member;

public class UserInIt {
		private static User mUser;
		
		public static void setmuser(User mUser) {
			UserInIt.mUser = mUser;
			
		}
		
		public static void init(String name, int phone) {
			mUser = new User (name, phone);
			
		}
		
		public static User getUser() {
			return mUser;
		}

}
