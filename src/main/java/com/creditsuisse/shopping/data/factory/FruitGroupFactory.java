package com.creditsuisse.shopping.data.factory;

import com.creditsuisse.shopping.data.Apples;
import com.creditsuisse.shopping.data.Bananas;
import com.creditsuisse.shopping.data.FruitGroup;
import com.creditsuisse.shopping.data.Limes;
import com.creditsuisse.shopping.data.Melons;
import com.creditsuisse.shopping.data.NullGroup;


public class FruitGroupFactory {
	
	public FruitGroup createFruitGroup(String fruit, int totalUnits) {
		
		if(totalUnits <= 0) {
			return new NullGroup();
		}
		fruit = fruit.toLowerCase();
		switch(fruit) {
			case "apples" 	: return new Apples(totalUnits);
			case "bananas" 	: return new Bananas(totalUnits);
			case "melons"	: return new Melons(totalUnits);
			case "limes"	: return new Limes(totalUnits);
			default			: return new NullGroup();
		}
	}
}
