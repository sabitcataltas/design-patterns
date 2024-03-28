package com.sabit.design_patterns.abstract_factory.concrete_product;

import com.sabit.design_patterns.abstract_factory.product.Checkbox;

/**
 * Concrete Product
 */
public class MacCheckbox implements Checkbox {

	@Override
	public void check() {

		System.out.println("Mac Checkbox check");

	}

}
