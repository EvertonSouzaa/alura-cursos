package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//faz o gerenciamento da classe
@Controller
public class HelloController {
	//Define a url que quando for requisitada chamara o metodo
	@RequestMapping("/")
	//notação que retorna a String inserida direta para o navegador
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
}
