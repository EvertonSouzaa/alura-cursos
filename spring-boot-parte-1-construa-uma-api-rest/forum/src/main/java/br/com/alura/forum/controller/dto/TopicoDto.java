package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.model.Topico;

public class TopicoDto {
	//declaração dos atributos que irá ser devolvido, não há classes de domínio aqui
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriaçao;
	
	//método Construtor
	public TopicoDto(Topico topico) {
		//na hora que der "new" nessa classe, passa o topico e do topico acessas as informaçoes, sendo assim não precisa de Setters
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriaçao = topico.getDataCriacao();
	}
	
	
	//métodos Getters
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriaçao() {
		return dataCriaçao;
	}

	//método que encapsula(converte de Topico para TopicoDto)
	//Dto dados que saem da API para o cliente
	public static List<TopicoDto> converter(List<Topico> topicos) {
		/**
		 * pega o stream do java 8, faz um map do Topico para TopicoDto,
		 * função do mapeamento usa o '::new' que vai chamar o construtor que recebe o proprio topico como parametro,
		 * método collect(Collectors..) usado para coletar todos os elementos de Stream em uma instância de List.
		 * 
		 * */
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	
	
}
