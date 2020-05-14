package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class QualColecaoUsar {

	public static void main(String[] args) {

		/**
		 * Collections é uma interface, assim, ela não implementa nada, as outras que a
		 * implementam.
		 * 
		 * Você pode implementar todas essas, dependendo da sua
		 * necessidade: 
		 * 
		 * #Organizadas: LinkedHashSet, ArrayList, Vector, LinkedList,
		 * LinkedHashMap 
		 * 
		 * #Não organizadas: HashSet, TreeSet, PriorityQueue, HashMap,
		 * HashTable, TreeMap
		 * 
		 * #Ordenadas: TreeSet, PriorityQueue, TreeMap
		 * 
		 * #Não ordenadas: HashSet, LinkedHashSet, ArrayList, Vector, LinkedList, HashMap,
		 * HashTable, LinkedHashMap.
		 */

		Collection<Aluno> alunos = new HashSet<>();
//		alunos.add();
		alunos.size();
		
		// -----------------------------------------------------------------------------------------------------------
		
		// As implementações de Collection
		
		// ArrayList é uma classe que implementa List, logo pode ser referenciada pela sua interface.
		List<Aluno> alunos1 = new ArrayList<>();
		
		// Está correto, porém NÃO está se aproveitando do famoso polimorfismo
		ArrayList<Aluno> alunos2 = new ArrayList<>();
		
		// Está correto, e usando BASTANTE seu POLIMORFISMO, declarando o atributo com a "avó", a interface Collection.
		Collection<Aluno> alunos3 = new HashSet<>();
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Qual usar?
		
		// Como um programador deve proceder não sabendo qual das implementações de Collection servirá melhor para o nosso sistema?
		// RESPOSTA: Deve declarar como Collection<Aluno> alunos pois assim poderá mudar mais facilmente de implementação.
		
		/** 
		 * EXPLICAÇÃO: Provavelmente, caso a modelagem do sistema ainda não esteja bem definida, o desenvolvedor irá utilizar a interface Collection<E>. 
		 *  Dessa maneira, terá acesso aos métodos básicos de todas as implementações, como size(), add(), remove() e contains().
		 *  Conforme for sentindo necessidade em algo específico, o desenvolvedor fará poucas mudanças em seu código.
		 *  Caso sinta necessidade de fazer uma requisição a um elemento específico através da sua posição, trocará de Collection<E> para List<E>. 
		 *  Caso perceba que ordem não importa, porém é necessária uma busca bem rápida (e sem repetições), um Set<E> é mais apropriado.
		 *  Enquanto não sentir essa necessidade, provavelmente a Collection<E> será a melhor escolha.
		 *  */
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Qual Coleção?
		
		/**
		 * Você precisa guardar um monte de alunos em uma coleção e precisa decidir qual implementação irá utilizar.
		 * 
		 * Sabemos que:
		 * 
		 * a coleção deve guardar os alunos ordenados pelo número de matrícula
		 * a coleção não pode ter elementos repetidos
		 * 
		 * RESPOSTA: 
		 * 
		 * TreeSet
		 * 
		 * A implementação TreeSet já ordena os seus elementos na hora da inserção. Qual é o critério da ordenação depende e pode ser definido através de um Comparator.
		 */
		
	}

}
