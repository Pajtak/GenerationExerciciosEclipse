package br.com.generation.VetoreseMatrizes;

import java.util.Scanner;

public class exercicio03 {
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
	  Autor: Bruno Pajtak
	  Data: 06/10/2021*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] n1 = new int[2][2];
		int[][] n2 = new int[2][2];
		int[][] M1 = new int[2][2];
		int[][] M2 = new int[2][2];
		
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.println("Digite os números da 1ª Matriz: ");
				n1[l][c] = ler.nextInt();
			}
		}
		for (int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.println("Digite os números da 2ª Matriz: ");
				n2[l][c] = ler.nextInt();
			}
			}
		System.out.println();
			for (int l = 0; l < M1.length; l++) {
				for(int c = 0; c < M1[l].length; c++) {
					M1[l][c] = n1 [l][c]+ n2[l][c];
					System.out.printf("[" + M1[l][c] + "]");
				}
			}
			System.out.println();
			for (int l = 0; l < M2.length; l++) {
				for(int c = 0; c < M2[l].length; c++) {
					M2[l][c] = n1 [l][c]+ n2[l][c];
					System.out.printf("[" + M2[l][c] + "]");
				}
			}
			ler.close();
				}
		
		
	}

