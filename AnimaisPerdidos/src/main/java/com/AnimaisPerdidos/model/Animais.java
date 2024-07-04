package com.AnimaisPerdidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "animais")
public class Animais {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "SEQ_Animais", sequenceName = "animais", allocationSize = 1)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "RACA")
	private String raca;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "DONO")
	private String dono;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "STATUS")
	private String status;

	public Animais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animais(Long id, String nome, String raca, String descricao, String dono, String telefone, String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.descricao = descricao;
		this.dono = dono;
		this.telefone = telefone;
		this.status = status;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Animais [id=" + id + ", nome=" + nome + ", raca=" + raca + ", descricao=" + descricao + ", dono=" + dono
				+ ", telefone=" + telefone + ", status=" + status + "]";
	}
	
}
