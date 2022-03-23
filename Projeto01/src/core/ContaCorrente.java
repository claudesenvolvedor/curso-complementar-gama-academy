package core;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, double saldo) {
	super(numero, saldo);
}

	public boolean saca(double valor) {
if (super.getSaldo(0) >= valor) {
		return true;
		} else {
			return false;
		}
		}

}
//fim do método sacar se tiver saldo em conta superior ou igual ao valor do saque, é permitido sacar!