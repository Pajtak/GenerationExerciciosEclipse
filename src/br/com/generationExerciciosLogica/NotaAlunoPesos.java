package br.com.generationExerciciosLogica;

import java.util.Scanner;

public class NotaAlunoPesos {
	/*Criar um sistema capaz de calcular a nota de um aluno com base em 3 notas distintas com pesos diferentes
	Autor: Bruno Pajtak
	Data: 01/10/2021*/
	
	public static void main(String[] args) {
        
		Scanner leia = new Scanner(System.in);
		double notaA, notaB, notaC, media;
		
		System.out.println("Coloque a primeira nota do aluno: ");
		notaA = leia.nextDouble();

		System.out.println("Coloque a segunda nota do aluno: ");
		notaB = leia.nextDouble();

		System.out.println("Coloque a terceira nota do aluno: ");
		notaC = leia.nextDouble();

		//O valor da média

		media = ((notaA * 0.2) + (notaB * 0.3) + (notaC * 0.5));

		 System.out.println("A média total do aluno foi de: " + media);
		 
		 leia.close();
		 

	}

}
