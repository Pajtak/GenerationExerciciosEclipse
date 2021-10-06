package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio02 {
	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		int par = 0, impar = 0, n;
		Scanner ler = new Scanner(System.in);		
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite aqui os seus números: ");
			n = ler.nextInt();
			 if (n % 2 == 0) {
				 par++;
			 }
			 else {
				 impar++;
			 }
			 }
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números ímpares é: " + impar);
		ler.close();
	}

}
