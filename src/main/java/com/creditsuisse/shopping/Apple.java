package com.creditsuisse.shopping;

public class Apple extends Fruit {
	
	public static final int TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE = 0;
	
	Apple() {
		
		this.setPrice(FruitPrice.APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}
	
}
