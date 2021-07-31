/**
 * Classe que irá trabalhar com o tempo que determinado
 * estudante passa realizando suas atividades online.
 * @author igor
 *
 */
public class RegistroTempoOnline {
	/**
	 * Armazena a variável relacionada ao nome da disciplina.
	 * 
	 */
	String nomedadisciplina = "";
	/**
	 * Armazena o tempo que o estudante gasta online.
	 */
	int tempogastoonline = 0; // (horas com a disciplina)
	/*
	 *Armazena o tempo que deve ser esperado ou ótimo para que o estudante fique online.
	 */
	int tempoesperado = 120; // (horas para a disciplina)
	/**
	 * Constrói uma disciplina a partir do nome dela e do tempo online esperado para ela.
	 * @param nomedadisciplina o nome da disciplina.
	 * @param tempoesperado o tempo esperado
	 */
	public RegistroTempoOnline (String nomedadisciplina, int tempoesperado ) {
		
		this.nomedadisciplina = nomedadisciplina;
		this.tempoesperado = tempoesperado;
	}
	/**
	 * Constrói Constrói uma disciplina a partir do nome dela.
	 * @param nomedadisciplina o nome da disciplina
	 */
	public RegistroTempoOnline (String nomedadisciplina) {
		
		this.nomedadisciplina = nomedadisciplina;
	}
	/**
	 * Irá somar os tempos gastos online que vão ser setados.
	 * @param tempo
	 */
	public void adicionaTempoOnline(int tempo) {
		tempogastoonline += tempo;

	}
	/**
	 * Retorna com false ou true se o estudante atingiu ou não a meta de tempo.
	 * @return
	 */
	public boolean atingiuMetaTempoOnline() {
		if (tempogastoonline < tempoesperado) {
			return false;
		}else {
			return true;
		}
			
	}
	/**
	 * Retorna a String que representa a disciplina, com o nome dela, o tempo que o aluno
	 * gastou nela e o tempo esperado.
	 */
	public String toString() {
		return nomedadisciplina + " " + tempogastoonline + "/" + tempoesperado;
	}

}
