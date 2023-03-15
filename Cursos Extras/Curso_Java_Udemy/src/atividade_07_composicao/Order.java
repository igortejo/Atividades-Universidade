package atividade_07_composicao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	private List<OrderItem> itensPedido = new ArrayList<>();
	private Client cliente;

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItensPedido() {
		return itensPedido;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public void addItem(OrderItem item) {
		itensPedido.add(item);
	}

	public void removeItem(OrderItem item) {
		itensPedido.remove(item);
	}

	public double total() {
		double soma = 0;
		for (OrderItem item : itensPedido) {
			soma += item.subTotal();
		}
		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order itens: " + "\n");
		for (OrderItem orderItem : itensPedido) {
			sb.append(orderItem + "\n");
		}
		sb.append("Total price: $");
		sb.append(total());
		return sb.toString();
	}

}
