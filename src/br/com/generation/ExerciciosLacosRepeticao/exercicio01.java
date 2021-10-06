package br.com.generation.ExerciciosLacosRepeticao;

public class exercicio01 {
	/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/

	public static void main(String[] args) {
		
		int   cont = 0, valor;
		
		for (valor = 1000; valor <= 1999; valor++) {
			cont++;
			if (valor % 11 == 5) {
				
				System.out.println(cont + "º valor: " + valor);
			}
			
		}

	}

}
