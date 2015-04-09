package com.creditsuisse.shopping.data;

import com.creditsuisse.shopping.constant.FruitDiscount;
import com.creditsuisse.shopping.constant.FruitPrice;

public class Bananas extends FruitGroup implements FruitPrice {
	
	public Bananas(int totalBananas) {
		
		this.setPrice(FruitPrice.BANANA_PRICE);
		this.setTotalUnitsToBuyToGetFreeFruit(FruitDiscount.TOTAL_BANANAS_TO_BUY_TO_GET_A_FREE_BANANA);
		this.setTotalUnits(totalBananas);
	}
	

	@Override
	public int calculateTotalCostForThisFruitGroup() {
		
		return getTotalUnits() * getPrice();
	}
	
}
