package com.creditsuisse.shopping;

public class Apple extends Fruit {

	Apple(int price, int totalUnitsToBuyToGetFreeFruit) {
		
		this.setPrice(price);
		this.setTotalUnitsToBuyToGetFreeFruit(totalUnitsToBuyToGetFreeFruit);
	}
	
	@Override
	public String toString() {
		
		return "apple";
	}

	@Override
	public int calculateCostForNunits(int totalFruits) {
		// TODO Auto-generated method stub
		return 0;
	}
}
