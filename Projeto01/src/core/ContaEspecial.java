package core;


public class ContaEspecial extends Conta {
	private double limite;

	public boolean saca(double valor) {
if(this.getSaldo(valor) + limite <= valor) {
return true;
			}
			else {
				return false;
			}

}
	@Override
	public String toString() {
		return super.toString() + "R$" + limite;
	}
}