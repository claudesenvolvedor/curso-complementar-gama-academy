package util;

import java.util.ArrayList;

import core.Conta;

public class GerenciaContas {
	private ArrayList<Conta> contas;
	
	public GerenciaContas() {
		contas = new ArrayList<>();
		
	}
	public void adicionar(Conta c) {
		contas.add(c);
		
	}

	public String busca(int numero) {
	for(int i = 0; i < contas.size(); i++ ) {
		if(contas.get(i).getNumero(0) == numero) {
			return contas.get(i).toString();
		}
	}
	return "A Conta Não foi encontrada";
	}
	//método privado para fazer uma busca na Array list por  posição por pessoa
	
	private int posicao(int numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(contas.get(i).getNumero(0) == numero) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	public boolean remover(int numero) {
		int posicao= posicao(numero);
		if(posicao >= 0) {
			if(contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;

	}
	
	
	//fim da class 
	//GerenciaContas
	
}
