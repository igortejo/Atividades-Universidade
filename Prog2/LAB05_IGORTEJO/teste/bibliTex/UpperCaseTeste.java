package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpperCaseTeste {
	

	@Test
	void testTransforma() {
		TransformaTexto textos = new TransformaTexto();
		UpperCase classe = new UpperCase();
		textos.cadastraTransformacao("UpperCase", classe);
		assert (classe.transforma("Oi, tudo bem").equals("OI, TUDO BEM"));

	}
	@Test
	void testTransformaDeMaiusculo() {
		TransformaTexto textos = new TransformaTexto();
		UpperCase classe = new UpperCase();
		textos.cadastraTransformacao("UpperCase", classe);
		assert (classe.transforma("OI, TUDO BEM").equals("OI, TUDO BEM"));

	}
	@Test
	void testTransformaDeMinusculo() {
		TransformaTexto textos = new TransformaTexto();
		UpperCase classe = new UpperCase();
		textos.cadastraTransformacao("UpperCase", classe);
		assert (classe.transforma("oi, tudo bem").equals("OI, TUDO BEM"));

	}

}
