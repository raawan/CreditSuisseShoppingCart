package com.creditsuisse.shopping.Data;

import static com.creditsuisse.shopping.constant.FruitPrice.MELON_PRICE;

import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.InvalidNumberOfMelonException;

public class Melons extends FruitGroup {
	
	public Melons(int melons) {
		
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
