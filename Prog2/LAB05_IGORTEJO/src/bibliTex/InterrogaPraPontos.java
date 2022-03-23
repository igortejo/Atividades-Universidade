package bibliTex;

public class InterrogaPraPontos implements AlgoritmoTransformacao {

	/**
	 * Esse método vai transformar todas as interrogações de determinado texto em pontos.
	 * @author igor
	 *
	 */
	public String transforma(String textoASerTransformado) {
		String textoFinal = "";
		for (int i = 0; i < textoASerTransformado.length(); i++) {
			if (textoASerTransformado.charAt(i) != 63) {
				int temp = textoASerTransformado.charAt(i);
				textoFinal += (char) temp;
			} else {
				textoFinal += ".";
			}
		}
		return textoFinal;
	}

}
