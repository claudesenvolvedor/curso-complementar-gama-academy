package core;

public abstract class Conta {

	private int numero;
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

//definição explicita da super class no construtor padrão