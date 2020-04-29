package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		// Sub-strings são partes de uma String
		// Sobrecarga é quando o método contém mais de uma variação, eles contém o mesmo nome porém variam nos parâmetros.
		
		// CONCEITO FUNDAMENTAL DA CLASSE String, uma vez que você criar, inicializar uma String, essa String não muda mais,
		// ela nasce e morre da mesma forma, era não pode ser alterada, é o famoso conceito de IMUTABILIDADE.
		String nome = "Alura"; // object literal
		//String outro = new String("Alura");
		
		
		// "" vazio, isEmpty? true
		// " " cheio isEmpty? false
		
		//String vazio = " ";
		String vazio = "	Alura	";
		String outroVazio = vazio.trim(); // trim() remove os espaços em branco
		String vazioDois = vazio.trim();
		
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.contains("Alu")); // contains() pergunta se existe esses caracteres
		System.out.println(vazioDois);
		
		// Devolve a quantidade de caracteres que a String contém 
		System.out.println(nome.length());
		
		// Laço que imprime Alura em forma de coluna
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		// Devolve as strings após a posição 1
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		// Devolve a posição da String
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		// Método charAt, retorna a posição do caractere
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		// char é apenas um único caractere
//		char c = 'A';
//		char d = 'a';		
//		String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
