
public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco de " + fruta.name().toLowerCase());
		frutas.add(fruta);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() > 2) return -1;
		frutas.add(fruta);
		return frutas.indexOf(fruta);
	}

	@Override 
	public double preco() {
		if (frutas.size() == 1) return EFruta.LARANJA.valor();
		return (frutas.get(1).valor() + frutas.get(1).valor())/2;
	}

	@Override 
	public String toString() {
		return " (Frutas: " + this.frutas + ") - Preço: R$ " + this.preco();
	}

}
