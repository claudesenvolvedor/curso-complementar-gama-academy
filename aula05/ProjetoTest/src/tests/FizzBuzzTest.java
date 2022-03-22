package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

public class FizzBuzzTest {

	@Test
//esta anotação adiciona o teste automatico gerando uma nova aba chamada junit onde verificamos os testes
	public void deveRetornarFizzQuandoMultiploDeTres() {
		FizzBuzz f = new FizzBuzz();

		
		
		String retorno = f.calcular(3);
		assertEquals("Fizz", retorno);
	}

}
