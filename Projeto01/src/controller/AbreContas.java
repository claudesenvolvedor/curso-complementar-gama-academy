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
		String nome;

		Conta c;

		while (opcao != 7) {
			System.out.println("1: Conta Corrente");
			System.out.println("2: Conta Especial");
			System.out.println("3: Buscar Conta");
			System.out.println("4: Exluir Conta");
			System.out.println("5: Sair");

			System.out.println("Escolha uma opção");
			digite = teclado.nextLine();
			opcao = Integer.parseInt(digite);

			switch (opcao) {
			case 1:

				System.out.println("Abertura de Conta Corrente");

				System.out.println("Digite o número da Conta");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				System.out.println("Digite um nome para o titular");

				nome = teclado.nextLine();

				c = new ContaCorrente(numero, 0);

				contas.adicionar(c);

				System.out.println("Conta Corrente Criada com sucesso!");
				System.out.println("Seja Bem-vindo ao nosso Banco");
				break;

			case 2:

				System.out.println("Conta Especial");

				System.out.println("Digite o número da Conta");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				System.out.println("Digite o nome do titulular");
				nome = teclado.nextLine();

				System.out.println("Digite o valor do limite da Conta Especial");
				digite = teclado.nextLine();
				limite = Double.parseDouble(digite);

				c = new ContaEspecial(numero, 0, numero);
				contas.adicionar(c);
				System.out.println("Conta Especial Criada com sucesso!");
				System.out.println("Seja Bem-vindo ao nosso Banco");
				break;

			case 3:

				System.out.println("Busque por uma Conta em nosso Banco");
				System.out.println("Digite o número para buscar");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);
				System.out.println(contas.posicao(numero));
				break;

			case 4:
				System.out.println("Remova uma Conta do nosso Banco");
				System.out.println("Digite o número da conta para ser removida");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);
				boolean remover = contas.remover(numero);
				if (remover) {
					System.out.println("Conta removida do Sistema");
				} else {
					System.out.println("Digite novamente o número da Conta para ser removida do nosso Sistema");
				}

				break;

			case 5:
				System.out.println("O nosso sistema foi encerrado");
				break;
			default:

				System.out.println("Opção inválida");

				break;
			}

		}
		teclado.close();
	}
}