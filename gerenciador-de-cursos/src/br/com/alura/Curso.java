package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe para agrupar as info dos cursos e tbm para conter as info das aulas
public class Curso {

	// declaracao de variaveis
	private String nome;
	private String instrutor;
	// Lista de aulas
	private List<Aula> aulas = new ArrayList<Aula>();

	// construtor
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	// getters
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {

		/**
		 * retorna uma "copia" ou algo "imutavel" unmodifiableList devolve outra lista,
		 * mas que seria apenas "ReadOnly", ou seja, ela é apenas de leitura, metodos
		 * como ADD ou REMOVE nao serao permitidos. Caso tente usar o ADD ou REMOVE,
		 * será lançara uma Exception do tipo java.lang.UnsupportedOperationException.
		 * Caso queria adicionar, tera que usar o metodo adiciona() feito logo abaixo
		 */

		return Collections.unmodifiableList(aulas);
	}

	// metodo para adicionar uma aula ao Curso
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

}