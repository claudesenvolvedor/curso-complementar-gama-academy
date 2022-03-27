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
	public String mostra(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			}
		}
		return "Conta não encontrada";
	}
	public int posicao(int numero) {
		for(int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return i;
			}
		}
return -1;
	}
	public boolean remover(int numero) {
		int posicao = posicao(numero);
if (posicao >= 0) {
	if (contas.remove(posicao) != null) {
		return true;
	}
}
return false;
	}
	
}