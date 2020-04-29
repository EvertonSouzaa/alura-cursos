package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int idade = 29; // Integer
		//Integer idadeRef = new Integer(29); // ISSO ESTA DEPRECIADO, a nova forma sera exibida abaixo:
		// AUTOBOXING
		Integer idadeRef = Integer.valueOf(29); // Nova forma de construir, de criar um objeto
		
		System.out.println(idadeRef.doubleValue()); // transforma um int em double
		
		System.out.println(Integer.MAX_VALUE); // valor maximo de um Integer
		System.out.println(Integer.MIN_VALUE); // valor minimo de um Integer
		
		System.out.println(Integer.SIZE); // um Integer tem 32 bits
		System.out.println(Integer.BYTES); // um Integer tem 4 bytes
		
		// UNBOXING
		int valor = idadeRef.intValue();
		String s = args[0]; // "10"
		// Fazendo dois tipos de PARSING abaixo:
		// Integer numero = Integer.valueOf(s); // Transforma uma STRING em um INTEGER
		int numero = Integer.parseInt(s); // Transforma um INT em um INTEGER
		System.out.println(numero);
		
		// Uma List so sabe guardar REFERENCIAS!
		List<Integer> numeros = new ArrayList<Integer>();
		// Autoboxing = Transforma um tipo primitivo(int) em uma referencia(objeto) Integer
		// Unboxing = Transforma o objeto(Integer) em um tipo primitivo(int)
		// "int" e um TIPO PRIMITIVO
		// "Integer" e um WRAPPER, porque eles embrulham o tipo primitivo, um objeto que guarda o valor do primitivo
		numeros.add(29); // Autoboxing
		
		
	}
	
}
