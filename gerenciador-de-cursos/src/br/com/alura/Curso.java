package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Classe para agrupar as info dos cursos e tbm para conter as info das aulas
public class Curso {

	// declaracao de variaveis
	private String nome;
	private String instrutor;
	// Lista de aulas
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

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
	
	// metodo para pegar o tempo total do curso
	public int getTempoTotal() {
		int tempoTotal = 0;
		// foreach, para cada aula, o tempo total, vale ele mesmo
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		// Outra forma de fazer usando stream() do Java 8
//		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

}
