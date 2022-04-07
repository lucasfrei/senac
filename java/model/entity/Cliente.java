package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private List<LinhaTelefonica> linhas;
	
	public Cliente() {
		super();
	}
	
	

	public Cliente(String nome, String cpf, Endereco endereco, List<LinhaTelefonica> linhas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.linhas = linhas;
	}
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.linhas = new ArrayList<LinhaTelefonica>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<LinhaTelefonica> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<LinhaTelefonica> linhas) {
		this.linhas = linhas;
	}

	@Override
	public String toString() {
		return nome + " - " + cpf + " (" + linhas.size() + " linha(s))";
	}
}
