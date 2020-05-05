package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		String nome = "Nico Steppat";

		// Grava um arquivo binário no HD
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		// Faz a leitura de um arquivo binário e o transforma em uma String
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome =(String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		/*
		 *  A é a criação de um objeto a partir de um um fluxo binário de dados
		 *	B é a transformação de um objeto em um fluxo binário
		 *	
		 *	O item A é binário -> objeto, que é a desserialização.
		 *	
		 *	O item B é objeto -> binário, que é a serialização.
		 */
		
	}

}
