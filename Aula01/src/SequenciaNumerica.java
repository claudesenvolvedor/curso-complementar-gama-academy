import java.util.Scanner;

public class SequenciaNumerica {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;
		int contador = 0;

		System.out.println("Digite um n�mero");
		numero = teclado.nextInt();
		contador = 0;
		System.out.println("A sequ�ncia crescente � : ");

		while (contador <= numero) {
			System.out.println(contador);
			contador++;
			teclado.close();
		}
	}
}
