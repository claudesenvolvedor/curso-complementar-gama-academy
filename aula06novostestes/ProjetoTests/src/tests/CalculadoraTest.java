package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {
private Calculadora c;

@BeforeEach


public void setup() {
	c = new Calculadora();
	
}
@Test

public void deveRetornarAsomaDosNumero() {
	double resultado = c.somar(10, 20);
	assertEquals(30, resultado);
	
}
@Test
public void deveRetornarAsubtracaoDosNumeros() {
	double resultado = c.subtrair(20, 10);
	assertEquals(10, resultado);
	
}
@Test
public void deveRetornarAmultiplicacaoDosNumeros() {
	double resultado = c.multiplicar(2, 3);
	assertEquals(6, resultado);
	
}
@Test
public void deveRetornarAdivisaoQuandoQuandoAdivisaoDiferenteDeZero() {
	double resultado = c.subtrair(20, 10);
	assertEquals(10, resultado);
	
}
@Test
public void deveRetornarValorNegativoQuandoNumeroDivisorIgualAzero() {
	double resultado = c.dividir(1 , 0);
	assertEquals(-1, resultado);
	
}
}
