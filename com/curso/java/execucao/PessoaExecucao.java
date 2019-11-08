package com.curso.java.execucao;

import com.curso.java.Pessoa;
import com.curso.java.PessoaTeste;

public class PessoaExecucao {

	public static void main(String[] args) {

		PessoaTeste pessoaTeste = new PessoaTeste();
		
		pessoaTeste.imprimePessoa();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(2);
		pessoa.setNome("Vinícius");
		pessoa.setCpf("00000000000");
		
		pessoaTeste.imprimePessoa(pessoa);
		
		Pessoa pessoaB = pessoaTeste.retornaPessoa();
		
		if(pessoaB != null) {
			System.out.println("É diferente de nulo");
			pessoaTeste.imprimePessoa(pessoaB);
		} else {
			System.out.println("É nulo");
		}
	}

}
