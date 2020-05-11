package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		// Construtor para criar um Curso
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		// unmodifiableList nao irá permitir adicionar uma aula dessa forma
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		// somente assim sera possivel adicionar uma aula
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		// Uma lista generica, nao sabemos se é uma ArrayList ou LinkedList
		List<Aula> aulas = javaColecoes.getAulas();

		// imprime as aulas presente no Curso
		System.out.println(javaColecoes.getAulas());

		// ArrayList
		/**
		 * Usa algo parecido como um Array de aulas internamente, ela irá conseguir
		 * inserir elementos muito rapido no final, faz buscas de uma forma muito
		 * rapida. Porém ela tem um PROBLEMA grave, caso necessite deletar um elemento
		 * em uma posicao, como por exemplo, um array de 10 posicoes, se removermos o
		 * elemento do index 8, o da posicao 9 ocupa a posicao do 8, e o 10 ocupa a
		 * posicao do 9, em uma lista grande, isso seria um problema de PERFORMANCE.
		 * 
		 */
		
		Aula[] array;

		// LinkedList
		/**
		 * Consegue modificar e remover elementos de uma forma muito rapida, o unico
		 * PROBLEMA de uma LinkedList, é caso você precise acessar um elemento na
		 * posicao 1000 por exemplo, ele iria contar de 0 ate 1000 para pegar esse
		 * elemento, o que nao e uma boa performance.
		 */

	}

}
