package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CleanTest {

	@Test
	void testTransforma() {
		TransformaTexto textos = new TransformaTexto();
		Clean classe = new Clean();
		textos.cadastraTransformacao("Clean", classe);
		assert (classe.transforma("Oi, tudo. bem").equals("Oi tudo bem"));

	}

	@Test
	void testTransformaComecandoComSimbolo() {
		TransformaTexto textos = new TransformaTexto();
		Clean classe = new Clean();
		textos.cadastraTransformacao("Clean", classe);
		assert (classe.transforma("!!!?tudo. bem").equals("tudo bem"));

	}

	@Test
	void testTransformaSoComSimbolo() {
		TransformaTexto textos = new TransformaTexto();
		Clean classe = new Clean();
		textos.cadastraTransformacao("Clean", classe);
		assert (classe.transforma("!!!?.").equals(""));

	}
}
