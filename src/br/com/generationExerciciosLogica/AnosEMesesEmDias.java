package br.com.generationExerciciosLogica;


import java.util.Scanner;

public class AnosEMesesEmDias {
	/*Escrever um sistema que permite dizer o número de dias baseado no número de anos, meses e dias que uma pessoa viveu
	Autor: Bruno F Pajtak
	Data 23/09/2021*/

	
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	

	int anos, meses, dias, diastotais;


	System.out.println("Coloque aqui quantos anos você têm: ");
	anos = leia.nextInt();

	System.out.println("Coloque aqui quantos meses você tem: ");
	meses = leia.nextInt();

	System.out.println("Coloque aqui quantos dias você tem: ");
	dias = leia.nextInt();

	//Convertendo anos em dias//
	anos = ((dias) + (anos * 365));


	//Convertendo meses em dias//
	meses = ((dias) + (meses * 30));

	//Convertendo os dias restantes

	diastotais = (dias + anos + meses);

	

	System.out.println("Você possúi: " + diastotais + " dias.");
	
	leia.close();
}
}