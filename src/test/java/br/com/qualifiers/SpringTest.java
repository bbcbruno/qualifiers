package br.com.qualifiers;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.qualifiers.base.TestCase;
import br.com.qualifiers.controller.DentalController;
import br.com.qualifiers.controller.SaudeController;

public class SpringTest extends TestCase {
	
	@Autowired
	private SaudeController saudeController;
	
	@Autowired
	private DentalController dentalController;
	
	@Test
	public void deveExibirMarcaOticaSaude(){
		Assert.assertNotNull(saudeController.exibirMarcaOtica());
	}
	
	@Test
	public void deveExibirMarcaOticaDental(){
		Assert.assertNotNull(dentalController.exibirMarcaOtica());
	}

}
