package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int  posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10]; // Inicializando um array com 10 posicoes
		this.posicaoLivre = 0; // Inicializando uma variavel com 0
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref; // Array começa com 0
		this.posicaoLivre++; // Incremento do array
	}

	// retorna a quantidade de elementos presentes dentro do array
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
