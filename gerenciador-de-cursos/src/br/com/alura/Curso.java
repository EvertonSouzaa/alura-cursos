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
	
	// Usando LinkedHashSet a ordem dos alunos sera da mesma
	// forma que foram adicionados, mas mesmo assim,
	// nao e possivel acessar o index deles
	// O LinkedHashSet nos dá a performance de um HashSet
	// mas com acesso previsível e ordenado.
//	private Set<Aluno> alunos = new LinkedHashSet<>();
	
	// TreeSet só funciona se a classe que no qual ele sera usado,
	// implementa o Comparable. Ele tbm tem um construtor que recebe
	// um comparator, como alternativa para ordenaçao.
//	private Set<Aluno> alunos = new TreeSet<>();
	
	/**
	 * Como se lê: TreeSet(Comparator<? super E> comparator)
	 * O Javadoc apresenta o atributo do construtor dessa forma. Gostaria de saber como se lê isso, mais especificamente essa parte: <? super E> .
	 * 
	 * RESPOSTA:
	 * Esse conceito é chamado de Generics dentro da linguagem.
	 *
	 * O "?" significa qualquer tipo e o "super E" significa que que seja igual ou pai de E. Por sua vez, o E é informado pelo programador que for usar a classe TreeSet através do <>:
	 *
	 * Set<String> s = new TreeSet<>; // Meu "E" é String nesse caso
	 * 
	 * Para o exemplo acima, meu comparator precisa ser "qualquer tipo que seja igual a String ou pai de String".
	 */
	
	// HashSet trabalha com TABELA DE ESPALHAMENTO
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
	
	// imprime de forma elegante o objeto Curso
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "]";
	}

	// metodo para matricular um aluno
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	// metodo para pegar o conjunto de alunos imutaveis
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// metodo que verifica se o aluno esta matriculado
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	

}
