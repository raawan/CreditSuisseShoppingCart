package com.creditsuisse.shopping;

import java.util.ArrayList;
import java.util.List;

import com.creditsuisse.shopping.data.FruitGroup;
import com.creditsuisse.shopping.data.factory.FruitGroupFactory;
import com.creditsuisse.shopping.exception.InvalidItemException;

public class ShoppingBasketHelper {
	
	private FruitGroupFactory fruitFactory;
	
	ShoppingBasketHelper(FruitGroupFactory fruitFactory) {
		
		this.fruitFactory = fruitFactory;
	}

	public List<FruitGroup> createFruitGroupList(String[] itemsInBasket) throws InvalidItemException {
		
		List<FruitGroup> fruitGroupList = new ArrayList<FruitGroup>();
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
		
		return fruitGroupList;
	}
}
