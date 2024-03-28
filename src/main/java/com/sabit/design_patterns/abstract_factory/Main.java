package com.sabit.design_patterns.abstract_factory;

import com.sabit.design_patterns.abstract_factory.abstract_factory.GUIFactory;
import com.sabit.design_patterns.abstract_factory.concrete_factory.MacFactory;
import com.sabit.design_patterns.abstract_factory.concrete_factory.WinFactory;
import com.sabit.design_patterns.abstract_factory.product.Button;
import com.sabit.design_patterns.abstract_factory.product.Checkbox;

public class Main {

	public static void main(String[] args) {

		class Application {

			private GUIFactory factory;

			private Button button;
			private Checkbox checkbox;

			Application(GUIFactory factory) {
				this.factory = factory;
			}

			void createButton() {
				button = factory.createButton();
			}

			void createCheckbox() {
				checkbox = factory.createCheckbox();
			}

			void clickButton() {
				button.click();
			}

			void checkCheckbox() {
				checkbox.check();
			}
		}

		/*
		 * GUIFactory factory;
		 * 
		 * if (System.getProperty("os.name").toLowerCase().contains("win")) { factory =
		 * new WinFactory(); } else { factory = new MacFactory(); }
		 */
		Application app = new Application(new WinFactory());

		app.createButton();
		app.clickButton();

		app.createCheckbox();
		app.checkCheckbox();

		app = new Application(new MacFactory());

		app.createButton();
		app.clickButton();

		app.createCheckbox();
		app.checkCheckbox();
	}

}
