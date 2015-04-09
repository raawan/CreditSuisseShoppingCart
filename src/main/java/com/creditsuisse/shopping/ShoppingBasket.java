package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;

import com.creditsuisse.shopping.Data.FruitFactory;
import com.creditsuisse.shopping.Data.FruitGroup;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;


public class ShoppingBasket {
	
	private List<FruitGroup> fruitGroupList = new ArrayList<FruitGroup>();
	private FruitFactory fruitFactory;
	
	ShoppingBasket(FruitFactory fruitFactory) {
		this.fruitFactory = fruitFactory;
	}
	
	public int totalCost(String[] itemsInBasket) throws FreeMelonRequiredException, InvalidItemException {
		
		createFruitGroupList(itemsInBasket);
		return calculateTotalCostOfBasket();
	}

	private int calculateTotalCostOfBasket() throws FreeMelonRequiredException {
		
		int totalCost = 0;
		for(FruitGroup fruitGroup : fruitGroupList) {
			if(fruitGroup == null) {
				continue;
			} else {
				totalCost += fruitGroup.calculateTotalCostForNunits();
			}
		}
		return totalCost;
	}

	private void createFruitGroupList(String[] itemsInBasket) throws InvalidItemException {
		
		int totalMelons = 0;
		int totalApples = 0;
		int totalBananas = 0;
		int totalLimes = 0;
		
		for(String item : itemsInBasket) {
			item=item.toLowerCase();
			switch(item) {
				case "apple" : 		totalApples++;
									break;
				case "banana": 		totalBananas++;
									break;
				case "melon" : 		totalMelons++;
									break;
				case "lime"	 :		totalLimes++;
									break;
				default		: 	throw new InvalidItemException("Invalid Item In the List");					
			}
		}
		fruitGroupList.add(fruitFactory.createFruitGroup("Apples",totalApples));
		fruitGroupList.add(fruitFactory.createFruitGroup("Bananas",totalBananas));
		fruitGroupList.add(fruitFactory.createFruitGroup("Melons",totalMelons));
		fruitGroupList.add(fruitFactory.createFruitGroup("Limes",totalLimes));
	}

	
}
 