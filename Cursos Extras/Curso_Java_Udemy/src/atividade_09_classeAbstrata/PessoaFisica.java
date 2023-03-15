package atividade_09_classeAbstrata;

public class PessoaFisica extends Pessoa{

	private Double gastosSaude;

	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double taxaImposto() {
		double imposto = 0;
		if(rendaAnual < 20000) {
			imposto = 0.15 * rendaAnual - (0.5 * gastosSaude);
		}
		else {
			imposto =  0.25 * rendaAnual - (0.5 * gastosSaude) ;
		}
		return imposto;
		
	}

	
	
}
