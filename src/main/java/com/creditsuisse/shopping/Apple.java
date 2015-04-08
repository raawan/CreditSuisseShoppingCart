package com.creditsuisse.shopping;

public class Apple extends Fruit {
	
	Apple() {
		
		this.setPrice(FruitPrice.APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}
	
}
