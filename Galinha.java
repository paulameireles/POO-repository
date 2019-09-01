class Galinha extends Fazenda implements Ave{
	private int idade;
	private int tamanho;
	private boolean voar = false;
	private boolean amamentar = false;

	public Galinha(){
		this.setIdade(0);
		this.setTamanho(0);
	}

	public Galinha(int idade, int tamanho){
		this.setIdade(idade);
		this.setTamanho(tamanho);
	}


	public int getIdade(){
		return idade;
	}

	public int getTamanho(){
		return tamanho;
	}

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void emitirSom(){
		if(voar == false && amamentar == true){
			System.out.println("Este animal muge.");
		}else if(voar == true && amamentar == true){
			System.out.println("Este animal farfalha.");
		}else if(voar == true && amamentar == false){
			System.out.println("Este animal grasne.");
		}else{
			System.out.println("Este animal carcareja.");
		}
	}

	public void voar(){
		if(voar == true){
			System.out.println("Este animal pode voar.");
		}else{
			System.out.println("Este animal não pode voar.");
		}
	}

	public void imprimir(){
		System.out.println("Idade da galinha: " + this.idade);
		System.out.println("Tamanho da galinha: " + this.tamanho);
		voar();
		emitirSom();
	}
}