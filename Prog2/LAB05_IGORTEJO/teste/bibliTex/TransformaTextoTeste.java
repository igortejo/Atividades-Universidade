package bibliTex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransformaTextoTeste {

	

	@Test
	void testContaTransformacao() {
		TransformaTexto textos = new TransformaTexto();
		Clean limpa = new Clean();
		UpperCase maiusculas = new UpperCase();
		textos.cadastraTransformacao("Clean", limpa);
		textos.cadastraTransformacao("UpperCase", maiusculas);
		textos.transforma("Clean", "Oi, tudo bem?");
		textos.transforma("UpperCase", "Oi, tudo bem?");
		assert (textos.tamanhoMapaTransformacao() == 2);
	}

	@Test
	void testListarOriginais() {
		TransformaTexto textos = new TransformaTexto();
		Clean limpa = new Clean();
		UpperCase maiusculas = new UpperCase();
		textos.cadastraTransformacao("Clean", limpa);
		textos.cadastraTransformacao("UpperCase", maiusculas);
		textos.transforma("Clean", "boa noite a todos");
		textos.transforma("UpperCase", "Oi, tudo bem com voce?");
		assert (textos.textoOriginal.contains("Oi, tudo bem com voce?") && textos.textoOriginal.contains("boa noite a todos"));
		}

	@Test
	void testListarTransformacoes() {
		TransformaTexto textos = new TransformaTexto();
		Clean limpa = new Clean();
		UpperCase maiusculas = new UpperCase();
		textos.cadastraTransformacao("Clean", limpa);
		textos.cadastraTransformacao("UpperCase", maiusculas);
		textos.transforma("Clean", "Oi, tudo bem?");
		textos.transforma("UpperCase", "Oi, tudo bem?");
		assert (textos.listarTransformacoes().equals("Clean" + "\n" + "UpperCase" + "\n"));
	}

}
