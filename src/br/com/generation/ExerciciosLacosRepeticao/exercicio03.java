package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;



public class exercicio03 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int menor21 = 0, maior50 = 0, cont = 0;
		
		while (cont != -99) {
			
			System.out.println("Digite a sua idade: ");
			cont = ler.nextInt();
			
			if (cont <= 21) {
				menor21++;
			}
			else if (cont >= 50) {
				maior50++;
			}
			else {
				System.out.println("A idade digitada não é relevante para o programa!");
			}
			
		}
		System.out.println("A quantidade de pessoas menores de 21 anos é: " + menor21);
		System.out.println("A quantidade de pessoas maiores de 50 anos é: " + maior50);
		ler.close();
	}

}
