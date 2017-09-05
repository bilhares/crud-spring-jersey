package br.com.livro.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.livro.domain.Contato;
import br.com.livro.domain.ContatosService;

@Path("/contatos")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Component
public class ContatosResource {
	
	@Autowired
	ContatosService service;

	@GET
	public List<Contato> get() {
		List<Contato> contatos = service.getContatos();
		return contatos;
	}
}
