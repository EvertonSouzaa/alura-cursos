package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		// construtor que recebe o arquivo e tipo de encode(UTF-8) desse arquivo
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); 

		// enquanto tiver linhas, imprime
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			// Separando os valores usando SCANNER
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // metodo para nao da excecao de . ou , em diferentes regioes
			linhaScanner.useDelimiter(","); // pattern ou regex para dizer ao scanner as separacoes

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			// Formatação, quando precisar, olhar na DOCUMENTAÇÃO
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo);

			linhaScanner.close();

			// Separando os valores usando SPLIT que recebe um REGEX(expressao regular)
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[3]); // acessa o titular da conta

		}
		scanner.close();

	}

}
