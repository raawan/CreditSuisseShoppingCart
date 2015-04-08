package com.creditsuisse.shopping;

public class Banana extends Fruit {
	
	public static int BANANA_PRICE = 20;
	
	Banana(int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(BANANA_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}

	
}
