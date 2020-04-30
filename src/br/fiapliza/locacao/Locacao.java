package br.fiapliza.locacao;

import br.fiapliza.automovel.*;
import br.fiapliza.cliente.*;

public class Locacao {

	
	private String data;
	private Automovel automovel;
	private Cliente cliente;
	
	public Locacao(String data, Automovel automovel, Cliente cliente) {
		//super();
		this.data = data;
		this.automovel = automovel;
		this.cliente = cliente;
	}

	public Locacao(Automovel automovel, Cliente cliente) {
		//super();
		data = "30/04/2020";
		this.automovel = automovel;
		this.cliente = cliente;
	}
	
	public String getDados() {
		String aux = "";
		
		aux += "Data -> " + data;
		aux += "\nAutomovel-> " + automovel;
		aux += "\nCliente->  " + cliente;
		
		return aux;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
