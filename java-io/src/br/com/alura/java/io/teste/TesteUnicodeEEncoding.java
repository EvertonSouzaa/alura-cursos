package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

//		String s = "C";
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252"); // forçando o tipo de charset
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US-ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bts = s1.getBytes(utf8);
		String s2 = new String(bts, utf8);
		System.out.println(s2);
		
	}

}
