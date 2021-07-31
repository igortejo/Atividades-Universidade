/**
 * Representação da disciplina, especificando alguns aspectos relacionados a ela.
 * @author igor
 *
 */
public class Disciplina {
	/**
	 * Atributos que especificam o nome da disciplina, horas gastas de estudo com essa disciplina,
	 *  a quantidade de provas, as notas das provas e a sua média, respectivamente.
	 */
	String nomedadisciplina = "" ;
	int horasdeestudo = 0;
	double[] notas = new double[4]; // 1, 2, 3 e 4
	double valornota = 0;
	double media;
	/**
	 * Constrói um disciplina a partir do seu nome.
	 * @param nomedadisciplina
	 */
	
	public Disciplina(String nomedadisciplina) {
		
		this.nomedadisciplina = nomedadisciplina;
		
	}
	/**
	 * Método que soma as horas de estudo daquela disciplina e armazena 
	 * no atributo.
	 * @param horas
	 */

	public void cadastraHoras(int horas) {
		horasdeestudo += horas;
	}
	/**
	 * Cadastra as notas e armazena em um array.
	 * @param nota
	 * @param valorNota
	 */
	public void cadastraNota(int nota, double valorNota) { // notas possíveis: 1, 2, 3 e 4
		notas[nota - 1] = valorNota;
		valornota += valorNota;

	}
	/**
	 * Retorna com true ou false se o aluno foi aprovado ou não naquela disciplina.
	 * @return
	 */

	public boolean aprovado() {
		media = valornota / 4;	
		if (media >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Retorna a String que contém o nome da disciplina, horas de estudo, a media e o array das notas.
	 */
	public String toString() {
		String arraydasnotas = "[";
		for (int i = 0; i < 4; i++) {
			if (i == 3) {
				arraydasnotas += notas[i] + "]";
			}else {
				arraydasnotas += notas[i] + ", ";
			}
		}
		return nomedadisciplina + " " + horasdeestudo + " " + media + " " + arraydasnotas;
	}
}
