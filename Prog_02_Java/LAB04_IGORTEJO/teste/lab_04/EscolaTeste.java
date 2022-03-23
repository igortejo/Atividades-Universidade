package lab_04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscolaTeste {

	@Test
	void testEscola() {
		new Escola();
	}

	@Test
	void testCadastraAluno() {
		Escola escola = new Escola();
		escola.cadastraAluno("250", "Gabriel Reys", "Computação");
		assert (escola.getQuantidadeDeAlunos() == 1);
		assert (escola.cadastraAluno("250", "Gabriel Reys", "Computação") == false);
		assert (escola.cadastraAluno("300", "igor", "Computação") == true);
	}

	@Test
	void testCadastraGrupoComRestricao() {
		Escola escola = new Escola();
		escola.cadastraGrupo("mapas", 10);
		assert (escola.getQuantidadeDeGrupos() == 1);
		assert (escola.cadastraGrupo("listas", 12) == true);		
		
	}
	@Test
	void testCadastraGrupoComRestricaoENomeExistente() {
		Escola escola = new Escola();
		escola.cadastraGrupo("mapas", 10);
		assert (escola.getQuantidadeDeGrupos() == 1);
		assert (escola.cadastraGrupo("listas", 12) == true);
		assert (escola.cadastraGrupo("mapas", 12) == false);
	}


	@Test
	void testAlocaAluno() {
		Escola escola = new Escola();
		escola.cadastraGrupo("Programacao oo", 2);
		escola.cadastraAluno("200", "igor", "computacao");
		assert (escola.alocaAluno("200", "Programacao oo") == "ALUNO ALOCADO");
		escola.cadastraAluno("202", "igor", "computacao");
		assert (escola.alocaAluno("202", "Programacao oo") == "ALUNO ALOCADO");

	}
	@Test
	void testAlocaAlunoQueNaoExiste() {
		Escola escola = new Escola();
		escola.cadastraGrupo("Programacao oo", 2);
		assert (escola.alocaAluno("100", "Programacao oo") == "ALUNO NÃO CADASTRADO");
	}
	
	@Test
	void testAlocaAlunoAoGrupoQueNaoExiste() {
		Escola escola = new Escola();
		escola.cadastraAluno("200", "igor", "computacao");
		assert (escola.alocaAluno("200", "Anatomia") == "GRUPO NÃO CADASTRADO");
	}
	@Test
	void testAlocaAlunoAoGrupoComRestricaoDeTamanho1() {
		Escola escola = new Escola();
		escola.cadastraGrupo("Listas", 1);
		escola.cadastraAluno("250", "igor", "computacao");
		assert (escola.alocaAluno("250", "LISTAS") == "ALUNO ALOCADO");
		escola.cadastraAluno("202", "igor", "computacao");
		assert (escola.alocaAluno("202", "listas") == "GRUPO CHEIO");

	}

	@Test
	void testVerificaPertinenciaDeUmGrupoNaoCadastrado() {
		Escola escola = new Escola();
		escola.cadastraAluno("200", "igor", "computacao");
		assert (escola.verificaPertinencia("200", "Anatomia") == "GRUPO NÃO CADASTRADO.");
		
	}
	
	@Test
	void testVerificaPertinenciaDeUmAlunoNaoCadastrado() {
		Escola escola = new Escola();
		escola.cadastraGrupo("Programacao oo", 1);
		assert (escola.verificaPertinencia("100", "Programacao oo") == "ALUNO NÃO CADASTRADO");
		
	}

	@Test
	void testOlhaGrupoDoAlunoSemGrupos() {
		Escola escola = new Escola();
		escola.cadastraAluno("250", "igor", "computacao");
		String resultado = escola.olhaGrupoDoAluno("250");
		assert (resultado == "ALUNO SEM GRUPO");
	}
	@Test
	void testOlhaGrupoDoAlunoComGrupos() {
		Escola escola = new Escola();
		escola.cadastraGrupo("Programacao oo", 1);
		escola.cadastraGrupo("Listas", 1);
		escola.cadastraAluno("250", "igor", "computacao");
		escola.alocaAluno("250", "listas");
		escola.alocaAluno("250", "programacao oo");
		String resultado = escola.olhaGrupoDoAluno("250");
		assert (resultado.contains("listas"));
		assert (resultado.contains("programacao oo"));
	}

}
