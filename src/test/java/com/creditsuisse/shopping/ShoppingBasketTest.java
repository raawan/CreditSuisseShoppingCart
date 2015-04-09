package com.creditsuisse.shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.creditsuisse.shopping.Data.FruitFactory;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.InvalidNumberOfMelonException;

public class ShoppingBasketTest {
	
	ShoppingBasket shoppingBasket;
	
	@Before
	public void setup() {
		
		shoppingBasket = new ShoppingBasket(new FruitFactory());
	}
	
	@After
	public void teatDown() {
		
		shoppingBasket = null;
	}
	
	@Test
	public void givenBasketWithOneAppleTotalCostReturnedShouldBe35p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Apple"};
		assertEquals(35, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoAppleTotalCostReturnedShouldBe70p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Apple","Apple"};
		assertEquals(70, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesAndOneBananaTotalCostReturnedShouldBe90p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple"};
		assertEquals(90, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithTwoApplesTwoMelonsAndOneBananaTotalCostReturnedShouldBe140p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","Melon","Melon"};
		assertEquals(140, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test (expected=InvalidItemException.class)
	public void givenBasketListWithInvalidInputAnInvalidItemExceptionShouldBeThrown() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","invalidItem"};
		shoppingBasket.totalCost(itemsInBasket);
	}
	
	@Test (expected=InvalidNumberOfMelonException.class)
	public void givenBasketWithThreeMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon"};
		shoppingBasket.totalCost(itemsInBasket);
	}
	
	@Test (expected=InvalidNumberOfMelonException.class)
	public void givenBasketWithOneMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Melon"};
		shoppingBasket.totalCost(itemsInBasket);
	}
	
	@Test
	public void givenBasketWithFourMelonsAnInvalidNumberOfMelonTotalCostReturnedShouldBe100p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon","Melon"};
		assertEquals(100, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenEmptyBasketTotalCostReturnedShouldBe0p() throws InvalidNumberOfMelonException, InvalidItemException {
		
		String itemsInBasket[] = {};
		assertEquals(0, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithThreeLimesTotalCostReturnedShouldBe30p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime"};
		assertEquals(30, shoppingBasket.totalCost(itemsInBasket));
	}
	
	@Test
	public void givenBasketWithSixLimesTotalCostReturnedShouldBe30p() throws InvalidItemException, InvalidNumberOfMelonException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Lime","Lime"};
		assertEquals(60, shoppingBasket.totalCost(itemsInBasket));
	}
}
