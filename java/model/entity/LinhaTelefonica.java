package model.entity;

import java.time.LocalDateTime;

public class LinhaTelefonica {
	
	private int id;
	private Telefone telefone;
	private int idCliente; //para evitar looping
	private LocalDateTime dataAtivacao; 
	private LocalDateTime dataDesativacao;
	
	public LinhaTelefonica() {
	}

	public LinhaTelefonica(int id, Telefone telefone, int idCliente, LocalDateTime dataAtivacao,
			LocalDateTime dataDesativacao) {
		super();
		this.id = id;
		this.telefone = telefone;
		this.idCliente = idCliente;
		this.dataAtivacao = dataAtivacao;
		this.dataDesativacao = dataDesativacao;
	}
	
	public LinhaTelefonica(Telefone telefone, int idCliente, LocalDateTime dataAtivacao,
			LocalDateTime dataDesativacao) {
		super();
		this.telefone = telefone;
		this.idCliente = idCliente;
		this.dataAtivacao = dataAtivacao;
		this.dataDesativacao = dataDesativacao;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public LocalDateTime getDataAtivacao() {
		return dataAtivacao;
	}

	public void setDataAtivacao(LocalDateTime dataAtivacao) {
		this.dataAtivacao = dataAtivacao;
	}

	public LocalDateTime getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(LocalDateTime dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "LinhaTelefonica [id=" + id + ", telefone=" + telefone + ", idCliente=" + idCliente + ", dataAtivacao="
				+ dataAtivacao + ", dataDesativacao=" + dataDesativacao + "]";
	}
}
