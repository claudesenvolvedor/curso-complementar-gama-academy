
public class ProgramaFuncionario {
	public static void main(String[] args) {
		Funcionario thomas = new Funcionario("thomas", 10, 120);

		System.out.println(thomas.exibirDados());
		System.out.println(thomas.calcularSalario());

		Funcionario messi = new Senior("Messi", 30, 80, 50);

		System.out.println(messi.exibirDados());
		System.out.println(messi.calcularSalario());
	}
}
