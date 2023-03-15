package atividade_08_heranca_polimorfismo;

public class Product {

	protected String name;
	protected Double price;
	
	public Product() {
		
	}
	
	public Product(String nome, Double price) {
		this.name = nome;
		this.price = price;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ " + price;
	}
}
