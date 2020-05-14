package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		// Construtor que cria um novo Curso e Instrutor
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		// Metodo para adicionar novas aulas
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		// Criando novos alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);

		// Matriculando os alunos
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matricula 5617?");
		// Devolve um aluno de Aluno
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Características dos mapas
		
		/** 
		 * - Se repetimos uma chave, a chave repetida é sobrescrita pela nova.
		 * Se uma chave for repetida, a antiga permanece, porém, o valor é 
		 * sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.
		 * 
		 * - A interface Map mapeia valores para chaves, ou seja, através da chave conseguimos acessar o valor.
		 * Ela funciona da seguinte maneira, mapeia valores para chaves, e através da chave conseguimos acessar
		 * o valor correspondente. Por isso ela não pode ser repetida, ao contrário do valor, que podem existir iguais.
		 */
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Adicionando elementos em um mapa
		
		/** 
		 * Vimos que para adicionar um elemento em uma lista ou conjunto, utilizamos o método add.
		 * Mas por não implementar a interface Collection, ele não possui este método add. 
		 * Qual método utilizamos para adicionar um elemento em um Map?
		 * 
		 * PUT
		 * 
		 * O método utilizado para adicionar um elemento em um Map é o método put. Ele recebe dois parâmetros, a chave e o valor. 
		 * Os tipos desses parâmetros dependem do que definimos na hora da instância do objeto.
		 * Por exemplo, abaixo criamos um Map que recebe como chave a matrícula do aluno e como valor o seu nome:
		 * */
		Map<Integer, String> matriculaParaAluno = new HashMap<>();
		matriculaParaAluno.put(123456, "Leonardo Cordeiro");
		// Então no put, nós temos que receber como parâmetro um inteiro, que representa a matrícula, e uma String, que representa o nome do aluno.
			
		// -----------------------------------------------------------------------------------------------------------
			
		// Iterando sobre um mapa
		
		/**
		 * No código abaixo, temos um Map preparado que associa uma pessoa com a sua idade. Sabendo que temos acesso ao conjunto
		 * de chaves de um Map através do método keySet(), implemente um código que itere por esse conjunto e imprima os seus valores.
		 * 
		 *  import java.util.HashMap;
			import java.util.Map;
			
			public class Exercicio {
			
			    public static void main(String[] args) {
			
			        Map<Integer, String> pessoas = new HashMap<>();
			
			        pessoas.put(21, "Leonardo Cordeiro");
			        pessoas.put(27, "Fabio Pimentel");
			        pessoas.put(19, "Silvio Mattos");
			        pessoas.put(23, "Romulo Henrique");
			        //...
			    }
			}
		 */
		
		// RESPOSTA:
		
		// Podemos utilizar o forEach do Java 8 para iterar pelo conjunto de chaves que é retornado pelo método keySet().
		// Depois, para cada chave idade, nós pegamos o seu valor através do método get e imprimimos:
		
		/**
		 *  public class Exercicio {

		    public static void main(String[] args) {
		
		        Map<Integer, String> pessoas = new HashMap<>();
		
		        pessoas.put(21, "Leonardo Cordeiro");
		        pessoas.put(27, "Fabio Pimentel");
		        pessoas.put(19, "Silvio Mattos");
		        pessoas.put(23, "Romulo Henrique");
		
		        pessoas.keySet().forEach(idade -> {
		            System.out.println(pessoas.get(idade));
		        });
		
		    }
		}
		 */
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Garantindo a ordem de inserção de um mapa
		
		// Assim como o HashSet, o HashMap não mantém a ordem de inserção dos seus elementos.
		// Mas há uma implementação de Map que garante essa ordem de inserção para nós, que implementação é essa?
		
		// RESPOSTA: 
		// O LinkedHashMap continua nos dando a performance de um HashMap, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.
		
		// -----------------------------------------------------------------------------------------------------------
		
		// Para saber mais: CHAVES e VALORES
		
		/**
		 *  Segundo o JavaDoc, um Map também pode ser visto como se fossem de 3 coleções:
			The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings.
			Ou seja, temos uma coleção de chaves, uma coleção de valores, e uma coleção das associações. O interessante é que podemos acessar cada uma das coleções. Vamos tentar?
			No editor abaixo já temos um Map preparado que associa o nome do aluno com a idade.
			Para acessar apenas as chaves use o método keySet() do Map. Para acessar os valores existe o método values().
			Tente iterar (foreach) em cima das chaves e valores separadamente!

			import java.util.*;
			import java.util.Map.Entry;
			
			public class TesteMap {
			
			    public static void main(String[] args) {
			
			        Map<String, Integer> nomesParaIdade = new HashMap<>();
			        nomesParaIdade.put("Paulo", 31);
			        nomesParaIdade.put("Adriano", 25);
			        nomesParaIdade.put("Alberto", 33);
			        nomesParaIdade.put("Guilherme", 26);
			        // ...
			    }
			}
			
			-----------------------------------------------------------------------
			Para acessar as chaves devemos executar:

			Set<String> chaves = nomesParaIdade.keySet();    
			for (String nome : chaves) {
			    System.out.println(nome);
			}
			E para pegar os valores usamos:
			
			Collection<Integer> valores = nomesParaIdade.values();
			for (Integer idade : valores) {
			    System.out.println(idade);
			}
			Agora só falta a terceira coleção que devolve a associação. Para tal, existe o método entrySet() e cada associação é representado através da classe Entry:
			
			Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
			Repare que o método devolve um Set de Entry (respire fundo!!). Para acessar essa coleção basta usar o foreach:
			
			Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
			for (Entry<String, Integer> associacao : associacoes) {
			    System.out.println(associacao.getKey() + " - " + associacao.getValue());
			}
		 */
		
	}

}
