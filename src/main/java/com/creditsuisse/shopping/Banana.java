package com.creditsuisse.shopping;

public class Banana extends Fruit implements FruitPrice {
	
	public static final int TOTAL_BANANAS_TO_BUY_TO_GET_A_FREE_BANANA = 0;
	
	Banana() {
		
		this.setPrice(FruitPrice.BANANA_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(TOTAL_BANANAS_TO_BUY_TO_GET_A_FREE_BANANA);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}
	
}
