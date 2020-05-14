package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
	
	// Map, vai mapear, dado um numero inteiro, um aluno correspondente!
	// dado uma matricula, me devolva um aluno
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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
		// adiciona um aluno ao Set de Aluno
		this.alunos.add(aluno);
		// pega o mapa, e coloca uma relação entre o numero de matricula do aluno, com ele mesmo!
		// a KEY(chave) sera o numero de matricula, e o VALUE(valor) será o aluno!
		// PUT serve para adicionar elementos a um Map!
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	// metodo para pegar o conjunto de alunos imutaveis
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// metodo que verifica se o aluno esta matriculado
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		// Se esse matriculaParaAluno (!)NÃO CONTÉM esse numero, jogue uma Exception
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("Matricula não encontrada " + numero);
		return matriculaParaAluno.get(numero);
		
		/**
		// Retorna a chave(KEY) que esta sendo mapeada ou ou NULL
		// (comportamento padrão do Map) caso nao encontre o valor passado!
		return matriculaParaAluno.get(numero);
		*/
		
		/**
		// Para cada aluno existente
		for (Aluno aluno : alunos) {
			// Verifica se o codigo de matricula é igual ao numero que foi passado!
			if (aluno.getNumeroMatricula() == numero) {
				// Se der TRUE, retorna o aluno
				return aluno;
				// Se der FALSE, vai para o próximo, próximo...
			}
		}
		// E no final, caso nao encontre, dará NULL
		// É UMA BOA PRÁTICA EVITAR O null, ele deve ser um retorno RARO!
//		return null;
		// Para NÃO retornar NULL, jogaremos(lançamos) uma Exception
		throw new NoSuchElementException("Matricula não encontrada " + numero);
		*/
		
	}
	
	

}
