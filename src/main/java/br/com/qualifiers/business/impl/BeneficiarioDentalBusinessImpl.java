package br.com.qualifiers.business.impl;

import org.springframework.stereotype.Service;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Dental;

@Dental
@Service
public class BeneficiarioDentalBusinessImpl implements BeneficiarioBusiness {

	@Override
	public void buscarPorMarcaOtica() {
		System.out.println("Beneficiario Dental Marca Otica");
	}

	@Override
	public void buscarPorCpf() {
		System.out.println("Beneficiario Dental Cpf");		
	}

}
