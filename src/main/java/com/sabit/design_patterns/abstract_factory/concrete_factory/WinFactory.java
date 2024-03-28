package com.sabit.design_patterns.abstract_factory.concrete_factory;

import com.sabit.design_patterns.abstract_factory.abstract_factory.GUIFactory;
import com.sabit.design_patterns.abstract_factory.concrete_product.WinButton;
import com.sabit.design_patterns.abstract_factory.concrete_product.WinCheckbox;
import com.sabit.design_patterns.abstract_factory.product.Button;
import com.sabit.design_patterns.abstract_factory.product.Checkbox;

/**
 * Concrete Factory
 */
public class WinFactory implements GUIFactory {

	@Override
	public Button createButton() {

		return new WinButton();

	}

	@Override
	public Checkbox createCheckbox() {

		return new WinCheckbox();

	}

}
