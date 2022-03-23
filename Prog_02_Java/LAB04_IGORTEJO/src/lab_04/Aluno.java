package lab_04;

public class Aluno {

	private String matricula;
	private String nome;
	private String curso;
	
	public Aluno() {

	}
	
	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;	
		}
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		if (this.getMatricula().equals(((Aluno) obj).getMatricula())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode () {
		return this.matricula.hashCode();
		
	}
	@Override
	public String toString() {
		
		return "Aluno: " + matricula + " - " + nome + " - " + curso;
	}
	
}
