import java.util.List;

public class Pedido {

	private List<Bebida> itens;

	public Pedido() {
		
	}

	public int adicionar(Bebida item) {
		itens.add(item);
		return itens.indexOf(item);
	}

	public double preco() {
		double pre = 0;
		for (Bebida item : itens) pre += item.preco();
		return pre;
	}

	@Override 
	public String toString() {
		return " (Bebidas: " + this.itens + ") - Preço: R$ " + this.preco();
	}

}
