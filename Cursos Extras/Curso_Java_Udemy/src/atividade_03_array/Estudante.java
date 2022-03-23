	package atividade_03_array;

public class Estudante {

	String nomeEstudante;
	String emailEstudante;
	
	
	public Estudante(String nomeEstudante, String emailEstudante) {
		super();
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
	}


	public String getNomeEstudante() {
		return nomeEstudante;
	}


	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}


	public String getEmailEstudante() {
		return emailEstudante;
	}


	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}
	public String toString() {
		return nomeEstudante + ", " + emailEstudante;
	}
	
	
}
