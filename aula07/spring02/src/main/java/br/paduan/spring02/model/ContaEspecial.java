package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "teste2")

public class ContaEspecial extends Conta {

	@Column(name = "limite")

	private double limite;

	public ContaEspecial(int numero, double saldo, int limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public boolean saca(double valor) {
		if (getSaldo() + this.limite < limite) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return super.toString() + "R$" + limite;
	}
}