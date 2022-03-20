
public class Conta {

	private int numero;
	private double saldo;

	// construtor padrão 
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
System.out.println("não deu");
			return false;
		}
		}// fim do método sacar

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}// final do método depositar

	public int getNumero(int numero) {
		return this.numero;
	}// final do método get número

	public double getSaldo(double saldo) {
		return this.saldo;
	}// final do método get saldo

	
}// final da classe