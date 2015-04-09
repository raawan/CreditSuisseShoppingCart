package com.creditsuisse.shopping;

import static com.creditsuisse.shopping.FruitPrice.APPLE_PRICE;

public class Apples extends Fruit {
	
	Apples(int totalApples) {
		
		this.setPrice(FruitPrice.APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE);
		this.setTotalUnits(totalApples);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}

	@Override
	public int calculateTotalCostForNunits() {
		
		return getTotalUnits()* APPLE_PRICE;
	}
	
}
