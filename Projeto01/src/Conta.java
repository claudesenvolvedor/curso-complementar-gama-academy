
public class Conta {

	private int numero;
	private double saldo;

	// construtor padr�o 
	public Conta() {
this.numero = numero;
this.saldo = 0; 
	}
	// final do construtor

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
System.out.println("n�o deu");
			return false;
		}
		}// fim do m�todo sacar

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}// final do m�todo depositar

	public int getNumero(int numero) {
		return this.numero;
	}// final do m�todo get n�mero

	public double getSaldo(double saldo) {
		return this.saldo;
	}// final do m�todo get saldo

	
}// final da classe