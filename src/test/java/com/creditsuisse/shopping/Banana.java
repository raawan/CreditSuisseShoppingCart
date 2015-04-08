package com.creditsuisse.shopping;

public class Banana extends Fruit {
	
	Banana(int price) {
		
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}
}
