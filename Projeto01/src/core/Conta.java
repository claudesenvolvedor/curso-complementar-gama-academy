package core;

public abstract class Conta {

	private int numero;
	private double saldo;

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
//fim do construtor padr�o

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
//fim do m�todo saca

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

//fim do m�todo deposita

	public int getNumero() {
		return this.numero;
	}

// fim do m�todo getNumero

	public double getSaldo() {
		return this.saldo;
	}
//fim do m�todo getSaldo

	@Override
	public String toString() {
		return numero + "-" + saldo;
	}
}

//defini��o explicita da super class no construtor padr�o