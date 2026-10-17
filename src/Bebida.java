import java.util.List;

public abstract class Bebida {

	private final String descricao;
	protected List<EFruta> frutas;

	public Bebida(String descricao) {
		this.descricao = descricao;
	}

	public abstract int adicionar(EFruta fruta);

	public abstract double preco();

	@Override
	public String toString() {
		return this.descricao;
	}

}
