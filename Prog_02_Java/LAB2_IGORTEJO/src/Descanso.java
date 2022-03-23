/**
 * Classe que estipula o tempo necessário que os estudantes devem se dedicar ao
 * descanso/lazer.
 * 
 * @author igor
 */
public class Descanso {
	/**
	* Atributos que armazenam quanto tempo de descanso o estudante teve e quantas 
	* semanas se passaram, respectivamente.
	* 
	*/
	int horasdedescanso = 0;
	int numerosdesemana = 1;
	/**
	 * Define as horas de descanso.
	 * @param valor
	 */
	public void defineHorasDescanso(int valor) {
		horasdedescanso = valor;
	}
	/**
	 * Define o número de semanas relacionadas ao estudante.
	 * @param valor
	 */
	public void defineNumeroSemanas(int valor) {
		numerosdesemana = valor;
	}
	/**
	 * Retorna a String que representa a situação que o aluno se encontra.
	 * @return
	 */
	public String getStatusGeral() {
		if (horasdedescanso / numerosdesemana >= 26) {
			return "descansado";
		} else {
			return "cansado";
		}

	}

}
