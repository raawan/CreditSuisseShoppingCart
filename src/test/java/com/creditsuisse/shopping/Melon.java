package com.creditsuisse.shopping;

public class Melon extends Fruit {
	
	Melon(int price, int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(price);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}

	@Override
	public int calculateCostForNunits(int totalFruits) {
		// TODO Auto-generated method stub
		return 0;
	}
}
