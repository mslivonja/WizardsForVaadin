package org.vaadin.teemu.wizards;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class MyStep implements WizardStep {

	@Override
	public String getCaption() {
		return "My Custom step";
	}

	@Override
	public Component getContent() {
		VerticalLayout content = new VerticalLayout();
		
		content.setSizeFull();
		content.setMargin(true);
		
		Label text = getText();
		content.addComponent(text);
		
		return content;
	}
	
	private Label getText(){
		return new Label("<h3>My custom step :-)", ContentMode.HTML);
	}

	@Override
	public boolean onAdvance() {
		return true;
	}

	@Override
	public boolean onBack() {
		return true;
	}

}
