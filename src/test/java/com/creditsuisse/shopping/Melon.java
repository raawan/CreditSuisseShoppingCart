package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	Melon(int price) {
		
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}
}
