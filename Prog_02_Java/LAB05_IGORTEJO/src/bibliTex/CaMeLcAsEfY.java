package bibliTex;

public class CaMeLcAsEfY implements AlgoritmoTransformacao {

	public CaMeLcAsEfY() {

	}

	/**
	 * Método que irá transformar qualquer texto no modelo camel case.
	 * @author igor
	 *
	 */
	@Override
	public String transforma(String textoASerTransformado) {

		textoASerTransformado = textoASerTransformado.toLowerCase();
		String[] fraseIterable = textoASerTransformado.split("");
		String fraseFinal = "";
		for (int i = 0; i < fraseIterable.length; i++) {
			if (i % 2 == 0) {
				fraseFinal += fraseIterable[i].toUpperCase();
			} else {
				fraseFinal += fraseIterable[i];
			}
		}
		return fraseFinal;
	}
}
