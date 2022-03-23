package lab_04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlunoTeste {

	@Test
	void testHashCode() {
		Aluno aluno1 = new Aluno("100", "igor", "curso");
		Aluno aluno2 = new Aluno("100", "igor", "curso");
		assert (aluno1.getMatricula().hashCode() == aluno2.getMatricula().hashCode());
		Aluno aluno3 = new Aluno("200", "igor", "curso");
		assert (aluno1.getMatricula().hashCode() != aluno3.getMatricula().hashCode());

	}

	@Test
	void testAluno() {
		new Aluno("200", "igor", "computacao");
	
	}

	@Test
	void testEqualsObject() {
		Aluno aluno1 = new Aluno("100", "igor", "curso");
		Aluno aluno2 = new Aluno("100", "igor", "curso");
		assert (aluno1.equals(aluno2) == true);
		Aluno aluno3 = new Aluno("200", "igor", "curso");
		assert (aluno1.equals(aluno3) == false);

		
	}

}
