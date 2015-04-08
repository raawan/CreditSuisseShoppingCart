package com.creditsuisse.shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {
	
	ShoppingBasket shoppingBasket;
	
	@Before
	public void setup() {
		
		shoppingBasket = new ShoppingBasket();
	}
	
	@After
	public void teatDown() {
		
		shoppingBasket = null;
	}
	
	@Test
	public void givenBasketWithOneAppleTotalCostReturnedShouldBe35p() {
		
		String itemsInBasket[] = {"Apple"};
		assertEquals(35, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoAppleTotalCostReturnedShouldBe70p() {
		
		String itemsInBasket[] = {"Apple","Apple"};
		assertEquals(70, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesAndOneBananaTotalCostReturnedShouldBe90p() {
		
		String itemsInBasket[] = {"Apple","Banana","Apple"};
		assertEquals(90, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesTwoMelonsAndOneBananaTotalCostReturnedShouldBe140p() {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","Melon","Melon"};
		assertEquals(140, shoppingBasket.totalCost(itemsInBasket));
	}
}
