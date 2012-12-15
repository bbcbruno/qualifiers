package br.com.qualifiers.main;

import br.com.qualifiers.controller.SaudeController;


public class Main {
	
	public static void main(String[] args) {
		
		SaudeController saudeController = SpringConfig.getSpringContext().getBean(SaudeController.class);
		
		saudeController.index();
		
	}

}
