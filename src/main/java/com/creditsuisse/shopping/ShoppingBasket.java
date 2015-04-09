package com.creditsuisse.shopping;

import java.util.List;

import com.creditsuisse.shopping.data.FruitGroup;
import com.creditsuisse.shopping.data.FruitGroupFactory;
import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;


public class ShoppingBasket {
	
	public int totalCost(String[] itemsInBasket) throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		return calculateTotalCostOfBasket(itemsInBasket);
	}

	private int calculateTotalCostOfBasket(String[] itemsInBasket) throws FreeMelonRequiredException, FreeLimeRequiredException, InvalidItemException {
		
		int totalCost = 0;
		for(FruitGroup fruitGroup : groupSimilarFruitsAndReturnAllGroupsInList(itemsInBasket)) {
			if(fruitGroup == null) {
				continue;
			} else {
				totalCost += fruitGroup.calculateTotalCostForNunits();
			}
		}
		return totalCost;
	}

	private List<FruitGroup> groupSimilarFruitsAndReturnAllGroupsInList(
			String[] itemsInBasket) throws InvalidItemException {
		
		return new ShoppingBasketHelper(new FruitGroupFactory()).createFruitGroupList(itemsInBasket);
	}

}
 