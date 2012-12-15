package br.com.qualifiers.business.impl;

import org.springframework.stereotype.Service;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Saude;

@Saude
@Service
public class BeneficiarioSaudeBusinessImpl implements BeneficiarioBusiness {

	@Override
	public void buscarPorMarcaOtica() {
		System.out.println("Beneficiario Saude Marca Otica");
	}

	@Override
	public void buscarPorCpf() {
		System.out.println("Beneficiario Saude Cpf");
	}

}
