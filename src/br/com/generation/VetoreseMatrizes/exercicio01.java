package br.com.generation.VetoreseMatrizes;

import java.util.Scanner;

public class exercicio01 {
	/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	  Autor: Bruno Pajtak
	  Data: 06/10/2021*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pont[] = new double[5];
		int i = 0;
		double maior = 0;
		
		
		for (i = 0; i < pont.length; i ++) {
		System.out.println("Digite aqui a pontua��o da atividade: ");	
		pont[i] = ler.nextDouble();
		
			if(pont [i] > maior) {
			maior = pont[i];	
			}		
		}
		for (i = 0; i < pont.length; i++) {
			System.out.println("A " + (i + 1) + "� nota inserida foi [" + pont[i] + "]");
			
		}
		ler.close();
		System.out.println("A maior nota inserida foi: " + maior);
		
	}
	
}
