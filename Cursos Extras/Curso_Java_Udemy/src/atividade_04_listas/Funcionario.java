package atividade_04_listas;

public class Funcionario {
	
		private int id;
		private String nome;
		private double salario;
		
		
		public Funcionario(int id, String nome, double salario) {
			super();
			this.id = id;
			this.nome = nome;
			this.salario = salario;
			
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		
		public void aumentoSalario(double porcentagem) {
			this.salario *= ((100 + porcentagem)/100);
		}
		
		public String toString() {
			
			return id + ", " +  nome + ", " + salario;
		}
		
		

}
