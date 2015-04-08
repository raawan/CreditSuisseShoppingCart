package com.creditsuisse.shopping;

public class Banana extends Fruit {
	
	Banana(int price,  int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(price);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "banana";
	}

	@Override
	public int calculateCostForNunits(int totalFruits) {
	
		return totalFruits * this.getPrice();
	}
}
