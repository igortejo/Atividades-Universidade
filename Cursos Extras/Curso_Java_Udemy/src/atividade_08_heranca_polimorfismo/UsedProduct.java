package atividade_08_heranca_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String nome, Double price, Date manufactureDate) {
		super(nome, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + "(used)" +  " $ " + price + " (Manufacture Date: " + sdf.format(manufactureDate) + ")";
	}
	
	
}
