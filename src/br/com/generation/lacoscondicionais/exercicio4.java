package br.com.generation.lacoscondicionais;

import javax.swing.JOptionPane;

public class exercicio4 {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
	  Autor: Bruno Pajtak
	  Data: 04/10/2021*/

	public static void main(String[] args) {
		
		double n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o seu número: "));
		
		if (n % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "O número digitado é Par e a sua raiz é: "
			+ Math.sqrt(n), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "O número é Ímpar e elevado ao quadrado "
			+ "o resultado é "+ Math.pow(n, 2.0), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

}
