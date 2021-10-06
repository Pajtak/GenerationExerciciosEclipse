package br.com.generation.ExerciciosLacosRepeticao;

public class exercicio01 {
	/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/

	public static void main(String[] args) {
		
		int   cont;
		
		for (cont = 1000; cont <= 1999; cont++) {
			
			if (cont % 11 == 5) {
				
				System.out.println(cont);
			}
			
		}

	}

}
