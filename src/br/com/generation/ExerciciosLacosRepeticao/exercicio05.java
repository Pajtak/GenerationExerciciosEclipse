package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio05 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n, soma = 0;
		
		do {
			System.out.println("Digite um n�mero, para parar digite 0: ");
			n = ler.nextInt();
			soma +=n;
		} while (n != 0);
		System.out.println("A soma dos n�meros digitados �: " + soma);
		ler.close();
	}

}
