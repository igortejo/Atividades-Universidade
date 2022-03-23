package atividade_01;


public class Produto {
	
	public String nomeProduto;
	public double precoProduto;
	public int quantidadeEstoque;
	
	public Produto() {
		
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public Produto(String nomeProduto, double precoProduto, int quantidadeEstoque) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeEstoque = quantidadeEstoque;
		
	}
	public Produto(String nomeProduto, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		
	}
	
	
	public double totalValorEstoque() {
		return precoProduto * quantidadeEstoque;
		
	}

	public void addProduto(int quantidade) {
		quantidadeEstoque += quantidade;
			

	}
	
	public void removeProduto(int quantidade) {
		quantidadeEstoque -= quantidade;
		
	}
	
	public String toString() {
		return nomeProduto
	+ "; " + "R$: "
	+ String.format("%.2f", precoProduto) + "; "
	+ quantidadeEstoque
	+ " unidades"
	+ "; " 
	+ "Total: " 
	+ String.format("%.2f", totalValorEstoque());
	}
}
