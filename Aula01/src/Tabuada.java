import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int resultado;

		System.out.println("Digite um n�mero para calcular a opera��o matem�tica de multiplica��o");
		numero = teclado.nextInt();

		for (int contador = 0; contador <= 10; contador++) {
			resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			teclado.close();
		}

	}
}
