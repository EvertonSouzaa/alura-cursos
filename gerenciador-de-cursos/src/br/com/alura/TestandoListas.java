package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		// declaracao de variaveis
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// instancia o ArrayList para utilizacao de sua referencia "aulas"
		ArrayList<String> aulas = new ArrayList<>();
		// adiciona aulas a essa lista
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// imprime todas as aulas
		System.out.println(aulas);

		// deleta a aula da primeira posicao(indice)
		aulas.remove(0);

		// imprime as aulas, sem a que foi removida
		System.out.println(aulas);

		/**
		 * como ler esse "foreach", para cada string aula dentro de aulas, faça o
		 * seguinte ---> System.out.println("Aula: " + aula);
		 */
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// atraves da referencia "aulas", usamos o metodo get() para
		// o algum valor da lista
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + "\"" + primeiraAula + "\"");

		// size() devolve quantos elementos tem dentro da lista, é diferente do .length
		// as coleçoes sempre usarao o metodo size(), este for vai percorrer
		// todo o array, pegando todas as aulas atraves do loop e do metodo get()
		for (int i = 0; i < aulas.size(); i++) {
			// imprime a lista de valores presentes na lista
			System.out.println("aula : " + aulas.get(i));
		}

		// imprime o tamanho da lista
		System.out.println("O tamanho da sua lista é " + aulas.size());

		/**
		 * método "forEach", ele performa uma acao para cada elemento dentro desse
		 * Interable, recebendo uma "action" que vem de uma interface chamada
		 * "Consumer". Mas nesse caso iremos passar um LAMBDA, "PARA CADA aula QUE ESTA
		 * DENTRO DE aulaS, EXECUTE ISSO --> System.out.println("Percorrendo :"+ aula);"
		 */
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula - " + aula);
		});
		
		// similar com o "forEach"(metodo) acima!!
//		for (String aula : aulas) {
//			System.out.println("Aula: " + aula);
//		}
		
		// adiciona mais uma aula
		aulas.add("Aumentando nosso conhecimento");
		// imprime as aulas inclusive a adicionada por ultimo
		System.out.println(aulas);
		// Classe que serve(dentre outras funcionalidades) para ordenar uma lista
		// ela contem varios metodos estático(static) para trabalhar com coleçoes
		// Ele vai ordenar de acordo com as String(Lexografica) ordem alfabetica
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: ");
		// imprime a lista ordenadamente
		System.out.println(aulas);
		
		

	}

}
