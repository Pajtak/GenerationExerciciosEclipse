package br.com.generation.lacoscondicionais;

import java.util.Scanner;

public class exercicio3 {
	/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra: 
10 - 14 Infantil
15 - 17 Juvenil
18 - 25 Adulto
	  Autor: Bruno Pajtak
	  Data: 04/10/2021*/
	
	public static void main(String[] args) {
		
		int idade = 0;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite aqui o seu nome: ");
		nome = leia.next();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println(nome +" pertence � categoria Infantil.");
		}
		
		else if (idade >= 15 && idade <= 17) {
			System.out.println(nome +" pertence � categoria Juvenil.");
		}
		
		else if (idade >= 18 && idade <= 25) {
			System.out.println(nome +" pertence � categoria Adulto.");
		}
		
		else {
			System.out.println("Sinto muito, mas " + nome +" n�o pertence � nenhuma categoria.");
		}
		
		leia.close();
		
		

	}

}
