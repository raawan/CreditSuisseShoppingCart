package com.creditsuisse.shopping;

public class Banana extends Fruit implements FruitPrice {
	
	Banana() {
		
		this.setPrice(FruitPrice.BANANA_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_BANANAS_TO_BUY_TO_GET_A_FREE_BANANA);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}
	
}
