package com.sabit.design_patterns.factory_method;

import com.sabit.design_patterns.factory_method.concrete_creator.ShipLogisticsCenter;
import com.sabit.design_patterns.factory_method.concrete_creator.TruckLogisticsCenter;
import com.sabit.design_patterns.factory_method.creator.LogisticsCenter;
import com.sabit.design_patterns.factory_method.product.Transport;

public class Main {

	public static void main(String[] args) {

		LogisticsCenter shipLogisticsCenter = new ShipLogisticsCenter();
		Transport ship = shipLogisticsCenter.createTransport();
		ship.deliver();
		
		LogisticsCenter truckLogisticsCenter = new TruckLogisticsCenter();
		Transport truck = truckLogisticsCenter.createTransport();
		truck.deliver();

	}

}
