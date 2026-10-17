public enum EFruta {

	CUPUACU(1),
	GRAVIOLA(2),
	LARANJA(3),
	MANGA(4),
	MORANGO(5);

	private final double valor;
	
	EFruta(double preco){
		this.valor = preco;
	}

	public double valor(){
		return this.valor;
	}
}
