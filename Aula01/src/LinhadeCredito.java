import java.util.Scanner;

public class LinhadeCredito {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double salarioBruto;
		double valorParcela;
		double limitedaParcela;

		System.out.println("Informe o valor do sal�rio R$ :");
		salarioBruto = teclado.nextDouble();

		System.out.println("Informe o valor da parcela do financiamento R$ : ");
		valorParcela = teclado.nextDouble();

		limitedaParcela = salarioBruto * 0.3;

		if (valorParcela < limitedaParcela) {
			System.out.println("Linha de cr�dito Aprovada!");
		} else {
			System.out.println("Linha de cr�dito negada!");
			teclado.close();
		}

	}
}
