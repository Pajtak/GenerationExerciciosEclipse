package br.com.generation.VetoreseMatrizes;

import java.util.Scanner;

public class exercicio04 {
	/*Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
	  Autor: Bruno Pajtak
	  Data: 06/10/2021*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] mat = new int[3][3];
		int somaG = 0, somaD = 0;
		
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.println("Digite os valores da " + (c+1) + "� linha e da " + (l+1) + "� coluna: ");
				mat[l][c] = ler.nextInt(); 
				somaG += mat[l][c];
				
				if (l == c ) {
					somaD += mat[l][c];
							
				}
			}
		}
		System.out.println("A soma das Diagonais �: " + somaD);
		System.out.println("\nA soma de todos os n�meros da matriz �: " + somaG + "\n\n");
		ler.close();
	}

}
