package br.com.generation.lacoscondicionais;


import javax.swing.JOptionPane;

public class exercicio1{
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.
	 * Autor: Bruno Pajtak
	 * Data:04/10/2021*/

	public static void main(String[] args) {
		int n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1º número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2º número: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 3º número: "));
		
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, "O maior número é: "+n1, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "O maior número é: "+n2, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n3 > n1 && n3 > n2) {
			JOptionPane.showMessageDialog(null, "O maior número é: "+n3, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
				
		
		
		
	  

	}

}
