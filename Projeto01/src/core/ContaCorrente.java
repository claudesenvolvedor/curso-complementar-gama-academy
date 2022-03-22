package core;

public class ContaCorrente extends Conta {
	public boolean saca(double valor) {
		if (this.getSaldo(0) >= valor) {
			return true;
		}
		else {
			return false;
		}
	}
}