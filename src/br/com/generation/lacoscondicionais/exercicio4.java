package br.com.generation.lacoscondicionais;

import javax.swing.JOptionPane;

public class exercicio4 {
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
	  Autor: Bruno Pajtak
	  Data: 04/10/2021*/

	public static void main(String[] args) {
		
		double n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o seu n�mero: "));
		
		if (n % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "O n�mero digitado � Par e a sua raiz �: "
			+ Math.sqrt(n), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero � �mpar e elevado ao quadrado "
			+ "o resultado � "+ Math.pow(n, 2.0), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

}
