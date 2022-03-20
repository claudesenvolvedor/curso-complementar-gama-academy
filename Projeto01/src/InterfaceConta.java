import java.util.Scanner;

public class InterfaceConta {
public static void main(String[] args) {
	

	Scanner teclado = new Scanner(System.in);
	
	System.out.println("1. abrir uma Conta");
	System.out.println("2. Consultar uma Conta");
	System.out.println("3. Fechar uma Conta");
	
	int opcao = 3;
	
	switch (opcao) {
	case 1:
		System.out.println("Conta");
		break;
	case 2:
		System.out.println("Consultar");
		break;
	case 3:
		System.out.println("");
		break;
		default:
			System.out.println("Opção inválida");
	}
	//fim do menu do banco

	System.out.println("Escolha um número para a opção desejada");
	int numero = teclado.nextInt();
	
	if(numero == 1) {
		System.out.println("Vamos abrir uma Conta");
	}
	else if(numero == 2) {
		System.out.println("Informe os dados para a consulta da Conta");
	}
	else if(numero == 3 ) {
		System.out.println("Ok. Vamos encerrar sua Conta");
teclado.close();
	}
	
	
	
	
}
}
