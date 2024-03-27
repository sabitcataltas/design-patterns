package com.sabit.design_patterns.factory_method.concrete_product;

import com.sabit.design_patterns.factory_method.product.Transport;

/**
 * Concrete product
 */
public class ShipTransport implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by Ship");
	}
	
}
