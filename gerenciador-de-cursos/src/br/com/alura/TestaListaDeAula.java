package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		// Construtor que recebe a(String titulo e int tempo) da classe Aula
		Aula a1 = new Aula("Revisitando as ArraysLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de lista e objetos", 15);

		// ArrayList de OBJETO(Aula)
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		// imprime a lista de aulas
		System.out.println(aulas);

		// ordena a lista de aulas(OBJETOS), graças ao
		// metodo implementado na classe Aula, que foi o compareTo()
		Collections.sort(aulas);
		// imprime a lista ordenada
		System.out.println(aulas);

		// ordena as aulas pelo tempo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		// imprime a lista ordenada pelo tempo
		System.out.println(aulas);
		// outra forma de ordenar pelo tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		
	}

}
