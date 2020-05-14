package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

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
		
		// Matriculando os alunos
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		// #### CÓDIGO LEGADO ou ANTIGO ####
		
		// ITERATOR, é um OBJETO que todas as coleções dão acesso, e serve
		// para iterar os objetos, as referencias que estao dentro da sacola!
		// Adiciona os dados sem uma ordem especifica!
		Set<Aluno> alunos = javaColecoes.getAlunos();
		// Toda COLEÇÃO tem iterators!!
		Iterator<Aluno> iterador = alunos.iterator();
		// Enquanto esse iterador de alunos tem um proximo para ler, me devolve o proximo!
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		// Vector trabalha com THREAD SAFE, ele consegue adicionar
		// varios elementos ao mesmo tempo, de forma segura!
		Vector<Aluno> vetor = new Vector<>();
		
		// #### FIM CÓDIGO LEGADO ou ANTIGO ####
		
		// JAVA 1.6, percorrendo um Set - Java for-each Loop (Enhanced for Loop)
//		for (Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		// Imprime os alunos e seus numeros de matricula
		// Este for percorre todos os alunos!!!
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
		// chama o metodo booleano usando o contains() para verificar se o aluno esta matriculado
		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		// matriculando um novo aluno atraves do construtor
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		// Se dois objetos são EQUALS eles PRECISAM ter o mesmo HASHCODE,
		// caso ao contrário, eles não irão funcionar!
		System.out.println(a1.equals(turini));
		
		// obrigatoriamente o seguinte é true
		System.out.println(a1.hashCode() == turini.hashCode());
	}

}
