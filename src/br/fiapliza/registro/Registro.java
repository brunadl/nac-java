package br.fiapliza.registro;

import br.fiapliza.cliente.Cliente;
import br.fiapliza.locacao.*;

public class Registro {
	
	// exemplo da sala -> private Aluno[] aluno = new Aluno[3];
	int tamanho;
	private Locacao[] listaLocacao = new Locacao[tamanho];
	private int indice;
	
	public Registro(int tamanho) {
		//super();
		listaLocacao = new Locacao[tamanho];
	}
	
	public void inserir(Locacao locacao) {
		
		if(indice < listaLocacao.length) {
			listaLocacao[indice] = locacao;
			listaLocacao[indice].getCliente().setPontuacao(listaLocacao[indice].getCliente().getPontuacao() + 1);
			
			indice = indice + 1;
		}
		
	}
	 
	public Cliente resgatar() {
		int x = 0;
		Cliente maiorX = null;
		
		for(int i = 0; i < indice; i++) {
			if(listaLocacao[i].getCliente().getPontuacao() > x) {
				x = listaLocacao[i].getCliente().getPontuacao();
				maiorX = listaLocacao[i].getCliente();
			}
		}
		
		return maiorX;
		
	}
	
	public String listar() {
		String aux = "";
		
		for(int i = 0; i < indice; i++) {
			aux += "\nCLIENTE-> " + listaLocacao[i].getCliente().getNome() + " e MARCA-> " + listaLocacao[i].getAutomovel().getMarca();
		}
		
		return aux;
		
	}
	
}
