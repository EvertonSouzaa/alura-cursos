package br.com.alura;

public class Aluno {

	// declaraçao de variaveis
	private String nome;
	private int numeroMatricula;

	// construtor
	public Aluno(String nome, int numeroMatricula) {
		// condição que verifica se o nome é nulo
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	// getters
	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// SEMPRE QUE SOBREESCREVER O METODO "EQUALS",
	// É NECESSÁRIO SOBREESCREVER TAMBÉM O METODO "HASHCODE"
	// sobreescrevendo o metodo equals, para comparar
	// se os dois objeto Aluno tem o mesmo NOME
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	// SEMPRE QUE SOBREESCREVER O METODO "HASHCODE",
	// É NECESSÁRIO SOBREESCREVER TAMBÉM O METODO "EQUALS"
	// metodo que devolve o hashCode da String nome
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	// sobreescrevendo o metodo toString, para imprimir o objeto Aluno de forma elegante
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	

}
