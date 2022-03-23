package lab_04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrupoTeste {
	
	
	@Test
	void testGrupoTema() {
		new Grupo("mapas");
	}

	@Test
	void testGrupoTemaTamanho() {
		new Grupo("mapas", 5);

	}

	@Test
	void testIsCheio() {
		Grupo mapas = new Grupo("mapas", 2);
		mapas.alocaAluno(new Aluno("200", "igor", "computacao"));
		assert(mapas.isCheio() == false);
		mapas.alocaAluno(new Aluno("300", "joao", "computacao"));
		assert(mapas.isCheio() == true);

	}

	@Test
	void testAlocaAluno() {
		Grupo mapas = new Grupo("mapas", 3);
		mapas.alocaAluno(new Aluno("200", "igor", "computacao"));
		assert (mapas.getTamanhoAtual()== 1);
		mapas.alocaAluno(new Aluno("100", "igor", "computacao"));
		mapas.alocaAluno(new Aluno("300", "igor", "computacao"));
		assert (mapas.getTamanhoAtual()== 3);
	}

	@Test
	void testVerificaPertinencia() {
		Aluno aluno = new Aluno("200", "igor", "computacao");
		Grupo mapas = new Grupo("mapas", 3);
		assert (mapas.verificaPertinencia(aluno) == false);
		mapas.alocaAluno(new Aluno("200", "igor", "computacao"));
		assert (mapas.verificaPertinencia(aluno) == true);
		
	}

}
