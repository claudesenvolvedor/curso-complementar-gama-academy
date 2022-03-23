package util;

import java.util.ArrayList;

import core.Conta;

public class GerenciaContas {

	private ArrayList<Conta> contas;
	public GerenciaContas() {
		contas = new ArrayList<>();
		
	}
	
	//fim do ArrayList
	
	public void adicionarConta(Conta c) {
		contas.add(c);
		
	}
	/*
	public String exibir(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if(contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			}
		}
		return "não encontrado";
	}
	*/
	
	private  int posicao(int numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(contas.get(numero).getNumero(i) == numero) {
				return i;
			}
		}
		return -1;
	}
	//retorna -1 se não achar
	
	public boolean remover(int codigo) {
        int posicao = posicao(codigo);
        if (posicao >= 0) { // se achou
            if (contas.remove(posicao) != null) {
                return true;
            }
        }
        return false;
    }
}
