package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio02 {
	/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		int par = 0, impar = 0, n;
		Scanner ler = new Scanner(System.in);		
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite aqui os seus n�meros: ");
			n = ler.nextInt();
			 if (n % 2 == 0) {
				 par++;
			 }
			 else {
				 impar++;
			 }
			 }
		System.out.println("A quantidade de n�meros pares �: " + par);
		System.out.println("A quantidade de n�meros �mpares �: " + impar);
		ler.close();
	}

}
