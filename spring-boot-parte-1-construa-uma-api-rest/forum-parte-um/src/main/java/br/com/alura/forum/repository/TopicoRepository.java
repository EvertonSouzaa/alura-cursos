package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

/* interface TopicoRepository herda(herança, ganha tudo -->) da interface JpaRepository.
 * <1º qual é a entidade? , 2º qual é o tipo do atributo(chave primária, id)?>
 */
public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	
}

/**
 * Em outras palavras o JPA proporciona meios de armazenar os dados
 * presentes nos objetos implementados no sistema desenvolvido
 * dentro das entidades no banco de dados. 
 *
 */