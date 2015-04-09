package com.creditsuisse.shopping.data;

import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;

public class Limes extends FruitGroup {
	
	public Limes(int totalLimes) {
		
		this.setPrice(FruitPrice.LIME_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_LIMES_TO_BUY_TO_GET_A_FREE_LIME);
		this.setTotalUnits(totalLimes);
	}

	@Override
	public int calculateTotalCostForNunits()
			throws FreeLimeRequiredException {
		
		if(areTotalLimesInMultipleOfThrees()) {
			return (findHowManyLimeGroupsAreInMulipleOfThrees())*getDoublePrice();
		} else if(IsThereAnExtraLimeAfterGroupingLimesInMultipleOfThrees()) {
			return ((findHowManyLimeGroupsAreInMulipleOfThrees())*getDoublePrice()) + getPrice();
		} else {
			throw new FreeLimeRequiredException("there is a free lime on every two lime bought. ");
		} 
		
	}

	private boolean IsThereAnExtraLimeAfterGroupingLimesInMultipleOfThrees() {
		
		return getTotalUnits()%3 == 1;
	}

	private int getDoublePrice() {
		
		return getPrice()*2;
	}

	private int findHowManyLimeGroupsAreInMulipleOfThrees() {
		
		return getTotalUnits()/3;
	}

	private boolean areTotalLimesInMultipleOfThrees() {
		
		return getTotalUnits()%3 == 0;
	}

}