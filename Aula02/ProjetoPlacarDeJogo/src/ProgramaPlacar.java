
public class ProgramaPlacar {
	public static void main(String[] args) {
		Placar placar1 = new Placar();
		Placar placar2 = new Placar("Argentina", "Brasil");
		Placar placar3 = new Placar("Argentina", "Brasil", 3, 0);

		System.out.println(placar1);
		System.out.println(placar2);
		System.out.println(placar3);
	}
}
