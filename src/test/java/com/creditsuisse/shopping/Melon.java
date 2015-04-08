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
		
		if(totalFruits>=2) {
			return (totalFruits /2) * this.getPrice();
		}
		return 0;
	}
}
