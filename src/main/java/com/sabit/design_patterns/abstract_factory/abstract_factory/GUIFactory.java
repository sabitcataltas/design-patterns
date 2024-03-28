package com.sabit.design_patterns.abstract_factory.abstract_factory;

import com.sabit.design_patterns.abstract_factory.product.Button;
import com.sabit.design_patterns.abstract_factory.product.Checkbox;

/**
 * Abstract Factory
 */
public interface GUIFactory {

	public Button createButton();

	public Checkbox createCheckbox();

}
