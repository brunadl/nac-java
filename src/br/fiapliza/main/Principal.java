package br.fiapliza.main;

import br.fiapliza.automovel.Automovel;
import br.fiapliza.cliente.Cliente;
import br.fiapliza.locacao.Locacao;
import br.fiapliza.registro.Registro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registro registro = new Registro(5);
		
		Cliente[] cliente = new Cliente[6];
		//
		cliente[0] = new Cliente("123.456.789-10", "Selmini");
		cliente[1] = new Cliente("789.456.123-10", "Parducci");
		cliente[2] = new Cliente("147.258.369-56", "Patricia");
		cliente[3] = new Cliente("369.258.147-45", "Ismael");
		cliente[4] = new Cliente("357.241.689-9-19", "Paulo Sampaio");
		cliente[5] = new Cliente("753.986.124-91", "Pinho");
		
		Automovel[] automovel = new Automovel[6];
		//
		automovel[0] = new Automovel("BRA 3R52", "Dodge", "Journey");
		automovel[1] = new Automovel("BEE 4R22", "Chevrolet", "Zafira");
		automovel[2] = new Automovel("RIO 2A18", "Mitsubishi", "Space Wagon");
		automovel[3] = new Automovel("BRA 0S17", "Ford", "Ka");
		automovel[4] = new Automovel("BRA 2E19", "Hyundai", "Creta");
		automovel[5] = new Automovel("AOB 1CD2", "Volvo",  "XC90");

		Locacao[] locacao = new Locacao[6];
		//
		locacao[0] = new Locacao(automovel[0], cliente[0]);
		locacao[1] = new Locacao(automovel[1], cliente[1]);
		locacao[2] = new Locacao(automovel[2], cliente[2]);
		locacao[3] = new Locacao(automovel[3], cliente[3]);
		locacao[4] = new Locacao(automovel[4], cliente[4]);
		locacao[5] = new Locacao(automovel[5], cliente[5]);

		registro.inserir(locacao[0]);
		registro.inserir(locacao[1]);
		registro.inserir(locacao[2]);
		registro.inserir(locacao[3]);
		registro.inserir(locacao[4]);
		registro.inserir(locacao[5]);
		
		System.out.println("CLIENTE COM MAIOR PONTUAÇÃO: ");
		System.out.println(registro.resgatar().getDados());
		// 
		System.out.println("-----------------------------\n");
		System.out.print("LISTA DE CLIENTES E RESPECTIVOS CARROS: ");
		System.out.println(registro.listar());
	}

}
