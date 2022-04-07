package model.entity;

public class Telefone {
	
	//Constantes
	public static int TIPO_FIXO = 1;
	public static int TIPO_MOVEL = 2;

	private int id;
	private String ddd;
	private String numero;
	private int tipo; 
	private boolean ativo;
	
	public Telefone() {
		this.tipo = TIPO_FIXO;
	}
	
	public Telefone(String ddd, String numero, int tipo, boolean ativo) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "(" + this.ddd + ") " + numero + " [" + (this.tipo == TIPO_FIXO ? "ATIVO" : "NÃO ATIVO") + "]"; 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
