package br.com.generationExerciciosLogica;

import java.util.Scanner;
public class SistemaEquacoesLineares {
	
	/*Um sistema de equações lineares do tipo: ax + bx = c, dx + ey = f, pode ser resolvido
	segundo mostrado abaixo: x = ce - bf / ae - bd e y = af - cd / ae - bd.
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	valores de x e y.
	  Autor: Bruno Pajtak
	  Data: 01/10/2021 */
				

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Escreva o valor de a: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de b: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de c: ");
		c = leia.nextDouble();
		
		System.out.println("Escreva o valor de d: ");
		d = leia.nextDouble();
		
		System.out.println("Escreva o valor de e: ");
		e = leia.nextDouble();
		
		System.out.println("Escreva o valor de f: ");
		f = leia.nextDouble();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		
		c = (a*x + b*x);
		f = (d*x + e*y);
		
		
	
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);	
		
		leia.close();
		
		
	
	}

}
