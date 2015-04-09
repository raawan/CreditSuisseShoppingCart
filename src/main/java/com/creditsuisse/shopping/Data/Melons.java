package com.creditsuisse.shopping.Data;


import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.InvalidNumberOfMelonException;

public class Melons extends FruitGroup {
	
	public Melons(int totalMelons) {
		
		this.setPrice(FruitPrice.MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON);
		this.setTotalUnits(totalMelons);
	}
	

	@Override
	public int calculateTotalCostForNunits() throws InvalidNumberOfMelonException {
		
		if(getTotalUnits()%(getTotalUnitsToBuyToGetFreeFruit()+1)!=0){
			throw new InvalidNumberOfMelonException("There is a free extra melon with every melon. Customer should get one more");
		}
		return (getTotalUnits() /(getTotalUnitsToBuyToGetFreeFruit()+1)) * getPrice();
	}
	
}
