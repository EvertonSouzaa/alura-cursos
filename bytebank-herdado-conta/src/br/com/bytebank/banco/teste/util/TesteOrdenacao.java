package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// Mesmo que a classe nao tenha um construtor padrao criado, a jvm cria
		// automaticamente a partir da instanciacao(NEW) da classe.
//		NumeroDaContaComparator comparator = new NumeroDaContaComparator(); // Function Object
//		TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();
		// Para ordenar essa lista, precisamos da interface Comparator, para que seja
		// possivel usar o metodo "compare" que contem na interface.
//		lista.sort(comparator);
//		lista.sort(titularDaContaComparator);
//		lista.sort(new TitularDaContaComparator()); // Forma mais enxuta, mais simples e comum de se ver
		lista.sort(null); // Nao e uma boa pratica passar
		
		// Forma LEGADA de ordenacao no Java 1.7
//		Collections.sort(lista, new NumeroDaContaComparator());
		
//		Collections.sort(lista);
//		Collections.reverse(lista);

		System.out.println("-------------");

		for (Conta conta : lista) {
			System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
		}
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		// 3ª forma
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		// 2ª forma
//		return c1.getNumero() - c2.getNumero();
		
		// 1ª forma
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}
