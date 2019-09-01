class Vaca extends Fazenda implements Mamifero{
	private int tamanho;
	private int idade;
	private boolean voar = false;
	private boolean amamentar = true;

	public int getTamanho(){
		return tamanho;
	}

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void amamentar(){
		if(amamentar == true){
			System.out.println("Este animal pode amamentar.");
		}else{
			System.out.println("Este animal não pode amamentar.");
		}
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
}