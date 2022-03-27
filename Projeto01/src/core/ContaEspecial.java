package core;

public class ContaEspecial extends Conta {
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