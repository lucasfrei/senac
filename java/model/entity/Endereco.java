package model.entity;

public class Endereco {
	
	private int id;
	private String rua;
	private String numero;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco() {
	}
	
	public Endereco(String rua, String numero, String cidade, String uf, String cep) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "ENDERECO: " + rua + ", " + numero + " - " + cidade + "/" + uf + " (" + cep + ")";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
