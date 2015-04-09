package com.creditsuisse.shopping.Data;

import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;
import com.creditsuisse.shopping.exception.InvalidNumberOfMelonException;

public class Limes extends FruitGroup {
	
	public Limes(int totalLimes) {
		
		this.setPrice(FruitPrice.LIME_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_LIMES_TO_BUY_TO_GET_A_FREE_LIME);
		this.setTotalUnits(totalLimes);
	}

	@Override
	public int calculateTotalCostForNunits()
			throws InvalidNumberOfMelonException {
		// TODO Auto-generated method stub
		return 30;
	}

}
