package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Esses 3 objetos representam um padrao em Java
		
		// PADRAO DECORATOR
		
		// Fluxo de Entrada com um Arquivo
		// Exceção checked FileNotFoundException pode ser lançada pelo
		// construtor da classe FileInputStream caso o arquivo cujo nome é informado não exista.
		// Essa classe so tem metodos que devolvem um int, 
		// teremos que usar outra classe para resolver o problema
//		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = new FileInputStream("lorem.txt"); // POLIMORFISMO, tipo mais generico, ja que FileInputStream é uma herança de InputStream
		// Classe que transforma os bits e bytes em caracter
//		InputStreamReader isr = new InputStreamReader(fis);
		Reader isr = new InputStreamReader(fis); // POLIMORFISMO, tipo mais generico, ja que InputStreamReader é uma herança de Reader
		// Classe que ajuda a melhorar o InputStreamReader
		BufferedReader br = new BufferedReader(isr); // Apesar desta classe ser um Reader, ela nao possui o metodo readline()
		
		// Stream .... input stream of bytes...
		// Reader .... reading character streams...
		
		String linha = br.readLine();
		
		// enquanto houve conteudo, leia o arquivo
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		// fecha o BufferedReader e todas as outras classes(FileInputStream, InputStreamReader).
		br.close(); 
		
	}

}
