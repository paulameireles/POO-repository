class Morcego extends Fazenda implements Mamifero, Ave{
	private int idade;
	private int tamanho;
	private boolean voar = true;
	private boolean amamentar = true;

	public Morcego(){
		this.setIdade(0);
		this.setTamanho(0);
		this.setVoar(true);
		this.setAmamentar(true);
	}

	public Morcego(int idade, int tamanho, boolean voar, boolean amamentar){
		this.setIdade(idade);
		this.setTamanho(tamanho);
		this.setVoar(voar);
		this.setAmamentar(amamentar);
	}

	public boolean getAmamentar(){
		return amamentar;
	}

	public boolean getVoar(){
		return voar;
	}

	public int getIdade(){
		return idade;
	}

	public int getTamanho(){
		return tamanho;
	}

	public void setAmamentar(boolean amamentar){
		this.amamentar = amamentar;
	}

	public void setVoar(boolean voar){
		this.voar = voar;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
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