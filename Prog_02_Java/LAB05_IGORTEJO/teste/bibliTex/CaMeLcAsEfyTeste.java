package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaMeLcAsEfyTeste {

	@Test
	void testTransforma() {
		TransformaTexto textos = new TransformaTexto();
		CaMeLcAsEfY classe = new CaMeLcAsEfY();
		textos.cadastraTransformacao("CaMeLcAsEfY", classe);
		assert (classe.transforma("oi, como vc vai?").equals("Oi, CoMo vC VaI?"));
	}
	
	@Test
	void testTransformaSeTiverTudoMaiusculo() {
		TransformaTexto textos = new TransformaTexto();
		CaMeLcAsEfY classe = new CaMeLcAsEfY();
		textos.cadastraTransformacao("CaMeLcAsEfY", classe);
		assert (classe.transforma("OI, COMO VC VAI?").equals("Oi, CoMo vC VaI?"));
	}

}
