package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * *
 * *Aluno: Claudeci Alves Pinheiro
 * *
 * *Curso Itaú Formação  Tech Complementar
 * *
 * *Gama Academy
 * *
 * *Professor Emerson Paduan
 * *

 ** @author Clau Pinheiro
 *
 */

@Entity

@Table(name = "teste1")

public abstract class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero")

	private int numero;

	@Column(name = "saldo")

	private double saldo;

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
//fim do construtor padrão

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
//fim do método saca

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

//fim do método deposita

	public int getNumero() {
		return this.numero;
	}

// fim do método getNumero

	public double getSaldo() {
		return this.saldo;
	}
//fim do método getSaldo

	@Override
	public String toString() {
		return numero + "-" + saldo;
	}
}
