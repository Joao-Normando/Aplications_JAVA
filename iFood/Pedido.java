package iFood;

public class Pedido {
	
	private Data data;
	private String cliente, comida;
	private double precoComida, km;
	private static double precoKm = 1.5;
	
	public Pedido(Data data, String cliente, String comida, double precoComida, double km) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.comida = comida;
		this.precoComida = precoComida;
		this.km = km;
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public double getPrecoComida() {
		return precoComida;
	}

	public void setPrecoComida(double precoComida) {
		this.precoComida = precoComida;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public static double getPrecoKm() {
		return precoKm;
	}

	public static void setPrecoKm(double precoKm) {
		Pedido.precoKm = precoKm;
	}

	public double getCustoPedido() { 		
		return precoComida + (km * precoKm);
	}

	@Override
	public String toString() {
		return "Pedido [data=" + data + ", cliente=" + cliente + ", comida=" + comida + ", precoComida=" + precoComida
				+ ", km=" + km + "]";
	}

}

