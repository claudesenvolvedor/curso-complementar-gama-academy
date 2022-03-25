/*
package controller;

public class AbreContas {

}


*/


package controller;


import java.util.Scanner;

import core.Conta;
import core.ContaCorrente;
import core.ContaEspecial;
import util.GerenciaContas;

	public class AbreContas {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);

	GerenciaContas contas = new GerenciaContas();
		
		int opcao = 0;
		int numero;
		double limite;
		String digite;
		
		Conta c;
		
		while (opcao != 5) {
			System.out.println("1: Conta Corrente");
			System.out.println("2: Conta Especial");
			System.out.println("3: Buscar Conta");
			System.out.println("4: Exluir Conta");
			System.out.println("5: Sair");
			System.out.println("O que deseja fazer");
			
			digite = teclado.nextLine();
			opcao = Integer.parseInt(digite);
					switch (opcao ) {
					case 1:
						System.out.println("Digite o número para o que deseja fazer");
						digite = teclado.nextLine();
						numero = Integer.parseInt(digite);
								c = new ContaCorrente(0, 0);
						
						contas.adicionar(c);
System.out.println("Conta Criada com sucesso!");
						break;
			
					case 2:
						System.out.println("Digite um número para o que deseja fazer");
						digite = teclado.nextLine();
						numero = Integer.parseInt(digite);
				
						c = new ContaEspecial(numero, 0, numero);
						contas.adicionar(c);
		
						System.out.println("Conta Especial Criada com sucesso!");break;
						
					case 3:
						System.out.println("Digite o número para buscar");
						digite = teclado.nextLine();
						numero = Integer.parseInt(digite);
						System.out.println(contas.busca(numero));
						break;
						
					case 4:
						System.out.println("Digite o número da conta para ser removida");
						digite = teclado.nextLine();
						numero = Integer.parseInt(digite);
						boolean remover = contas.remover(numero);
						if (remover) {
							System.out.println("Conta removida do Sistema");
						
						}
						else {
							System.out.println("Digite novamente o número da Conta para ser removida do nosso Sistema");
						}
						
						break;
						
	
						
					case 5:
						System.out.println("O nosso sistema foi encerrado");
						break;
						default :
			
							System.out.println("Opção inválida");
			
							break;
						
		}
}
}
}