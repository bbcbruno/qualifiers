package br.com.qualifiers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Saude;

@Controller
public class SaudeController {
	
	@Saude
	@Autowired
	private BeneficiarioBusiness beneficiarioBusiness;

	public SaudeController() {
	}
	
	public void index(){
		beneficiarioBusiness.buscarPorMarcaOtica();
	}

}
