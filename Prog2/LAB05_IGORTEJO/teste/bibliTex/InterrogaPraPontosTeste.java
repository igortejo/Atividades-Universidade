package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterrogaPraPontosTeste {

	@Test
	void testTransforma() {
		TransformaTexto textos = new TransformaTexto();
		InterrogaPraPontos classe = new InterrogaPraPontos();
		textos.cadastraTransformacao("InterrogaPraPontos", classe);
		assert (classe.transforma("Oi? tudo? bem?").equals("Oi. tudo. bem."));

	}
	@Test
	void testTransformaSoComInterrogacao() {
		TransformaTexto textos = new TransformaTexto();
		InterrogaPraPontos classe = new InterrogaPraPontos();
		textos.cadastraTransformacao("InterrogaPraPontos", classe);
		assert (classe.transforma("???").equals("..."));

	}

}
