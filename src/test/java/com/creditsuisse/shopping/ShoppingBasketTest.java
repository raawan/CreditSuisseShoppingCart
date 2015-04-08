package com.creditsuisse.shopping;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingBasketTest {

	@Test
	public void givenBasketWithOneAppleTotalCostReturnedShouldBe35p() {
		
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		String itemsInBasket[] = {"Apple"};
		assertEquals(35, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoAppleTotalCostReturnedShouldBe70p() {
		
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		String itemsInBasket[] = {"Apple","Apple"};
		assertEquals(70, shoppingBasket.totalCost(itemsInBasket));
	}
}
