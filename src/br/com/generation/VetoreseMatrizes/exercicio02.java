package br.com.generation.VetoreseMatrizes;

import java.util.Scanner;

public class exercicio02 {
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
	  Autor: Bruno Pajtak
	  Data: 06/10/2021*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valorDado[] = new int[10];
		int media = 0, maiorPont = 0, somaPont = 0, ocor = 0;		
			
		for (int i = 0; i < valorDado.length; i++) {
			System.out.println("Digite o valor do " + (i+1) + "� lan�amento: ");
			valorDado[i] = ler.nextInt();
			somaPont += valorDado[i];
			while(valorDado[i] > 6 || valorDado[i] < 1) {
				System.out.println("Sinto muito, o dado digitado � invalido, digite novamente o " + (i+1) + "� lan�amento:");
				valorDado[i] = ler.nextInt();				
			}
				media = somaPont/valorDado.length;
			  
				if (valorDado[i] > maiorPont) {
				    maiorPont = valorDado[i];
			} 
			    if (maiorPont == valorDado[i]) {
			    	ocor++;
				}
					}		
			System.out.println("A m�dia aritm�tica dos lan�amentos �: " + media);
			System.out.println("O maior resultado foi " + maiorPont + " e ele ocorreu " + ocor + " vezes");
			ler.close();			
	}	 
	}

