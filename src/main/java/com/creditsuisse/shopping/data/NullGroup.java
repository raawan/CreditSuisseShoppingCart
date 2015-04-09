package com.creditsuisse.shopping.data;

import com.creditsuisse.shopping.exception.FreeLimeRequiredException;
import com.creditsuisse.shopping.exception.FreeMelonRequiredException;

public class NullGroup extends FruitGroup {

	@Override
	public int calculateTotalCostForThisFruitGroup() throws FreeMelonRequiredException,
			FreeLimeRequiredException {
		return 0;
	}

}
