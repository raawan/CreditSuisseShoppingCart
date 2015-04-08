package com.creditsuisse.shopping;

public class FruitFactory {
	
	public Fruit createFruit(String fruit) {
		
		fruit = fruit.toLowerCase();
		switch(fruit) {
			case "apple" 	: return new Apple();
			case "banana" 	: return new Banana();
			case "melon"	: return new Melon();
			default			: return null;//ToDo : Null Object
		}
	}
}
