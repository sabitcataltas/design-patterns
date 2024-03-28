package com.sabit.design_patterns.abstract_factory.concrete_product;

import com.sabit.design_patterns.abstract_factory.product.Checkbox;

/**
 * Concrete Product
 */
public class WinCheckbox implements Checkbox {

	@Override
	public void check() {

		System.out.println("Win Checkbox check");

	}

}
