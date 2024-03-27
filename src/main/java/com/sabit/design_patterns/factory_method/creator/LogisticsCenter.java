package com.sabit.design_patterns.factory_method.creator;

import com.sabit.design_patterns.factory_method.product.Transport;

/**
 * Creator
 */
public abstract class LogisticsCenter {

	public abstract Transport createTransport();
	
}
