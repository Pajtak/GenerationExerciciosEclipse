package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio06 {
	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, cont = 0, soma = 0, media = 0;
		
		do {
		System.out.println("Digite aqui o seu n�mero: ");
		n = ler.nextInt();
		
		if (n % 3 == 0 && n != 0) {
			soma += n;
			cont ++;
			media = soma/cont;
		}			
		} while (n != 0);
		System.out.println("A m�dia final �: " + media);
		ler.close();
			
		
			
		
		
	}

}
