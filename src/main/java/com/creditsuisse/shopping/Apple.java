package com.creditsuisse.shopping;

public class Apple extends Fruit {
	
	public static int APPLE_PRICE = 35;
	public static int TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE = 0;
	
	Apple() {
		
		this.setPrice(APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}
	
}
