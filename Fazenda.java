import java.io.*;
import java.util.*;

public abstract class Fazenda{
	// abstract porque cada animal emite um som diferente e depende do animal
	public abstract void emitirSom();

	public static void main(String[]args){
		Scanner ler = new Scanner(System.in);
		Vaca vaca = new Vaca();
		Pato pato = new Pato();
		Galinha galinha = new Galinha();
		Morcego morcego = new Morcego();

		System.out.println("Informe a idade da Vaca:");
		int idade = ler.nextInt();
		vaca.setIdade(idade);

		System.out.println("Informe o tamanho da Vaca:");
		int tamanho = ler.nextInt();
		vaca.setTamanho(tamanho);

		System.out.println("Informe a idade da Galinha:");
		idade = ler.nextInt();
		System.out.println(idade);
		galinha.setIdade(idade);

		System.out.println("Informe o tamanho da Galinha:");
		tamanho = ler.nextInt();
		galinha.setTamanho(tamanho);

		System.out.println("Informe a idade do Morcego:");
		idade = ler.nextInt();
		morcego.setIdade(idade);

		System.out.println("Informe o tamanho do Morcego:");
		tamanho = ler.nextInt();
		morcego.setTamanho(tamanho);

		System.out.println("Informe a idade do Pato:");
		idade = ler.nextInt();
		pato.setIdade(idade);

		System.out.println("Informe o tamanho do Pato:");
		tamanho = ler.nextInt();
		pato.setTamanho(tamanho);

		System.out.println(" ");
		vaca.imprimir();
		System.out.println(" ");
		pato.imprimir();
		System.out.println(" ");
		galinha.imprimir();
		System.out.println(" ");
		morcego.imprimir();

	}
}