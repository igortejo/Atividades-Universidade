package bibliTex;

public class UpperCase implements AlgoritmoTransformacao {

	/**
	 * Esse método vai colocar o texto todo em upper case (maiusculas).
	 * @author igor
	 *
	 */
	public String transforma(String textoASerTransformado) {
		return textoASerTransformado.toUpperCase();
	}

}
