package br.com.generationExerciciosLogica;

import java.util.Scanner;

public class CustoFinalCarro {
	
	/*Escrever o valor do custo final de um carro apenas colocando o valor do custo de f�brica
	  Autor: Bruno Pajtak
	  Data: 01/10/2021*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valordefabrica, valordecompra;
		
		System.out.println("Por favor, escreva o valor de f�brica do ve�culo: ");
		valordefabrica = leia.nextDouble();

		//Valor de Produ��o � igual � 27% do valor total, portanto, 73% � necess�rio para se chegar ao valor de compra//

		valordecompra = ((valordefabrica) * 1.73);

		System.out.println("O valor de compra desse ve�culo �: " + valordecompra);
		
		leia.close();

	}

}
