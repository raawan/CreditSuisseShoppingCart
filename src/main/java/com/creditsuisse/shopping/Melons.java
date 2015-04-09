package com.creditsuisse.shopping;

import static com.creditsuisse.shopping.FruitPrice.MELON_PRICE;

public class Melons extends Fruit {
	
	Melons(int melons) {
		
		this.setPrice(FruitPrice.MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON);
		this.setTotalUnits(melons);
	}
	
	@Override
	public String toString() {
		
		return "melon";
	}

	@Override
	public int calculateTotalCostForNunits() throws InvalidNumberOfMelonException {
		
		if(getTotalUnits()%(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON+1)!=0){
			throw new InvalidNumberOfMelonException("There is a free extra melon with every melon. Customer should get one more");
		}
		return (getTotalUnits() /(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON+1)) * MELON_PRICE;
	}
	
}
