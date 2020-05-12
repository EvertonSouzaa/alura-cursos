package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		// Construtor do Curso que recebe um nome do curso e um instrutor
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
					"Paulo Silveira");

		// Metodo para adicionar novas aulas
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		// Lista de aulas IMUTAVEIS
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		// Lista de aulas MUTAVEIS
		/**
		 * Os construtores das coleçoes podem receber o mesmo tipo para construir um
		 * igual(clone). Esse ArrayList irá receber no construtor o "aulasImutaveis",
		 * que por baixo dos panos o Java irá criar um construtor novo!
		 */
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		// Ordena a lista de aulas
		Collections.sort(aulas);
		System.out.println(aulas);
		// imprime o tempo total das aulas do Curso
		System.out.println(javaColecoes.getTempoTotal());
		
		// Imprime o nome do Curso e o seu tempo total
		System.out.println(javaColecoes);
		
		
	}

}
