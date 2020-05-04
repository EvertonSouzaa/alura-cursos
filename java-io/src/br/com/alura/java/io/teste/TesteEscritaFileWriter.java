package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt")); // embrulha o FileWriter, forma reduzida
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		// usado para pular linha, porem nao e recomendado, pois tem SO que nao reconhece esse caractere
//		fw.write("\n");
//		bw.write(System.lineSeparator()); // separador de linha (pula linha)
		bw.newLine();
		bw.newLine();
		bw.write("asdfasdf dfdf asd f asd");

		bw.close();

	}

}
