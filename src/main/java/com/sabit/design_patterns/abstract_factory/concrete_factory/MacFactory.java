package com.sabit.design_patterns.abstract_factory.concrete_factory;

import com.sabit.design_patterns.abstract_factory.abstract_factory.GUIFactory;
import com.sabit.design_patterns.abstract_factory.concrete_product.MacButton;
import com.sabit.design_patterns.abstract_factory.concrete_product.MacCheckbox;
import com.sabit.design_patterns.abstract_factory.product.Button;
import com.sabit.design_patterns.abstract_factory.product.Checkbox;

/**
 * Concrete Factory
 */
public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {

		return new MacButton();
		
	}

	@Override
	public Checkbox createCheckbox() {

		return new MacCheckbox();
	}

}
