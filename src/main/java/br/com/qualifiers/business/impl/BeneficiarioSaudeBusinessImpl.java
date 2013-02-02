package br.com.qualifiers.business.impl;

import org.springframework.stereotype.Service;

import br.com.qualifiers.business.BeneficiarioBusiness;
import br.com.qualifiers.business.annotation.Saude;

@Saude
@Service
public class BeneficiarioSaudeBusinessImpl implements BeneficiarioBusiness {

	@Override
	public String buscarPorMarcaOtica() {
		return "123456789";
	}

	@Override
	public String buscarPorCpf() {
		return "00000001406";
	}

}
