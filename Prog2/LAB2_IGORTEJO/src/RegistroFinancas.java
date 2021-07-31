/**
 * Representação das finanças do estudante, indicando seus
 * ganhos e perdas em geral.
 * @author igor
 *
 */
public class RegistroFinancas {
	/**
	 * Atributos que definem o ganho inicial, as despesas e o array com os 
	 * históricos de ganho, respectivamente.
	 */
	int ganhoinicial = 10000;
	int despesa = 0;
	int[] historicodeganhos = new int[4];
	/**
	 * Constrói um registro de finanças a partir do ganho inicial e o total de ganhos.
	 * @param ganhosIniciais
	 * @param totalDeGanhos
	 */
	public RegistroFinancas(int ganhosIniciais, int totalDeGanhos) {
		
	}
	/**
	 * Método que vai adicionando os valores ganhos em um array.
	 * @param valorCentavos
	 * @param posicaoGanho
	 */
	public void adicionaGanhos(int valorCentavos, int posicaoGanho) {
		historicodeganhos[posicaoGanho - 1] = valorCentavos;
	}
	/**
	 * Método que vai somando os valores referentes as despesas realizadas.
	 * @param valorCentavos
	 */

	public void pagaDespesa(int valorCentavos) {
		despesa += valorCentavos;
	}
	/**
	 * Retorna uma String contendo os históricos de ganho, bem como, sua posição nesse histórico.
	 * @return
	 */
	public String exibeGanhos() {
		String a = "";
		for (int i = 0; i < 4; i++) {
			a += i+1 + " - " + historicodeganhos[i] + "\n"; 
		} return a;
	}
	/**
	 * Retorna uma String contendo o balanço final após todas as operações
	 * de ganhos e perdas.
	 */

	public String toString() {
		int somatoriovaloresganhos = 0;
		for (int i = 0; i < 4; i++) {
			somatoriovaloresganhos += historicodeganhos[i];
	}return ("Total recebidos: " + (somatoriovaloresganhos + ganhoinicial) + ", " + "Despesas totais: " + despesa + ", " + "Total disponível: " + ((somatoriovaloresganhos + ganhoinicial) - despesa));
	}
		
}
