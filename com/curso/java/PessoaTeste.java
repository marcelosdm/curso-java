package com.curso.java;

public class PessoaTeste {

	/**
	 * Este método contém informações de Pessoas
	 */
	public void imprimePessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setCpf("11111111111");
		pessoa.setNome("Marcelo");
		
		System.out.println(String.format("[%s] Meu nome é %s, e meu CPF é %s", pessoa.getId(), pessoa.getNome(), pessoa.getCpf()));
	}
	
	/**
	 * Este método imprime os dados passados por parâmetro
	 * @param pessoa
	 */
	public void imprimePessoa(Pessoa pessoa) {
		System.out.println(String.format("[%s] Meu nome é %s, e meu CPF é %s", pessoa.getId(), pessoa.getNome(), pessoa.getCpf()));
	}
	
	/**
	 * Este método retorna uma pessoa
	 * @return
	 */
	public Pessoa retornaPessoa() {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(3);
		pessoa.setCpf("33333333333");
		pessoa.setNome("Lívia");
		
		return pessoa;
		
//		if (1==1) {
//			return pessoa
//		} else {
//			return pessoa;
//		}

	}
	
}
