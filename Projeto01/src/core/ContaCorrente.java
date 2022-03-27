package core;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);

	}

	public boolean saca(double valor) {
		if (getSaldo() >= valor) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " : " + " : ";
	}

}
//fim do método sacar se tiver saldo em conta superior ou igual ao valor do saque, é permitido sacar!
