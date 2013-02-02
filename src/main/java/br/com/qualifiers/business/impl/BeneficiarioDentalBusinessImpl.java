package br.com.qualifiers.business.impl;

import org.springframework.stereotype.Service;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Dental;

@Dental
@Service
public class BeneficiarioDentalBusinessImpl implements BeneficiarioBusiness {

	@Override
	public String buscarPorMarcaOtica() {
		return "111222333";
	}

	@Override
	public String buscarPorCpf() {
		return "12345678910";
	}

}
