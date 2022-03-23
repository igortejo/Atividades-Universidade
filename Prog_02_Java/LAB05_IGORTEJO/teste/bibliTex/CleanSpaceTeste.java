package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CleanSpaceTeste {

	@Test
	void testTransforma() {
		TransformaTexto textos = new TransformaTexto();
		CleanSpaces classe = new CleanSpaces();
		textos.cadastraTransformacao("CleanSpaces", classe);
		assert (classe.transforma("Oi, tudo bem").equals("Oi,tudobem"));

	}
	@Test
	void testTransformaSoComEspaco() {
		TransformaTexto textos = new TransformaTexto();
		CleanSpaces classe = new CleanSpaces();
		textos.cadastraTransformacao("CleanSpaces", classe);
		assert (classe.transforma("    ").equals(""));

	}
	@Test
	void testTransformaSemEspacoEComSimbolos() {
		TransformaTexto textos = new TransformaTexto();
		CleanSpaces classe = new CleanSpaces();
		textos.cadastraTransformacao("CleanSpaces", classe);
		assert (classe.transforma("oi,tudobem!").equals("oi,tudobem!"));

	}
}
