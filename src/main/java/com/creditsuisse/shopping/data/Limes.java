package com.creditsuisse.shopping.data;

import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.FreeLimeRequiredException;

public class Limes extends FruitGroup {
	
	public Limes(int totalLimes) {
		
		this.setPrice(FruitPrice.LIME_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_LIMES_TO_BUY_TO_GET_A_FREE_LIME);
		this.setTotalUnits(totalLimes);
	}

	@Override
	public int calculateTotalCostForThisFruitGroup()
			throws FreeLimeRequiredException {
		
		if(areTotalLimesInMultipleOfThrees()) {
			return calculateCostOnLimesWhichAreInMultipleOfThrees();
		} else {
			return calculateCostOnExtraLimesInAdditionToLimesWhichAreMultipleOfThrees();
		}
	}

	private int calculateCostOnLimesWhichAreInMultipleOfThrees() {
		
		return findHowManyLimeGroupsAreInMulipleOfThrees()*getDoublePrice();
	}

	private int calculateCostOnExtraLimesInAdditionToLimesWhichAreMultipleOfThrees() throws FreeLimeRequiredException {
		
		if(IsThereAnExtraLimeAfterGroupingLimesInMultipleOfThrees()) {
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
