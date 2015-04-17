package com.creditsuisse.shopping;

import java.util.List;

import com.creditsuisse.shopping.data.FruitGroup;
import com.creditsuisse.shopping.data.factory.FruitGroupFactory;
import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;


public class ShoppingBasket {
	
	private final List<FruitGroup> fruitGroups;
	
	private int totalCost;
	
	public ShoppingBasket(String[] itemsInBasket) throws InvalidItemException {
		
		fruitGroups = groupSimilarFruitsAndReturnAllGroupsInList(itemsInBasket);
	}
	

	public int totalCost() throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		for(FruitGroup fruitGroup : fruitGroups) {
				totalCost += fruitGroup.calculateTotalCostForThisFruitGroup();
		}
		return totalCost;
	}


	private List<FruitGroup> groupSimilarFruitsAndReturnAllGroupsInList(
			String[] itemsInBasket) throws InvalidItemException {
		
		return new ShoppingBasketHelper(new FruitGroupFactory()).createFruitGroupList(itemsInBasket);
	}

	public List<FruitGroup> getFruitGroups() {
		return fruitGroups;
	}


	public int getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

}
 