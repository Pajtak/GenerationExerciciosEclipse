package br.com.generation.lacoscondicionais;

import javax.swing.JOptionPane;

public class exercicio2 {
	/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	 * Autor: Bruno Pajtak
	 * Data:04/10/2021*/

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 1� n�mero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 2� n�mero: "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Coloque o 3� n�mero: "));
		
		if (n1 <= n2 && n1 <= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n1+" "+n2+" "+n3, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n1 <= n2 && n1 <= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n1+" "+n3+" "+n2, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if (n1 >= n2 && n1 <= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n2+" "+n1+" "+n3, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 >= n2 && n1 >= n3 && n2 <= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n2+" "+n3+" "+n1, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n3+" "+n2+" "+n1, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(n1 <= n2 && n1 >= n3 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "A sequ�ncia de n�meros �: "+n3+" "+n1+" "+n2, "Aviso", 
			JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

}
