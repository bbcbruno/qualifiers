package br.com.qualifiers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Dental;

@Controller
public class DentalController {

	@Dental
	@Autowired
	private BeneficiarioBusiness beneficiarioBusiness;

	public DentalController() {
	}
	
	public void index(){
		beneficiarioBusiness.buscarPorMarcaOtica();
	}
	
}
