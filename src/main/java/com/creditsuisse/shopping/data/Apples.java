package com.creditsuisse.shopping.data;


import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;

public class Apples extends FruitGroup {
	
	public Apples(int totalApples) {
		
		this.setPrice(FruitPrice.APPLE_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_APPLES_TO_BUY_TO_GET_A_FREE_APPLE);
		this.setTotalUnits(totalApples);
	}
	

	@Override
	public int calculateTotalCostForNunits() {
		
		return getTotalUnits()* getPrice();
	}
	
}
