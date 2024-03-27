package com.sabit.design_patterns.factory_method.concrete_creator;

import com.sabit.design_patterns.factory_method.concrete_product.ShipTransport;
import com.sabit.design_patterns.factory_method.creator.LogisticsCenter;
import com.sabit.design_patterns.factory_method.product.Transport;

/**
 * Concrete Creator
 */
public class ShipLogisticsCenter extends LogisticsCenter {

	@Override
	public Transport createTransport() {
		return new ShipTransport();
	}

}
