package br.com.generation.lacoscondicionais;

import javax.swing.JOptionPane;

public class exercicio2 {
	/*Faça um programa que entre com três números e coloque em ordem crescente.
	 * Autor: Bruno Pajtak
	 * Data:04/10/2021*/

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1º número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2º número: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 3º número: "));
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n1+" "+n2+" "+n3, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n1 <= n2 && n1 <= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n1+" "+n3+" "+n2, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n1 >= n2 && n1 <= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n2+" "+n1+" "+n3, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 >= n2 && n1 >= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n2+" "+n3+" "+n1, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n3+" "+n2+" "+n1, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 <= n2 && n1 >= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequência de números é: "+n3+" "+n1+" "+n2, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

}
