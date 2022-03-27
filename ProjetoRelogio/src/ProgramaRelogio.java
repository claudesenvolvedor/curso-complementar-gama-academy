
public class ProgramaRelogio {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio(5, 27, 11);

		relogio1.setHora(5);
		relogio1.setMinuto(25);
		System.out.println(relogio1.getHoraAtual());
	}
}
