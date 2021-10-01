package br.com.generationExerciciosLogica;

import java.util.Scanner;

public class DistanciaPontosVariaveis {
	
	/*Escrever um sistema que possa calcular a distância tendo como dados dois pontos variáveis
	Autor: Bruno Pajtak
	Data: 01/10/2021*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double x1, y1, x2, y2, d;

		System.out.println("Favor insira o valor de x1: ");
		x1 = leia.nextDouble();

		System.out.println("Favor insira o valor de y1: ");
		y1 = leia.nextDouble();

		System.out.println("Favor insira o valor de x2: ");
		x2 = leia.nextDouble();

		System.out.println("Favor insira o valor de y2: ");
		y2 = leia.nextDouble();

		d = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow(y2-y1, 2));

		System.out.println("O valor da distância é: " + d);

	}

}
