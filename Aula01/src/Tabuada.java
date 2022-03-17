import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int resultado;

		System.out.println("Digite um número para calcular a operação matemática de multiplicação");
		numero = teclado.nextInt();

		for (int contador = 0; contador <= 10; contador++) {
			resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			teclado.close();
		}

	}
}
