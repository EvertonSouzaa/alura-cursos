package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		// SET é um CONJUNTO e NÃO uma lista.
		// Interface Set, não podemos dar NEW em Interface, então
		// daremos NEW na sua implementação mais usada HashSet<>().
//		Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();
		// adição de varios alunos, porem ele nao sao imprimidos na ordem
		// em que foram adicionados, pois Set é um conjunto, uma sacola,
		// entao nao temos garantia da sequencia dos dados.
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		// esse aluno sao sera exibido ou contado se usar
		// o metodo size(), pois o Set NÃO ACEITA elementos duplicados.
		alunos.add("Alberto Souza");

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);

		// Imprime a quantidade de alunos presentes no CONJUNTO
		System.out.println(alunos.size());

		// imprime os alunos de forma semelhante com uma List
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		// outra forma de imprime os alunos de forma semelhante
		// a uma List, porem usando expressão Lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		// imprime o CONJUNTO de alunos
		System.out.println(alunos);
		
		// Método sort() só ACEITA LISTA, ele nao é aplicavel a  Set ou Collection
//		Collections.sort(alunos);

		// Caso eu precise ordernar esses SET ou COLLECTION, utilizamos uma List<> e instanciamos
		// um ArrayList<>(), passando em seu construtor o Set ou Collection  que deseja ordenar!
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista.get(3));

	}

}
