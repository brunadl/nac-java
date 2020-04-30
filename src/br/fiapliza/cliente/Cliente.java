package br.fiapliza.cliente;

public class Cliente {

	private String cpf;
	private String nome;
	private int pontuacao;
	
	public Cliente(String cpf, String nome) {
		//super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getDados() {
		String aux = "";
		
		aux += "CPF-> " + cpf;
		aux += "\nNome-> " + nome;
		aux += "\nPontuação->  " + pontuacao;
		
		return aux;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
