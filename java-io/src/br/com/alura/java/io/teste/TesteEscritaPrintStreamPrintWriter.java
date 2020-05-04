package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		PrintStream ps = new PrintStream("lorem2.txt");
		// Recomendado usar quando se quer especificar caminhos longos do arquivo
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt"); // outra alternativa

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("asdfasdfs sadfsad dfsdf erwe er e");

		ps.close();
		
		System.out.println();
	}

}
