package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// int[] idades = new int[5];
		// Conta[] contas = new Conta[5]; // Array de REFERENCIA, o valor padrao de uma referencia e NULL, nao foi criada nenhuma conta!
		
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11); // ContaCorrente criada, cc1 é uma referencia que aponta para ContaCorrente
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22); // Mais uma ContaCorrente criada
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		// System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//	
//		System.out.println(((Conta) referenciaGenerica).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
//		ContaCorrente ref = (ContaCorrente) contas[1]; // Erro de casting java.lang.ClassCastException
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
//		System.out.println(ref);
		
	}
	
}
