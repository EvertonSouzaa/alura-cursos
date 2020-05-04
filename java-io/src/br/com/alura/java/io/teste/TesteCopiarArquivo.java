package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {
	
	// STREAMS são dados binários, para quem deseja trabalhar com PDF, imagens etc, se usa INPUTSTREAM e OUTPUTSTREAM

	public static void main(String[] args) throws IOException {
		
		// É como se fosse um telefone, que voce usa para se comunicar com pessoas do outro lado 
//		Socket s = new Socket();

//		InputStream fis = new FileInputStream("lorem.txt"); // ARQUIVO
		// Telefone de entrada
//		InputStream fis = s.getInputStream(); // REDE
		// Usado para escrever atraves do teclado
		InputStream fis = System.in; // TECLADO
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

//		OutputStream fos = new FileOutputStream("lorem2.txt"); // ARQUIVO
		// Telefone de saida
//		OutputStream fos = s.getOutputStream(); // REDE
		// Usado para exibir a saida no console
		OutputStream fos = System.out; // CONSOLE
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		// enquanto a linha for diferente de null, escreva E tambem nao deveria ser vazia!
		// se for TRUE escreve, se for FALSE para o programa
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			// usado para dar uma descarga, ou seja, conforme for escrevendo o 
			// conteudo escrito apos dar enter, ja vai sendo exibido
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
