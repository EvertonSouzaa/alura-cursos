package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int  posicaoLivre;

	public GuardadorDeReferencias() {
		this.referencias = new Object[10]; // Inicializando um array com 10 posicoes
		this.posicaoLivre = 0; // Inicializando uma variavel com 0
	}

	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref; // Array começa com 0
		this.posicaoLivre++; // Incremento do array
	}

	// retorna a quantidade de elementos presentes dentro do array
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
