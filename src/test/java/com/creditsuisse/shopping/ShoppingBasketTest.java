package com.creditsuisse.shopping;

import static org.junit.Assert.*;

import org.junit.Test;

import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.InvalidItemException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;

public class ShoppingBasketTest {
	
	
	@Test
	public void givenBasketWithOneAppleTotalCostReturnedShouldBe35p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(35, shoppingBasket.totalCost());
	}
	
	

	private ShoppingBasket constructShoppingBasket(String[] itemsInBasket) throws InvalidItemException {
		
		return new ShoppingBasket(itemsInBasket);
	}

	@Test
	public void givenBasketWithTwoAppleTotalCostReturnedShouldBe70p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Apple"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(70, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithTwoApplesAndOneBananaTotalCostReturnedShouldBe90p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(90, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithTwoApplesTwoMelonsAndOneBananaTotalCostReturnedShouldBe140p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","Melon","Melon"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(140, shoppingBasket.totalCost());
	}
	
	@Test (expected=InvalidItemException.class)
	public void givenBasketListWithInvalidInputAnInvalidItemExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Apple","Banana","Apple","invalidItem"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		shoppingBasket.totalCost();
	}
	
	@Test (expected=FreeMelonRequiredException.class)
	public void givenBasketWithThreeMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		shoppingBasket.totalCost();
	}
	
	@Test (expected=FreeMelonRequiredException.class)
	public void givenBasketWithOneMelonsAnInvalidNumberOfMelonExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		shoppingBasket.totalCost();
	}
	
	@Test
	public void givenBasketWithFourMelonsAnInvalidNumberOfMelonTotalCostReturnedShouldBe100p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Melon","Melon","Melon","Melon"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(100, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenEmptyBasketTotalCostReturnedShouldBe0p() throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(0, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithThreeLimesTotalCostReturnedShouldBe30p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(30, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithSixLimesTotalCostReturnedShouldBe60p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Lime","Lime"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(60, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithSevenLimesTotalCostReturnedShouldBe75p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Lime","Lime","Lime"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(75, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWithOneLimeTotalCostReturnedShouldBe15p() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(15, shoppingBasket.totalCost());
	}
	
	@Test (expected=FreeLimeRequiredException.class)
	public void givenBasketWithTwoLimesAnAdditionalLimeRequiredExceptionShouldBeThrown() throws InvalidItemException, FreeMelonRequiredException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(15, shoppingBasket.totalCost());
	}
	
	@Test
	public void givenBasketWith4Limes2Melons2Bananas2ApplesTotalCostReturnedShould205p() throws FreeMelonRequiredException, InvalidItemException, FreeLimeRequiredException {
		
		String itemsInBasket[] = {"Lime","Lime","Lime","Lime","Melon","Melon","Banana","Banana","Apple","Apple"};
		ShoppingBasket shoppingBasket = constructShoppingBasket(itemsInBasket);
		assertEquals(205, shoppingBasket.totalCost());
	}
}
