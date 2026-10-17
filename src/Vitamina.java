


public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;


	public Vitamina(EFruta fruta) {
		super("Suco de " + fruta.name().toLowerCase());
		frutas.add(fruta);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() > 3) return -1;
		frutas.add(fruta);
		return frutas.indexOf(fruta);
	}

	@Override 
	public double preco() {
		double pre = 0;
		for(EFruta fruta : this.frutas) pre += fruta.valor();
		return (pre/frutas.size()) + ACRESCIMO;
	}

	@Override 
	public String toString() {
		return " (Frutas: " + this.frutas + ") - Preço: R$ " + this.preco();
	}

}
