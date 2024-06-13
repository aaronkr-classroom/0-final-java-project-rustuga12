package com.market.cart;

public class Cart {
	public class Cart implements CartInterface {
		public ArrayList<CartItem> mCartItem = new ArrayList<CartItem> ();
		public static int mCartCount = 0;
	}
	public Cart() {
		
	}
}
