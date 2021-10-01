package br.com.generationExerciciosLogica;


import java.util.Scanner;

public class TresNumerosPositivosInteiros {
	/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule uma expressão: D = (R + S) / 2 onde R = (A + B)² e S = (B + C)²
	  Autor: Bruno Pajtak
	  Data: 01/10/2021*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
				
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (int)Math.pow(A + B, 2);
		S = (int)Math.pow(B + C, 2);
		D = (R + S) / 2;
		
		System.out.println("O valor de D é: " + D);
		
		System.out.println();
		
		System.out.println("O Valor de R é: " + R);
		
		System.out.println();
		
		System.out.println("O Valor de S é: " + S);
		}

}
