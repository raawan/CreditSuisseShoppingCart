package com.creditsuisse.shopping;

public class Apple extends Fruit {

	Apple(int price) {
		
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}
}
