package iFood;

import java.util.ArrayList;
import java.util.List;

public class Ifood {
	
	private List<Pedido> pedidos;

	public Ifood() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void solicitarComida(Pedido p) {
		pedidos.add(p);
	}
	
	public void solicitarComida(Data dataPedido, String cliente,
			String comida, double precoComida, double km) {
		Pedido p = new Pedido(dataPedido, cliente, comida, precoComida, km);
		pedidos.add(p);
	}

	public int getQuantidadePedidos() {
		return pedidos.size();
	}
	
	public List<Pedido> getPedidosCliente(String cliente) {
		List<Pedido> p = new ArrayList<Pedido>();
		for(int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).getCliente().equals(cliente)) {
				p.add(pedidos.get(i));
			}
		}
		if(p.size() == 0) {
			return null;
		}
		return p;
	}
	
	public double getCustoPedidos(String cliente) {
		double result = 0;
		for(int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).getCliente().equals(cliente)) {
				result += pedidos.get(i).getCustoPedido();
			}
		}
		return result;
	}
	
	public Pedido removePedidoMaisAntigo(String cliente) {
		if(this.maisAntigo(cliente) == null) {
			return null;
		} else {
			Pedido p = this.maisAntigo(cliente);
			for(int i = 0; i < pedidos.size(); i++) {
				if(pedidos.get(i).getCliente().equals(p.getCliente()) &&
						pedidos.get(i).getComida().equals(p.getComida()) &&
						pedidos.get(i).getCustoPedido() == p.getCustoPedido() &&
						pedidos.get(i).getData().getDia() == p.getData().getDia() &&
						pedidos.get(i).getData().getMes() == p.getData().getMes() &&
						pedidos.get(i).getData().getAno() == p.getData().getAno() &&
						pedidos.get(i).getKm() == p.getKm()) {
					pedidos.remove(i);
				}
			}
			return p;
		}
	}



private Pedido maisAntigo(String cliente) {
	Pedido p = null;
	for(int i = 0; i < pedidos.size(); i++) {
		if(pedidos.get(i).getCliente().equals(cliente)) {
			if(p == null) {
				p = pedidos.get(i);
			} else {
				if(pedidos.get(i).getData().getAno() < p.getData().getAno()) {
					p = pedidos.get(i);
				} else if(pedidos.get(i).getData().getAno() == p.getData().getAno()) {
					if(pedidos.get(i).getData().getMes() < p.getData().getMes()) {
						p = pedidos.get(i);
					} else if(pedidos.get(i).getData().getMes() == p.getData().getMes()) {
						if(pedidos.get(i).getData().getDia() < p.getData().getDia()) {
							p = pedidos.get(i);
						}
					}
				}
			}
		}
	}
	return p;
}

}