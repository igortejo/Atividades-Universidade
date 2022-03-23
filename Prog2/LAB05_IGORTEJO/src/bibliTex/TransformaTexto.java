package bibliTex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class TransformaTexto {
	HashMap<String, AlgoritmoTransformacao> algoritmos;
	HashMap<Integer, ArrayList<String>> transformacao;
	HashSet<String> textoOriginal;
	ArrayList<String> tiposDeTransformacoes;

	int numTransformacoes = 0;

	/**
	 * Irá inicializar os mapas, conjuntos e arrays.
	 * 
	 * @author igor
	 *
	 */
	public TransformaTexto() {
		algoritmos = new HashMap<>();
		transformacao = new HashMap<>();
		textoOriginal = new HashSet<>();
		tiposDeTransformacoes = new ArrayList<>();

	}

	/**
	 * Método que vai se comunicar com as outras classes de acordo com o nome dela.
	 * 
	 * @author igor
	 *
	 */
	public String transforma(String nomeClasse, String textoASerTransformado) {
		ArrayList<String> temp = new ArrayList<>();
		textoOriginal.add(textoASerTransformado);
		String retorno = algoritmos.get(nomeClasse).transforma(textoASerTransformado);
		temp.add(textoASerTransformado);
		temp.add(nomeClasse);
		temp.add(retorno);
		transformacao.put(numTransformacoes, temp);
		numTransformacoes += 1;

		return retorno;
	}

	/**
	 * Cadastra todas as transformações e aloca no mapa algoritmos.
	 * 
	 * @author igor
	 *
	 */
	public void cadastraTransformacao(String nomeClasse, AlgoritmoTransformacao algoritmo) {
		algoritmos.put(nomeClasse, algoritmo);
		tiposDeTransformacoes.add(nomeClasse);

	}

	/**
	 * Conta quantas transformações foram realizadas.
	 * 
	 * @author igor
	 *
	 */
	public int contaTransformacao() {
		return numTransformacoes;
	}

	/**
	 * Esse método é responsável por mostrar qual o histórico da transformação de um
	 * método de transformação específico.
	 * 
	 * @author igor
	 *
	 */
	public String historico(int posicao) {
		ArrayList<String> lista = transformacao.get(posicao);
		String historicoTransformacao = "";
		for (int i = 0; i < lista.size(); i++) {
			if (i == lista.size() - 1) {
				historicoTransformacao += lista.get(i);

			} else {
				historicoTransformacao += lista.get(i) + " -> ";

			}
		}
		return historicoTransformacao;
	}

	/**
	 * Método que vai listar todas as frases originais que foram armazenadas no
	 * conjunto textoOriginal.
	 * 
	 * @author igor
	 *
	 */
	public String listarOriginais() {
		String originais = "";
		for (String s : textoOriginal) {
			originais += s + "\n";
		}
		return originais;

	}

	/**
	 * Método criado para listar as transformações realizadas em ordem alfabética.
	 * 
	 * @author igor
	 *
	 */
	public String listarTransformacoes() {
		Collections.sort(tiposDeTransformacoes);
		String transformacoes = "";
		for (String s : tiposDeTransformacoes) {
			transformacoes += s + "\n";
		}
		return transformacoes;

	}

	/**
	 * Método que retorna o tamanho do mapa transformação.
	 * 
	 * @author igor
	 *
	 */
	public int tamanhoMapaTransformacao() {
		return transformacao.size();
	}

}
