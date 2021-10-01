package br.com.generationExerciciosLogica;

import java.util.Scanner;

public class EventoFábrica {
	
	/*Criar um sistema que define o tempo de um evento de segundos em Horas, Minutos e Segundos
	Autor: Bruno Pajtak
	Data 23/09/2021*/
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, segundostotais;

		System.out.println("Digite aqui quantos segundos durou o evento: ");
		segundostotais = leia.nextInt();

          //Transformar segundos em horas//
		horas = (segundostotais / 3600);
		segundostotais = (segundostotais % 3600);
		
		//Transformar segundos em minutos//
		minutos = (segundostotais / 60);
		segundostotais = (segundostotais % 60);

		

		//Contabilizando os segundos restantes//

		segundos = segundostotais;

		System.out.println("O seu evento vai durar: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
		
		leia.close();
	}

}
