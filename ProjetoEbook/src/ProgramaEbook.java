
public class ProgramaEbook {
	public static void main(String[] args) {
		Ebook livro = new Ebook("Segredos Ocultos", "Morgan Julliet", 200);

		System.out.println(livro.mostrarDados());
		livro.avancarPagina();
		System.out.println("O livro está na página" + livro.getPaginaAtual());
		livro.voltarPagina();
		livro.voltarPagina();
		System.out.println(livro.getPaginaAtual());

		boolean alterou = livro.irParaPagina(50);
		if (alterou) {
			System.out.println("Foi para a pagina" + livro.getPaginaAtual());
		} else {
			System.out.println("Pagina invalida");
		}
	}
}
