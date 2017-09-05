package br.com.livro.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContatosService {
	@Autowired
	private ContatoDAO db;

	// Lista todos os Contatos do banco de dados
	public List<Contato> getContatos() {
		List<Contato> contatos = db.getContatos();
		return contatos;
	}

}
