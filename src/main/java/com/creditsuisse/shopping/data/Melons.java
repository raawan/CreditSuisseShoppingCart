package com.creditsuisse.shopping.data;


import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;

public class Melons extends FruitGroup {
	
	public Melons(int totalMelons) {
		
		this.setPrice(FruitPrice.MELON_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_MELONS_TO_BUY_TO_GET_A_FREE_MELON);
		this.setTotalUnits(totalMelons);
	}
	

	@Override
	public int calculateTotalCostForThisFruitGroup() throws FreeMelonRequiredException {
		
		if(getTotalUnits()%(getTotalUnitsToBuyToGetFreeFruit()+1)!=0){
			throw new FreeMelonRequiredException("There is a free extra melon with every melon. Customer should get one more");
		}
		return (getTotalUnits() /(getTotalUnitsToBuyToGetFreeFruit()+1)) * getPrice();
	}
	
}
