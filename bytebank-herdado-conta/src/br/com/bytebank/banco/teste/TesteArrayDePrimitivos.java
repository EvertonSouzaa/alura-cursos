package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	// Array []
	public static void main(String[] args) {

//		int idades[];
		// inicializa o array com 0
		int[] idades = new int[5]; // array com cinco posicoes
		
//		idades[0] = 29; // posicao 0 inicializada agora com o valor 29
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//		int idade1 = idades[4];
//		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
				
	}

}
