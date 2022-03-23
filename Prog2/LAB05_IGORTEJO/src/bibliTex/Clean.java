package bibliTex;

public class Clean implements AlgoritmoTransformacao {

	/**
	 * Método que vai limpar determinado texto
	 * deixando apenas as letras.
	 * @author igor
	 *
	 */
	@Override
	public String transforma(String textoASerTransformado) {
		String textoFinal = "";

		for (int i = 0; i < textoASerTransformado.length(); i++) {
			if ((textoASerTransformado.charAt(i) >= 65 && textoASerTransformado.charAt(i) <= 90)
					|| (textoASerTransformado.charAt(i) >= 97 && textoASerTransformado.charAt(i) <= 122)) {
				int temp = textoASerTransformado.charAt(i);
				textoFinal += (char) temp;

			} else if (textoASerTransformado.charAt(i) == 32) {
				int temp = textoASerTransformado.charAt(i);
				textoFinal += (char) temp;
			}

		}
		return textoFinal;

	}

}
