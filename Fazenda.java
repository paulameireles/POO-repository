public abstract class Fazenda{
	// abstract porque cada animal emite um som diferente e depende do animal
	public abstract void emitirSom();

	public static void main(String[]args){
		Vaca vaca = new Vaca();
		Galinha galinha = new Galinha();
		Pato pato = new Pato();
		Morcego morcego = new Morcego();

		
	}
}