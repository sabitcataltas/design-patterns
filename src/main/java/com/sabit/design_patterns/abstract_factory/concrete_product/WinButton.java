package com.sabit.design_patterns.abstract_factory.concrete_product;

import com.sabit.design_patterns.abstract_factory.product.Button;

/**
 * Concrete Product
 */
public class WinButton implements Button {

	@Override
	public void click() {

		System.out.println("Win Button click");

	}

}
