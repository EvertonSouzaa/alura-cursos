//Servidor rodando no Tomcat, na porta 8080 que é um server padrão do springboot

package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumApplication {

	//função principal que roda o servidor
	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}