package br.com.generation.lacoscondicionais;


import javax.swing.JOptionPane;

public class exercicio1{
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	 * Autor: Bruno Pajtak
	 * Data:04/10/2021*/

	public static void main(String[] args) {
		int n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1� n�mero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2� n�mero: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 3� n�mero: "));
		
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n1, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n2, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n3 > n1 && n3 > n2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: "+n3, "Aviso", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
				
		
		
		
	  

	}

}
