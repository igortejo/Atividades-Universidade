package bibliTex;

public class CleanSpaces implements AlgoritmoTransformacao {

	/**
	 * Método que vai retirar todos os espaços de determinado texto.
	 * @author igor
	 *
	 */
	public String transforma(String textoASerTransformado) {

		String textoFinal = "";
		for (int i = 0; i < textoASerTransformado.length(); i++) {
			if (textoASerTransformado.charAt(i) != 32) {
				int temp = textoASerTransformado.charAt(i);
				textoFinal += (char) temp;
			}
		}
		return textoFinal;

	}

}
