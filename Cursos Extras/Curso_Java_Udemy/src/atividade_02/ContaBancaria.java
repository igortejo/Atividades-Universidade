package atividade_02;

public class ContaBancaria {

	private final int numeroConta;
	private String nomeTitularConta;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
		depositar(depositoInicial);
	}
	
	public ContaBancaria(int numeroConta, String nomeTitularConta) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = nomeTitularConta;
	}


	public String getNomeTitularConta() {
		return nomeTitularConta;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo = saldo - valor - 5;
	}
	
	public String toString() {
		return "Account: "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitularConta
				+ ", Balance: R$ "
				+ saldo;
	}
	
	
	
}
