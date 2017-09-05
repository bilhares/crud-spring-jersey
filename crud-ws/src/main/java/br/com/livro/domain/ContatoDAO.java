package br.com.livro.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component
public class ContatoDAO {

	@PersistenceContext
	private EntityManager manager;

	// Consulta todos os contatos
	public List<Contato> getContatos() {
		TypedQuery<Contato> query = manager.createQuery("from Contato", Contato.class);
		return query.getResultList();
	}
}
