package atividade_09_classeAbstrata;

public class PessoaJuridica extends Pessoa {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double taxaImposto() {
		double imposto = 0;
		if (numeroFuncionarios <= 10) {
			imposto = rendaAnual * 0.16;
		}
		else {
			imposto = rendaAnual * 0.14;
		}
		return imposto;
	}
	
}
