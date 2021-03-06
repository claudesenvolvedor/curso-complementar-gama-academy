/*
 *Aluno Clau Pinheiro 
 */

public class Placar {
	private String time1, time2;
	private int golsTime1, golsTime2;

	public Placar() {
		/*
		 * time1 = "Time da casa"; time2 = "Visitante"; golsTime1 = 0; golsTime2 = 0;
		 */
		this("Time da casa", "Visitante"); // utiliza o construtor com 2 parametros
	}

	public Placar(String nomeTime1, String nomeTime2) {
		time1 = nomeTime1;
		time2 = nomeTime2;
		golsTime1 = 0;
		golsTime2 = 0;
	}

	public Placar(String nomeTime1, String nomeTime2, int golsTIme1, int golsTime2) {
		time1 = nomeTime1;
		time2 = nomeTime2;
		this.golsTime1 = golsTIme1;
		this.golsTime2 = golsTime2;
	}

	@Override
	public String toString() {
		return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
	}

}
