package com.sabit.design_patterns.factory_method.concrete_creator;

import com.sabit.design_patterns.factory_method.concrete_product.TruckTransport;
import com.sabit.design_patterns.factory_method.creator.LogisticsCenter;
import com.sabit.design_patterns.factory_method.product.Transport;

/**
 * Concrete Creator
 */
public class TruckLogisticsCenter extends LogisticsCenter {

	@Override
	public Transport createTransport() {
		return new TruckTransport();
	}

}
