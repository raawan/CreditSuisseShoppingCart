package com.creditsuisse.shopping;

public class Apple extends Fruit {
	
	public static int APPLE_PRICE = 35;
	
	Apple(int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}

	
}
