package com.creditsuisse.shopping;

public class Bananas extends FruitGroup implements FruitPrice {
	
	Bananas(int totalBananas) {
		
		this.setPrice(FruitPrice.BANANA_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_BANANAS_TO_BUY_TO_GET_A_FREE_BANANA);
		this.setTotalUnits(totalBananas);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}

	@Override
	public int calculateTotalCostForNunits() {
		
		return getTotalUnits() * BANANA_PRICE;
	}
	
}
