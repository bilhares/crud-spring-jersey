package br.com.livro.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "contato")
@XmlRootElement
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 55)
	private String nome;

	@Column(nullable = false)
	private String telefone;

	@Column(nullable = false)
	private String email;

	@Lob
	@Column(name = "foto_64")
	private String foto64;

	@Lob
	@Column(name = "qr_code")
	private String qrCode;

	public Contato() {
	}

	public Contato(Long id, String nome, String foto64) {
		this.id = id;
		this.nome = nome;
		this.foto64 = foto64;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto64() {
		return foto64;
	}

	public void setFoto64(String foto64) {
		this.foto64 = foto64;
	}
}
