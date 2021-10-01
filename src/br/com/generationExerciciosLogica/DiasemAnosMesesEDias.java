package br.com.generationExerciciosLogica;

import java.util.Scanner;

public class DiasemAnosMesesEDias {
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	  expressa em anos, meses e dias.
	  Autor: Bruno Pajtak
	  Data: 01/10/2021*/
	
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, diastotais;


		System.out.println("Coloque aqui quantos dias você já viveu: ");
		diastotais = leia.nextInt();
		

		
		//Convertendo dias em anos//
		anos = (diastotais / 365);
		diastotais = (diastotais % 365);


		//Convertendo dias em meses//
		meses = ((diastotais / 30));
		diastotais = (diastotais % 30);

		//Convertendo os dias restantes

		dias = diastotais;

		

		

		System.out.println("Você possúi: " + anos + " anos," + meses + " meses e " + dias + " dias.");
		
       leia.close();
	}

}
