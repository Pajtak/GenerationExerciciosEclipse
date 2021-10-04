package br.com.generation.lacoscondicionais;

import javax.swing.JOptionPane;

public class CriandoPanel{

    

	public static void main(String[] args) {

        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque o número:"));

        if(numero % 2 == 0) {
        	JOptionPane.showMessageDialog(null, "O número é Par", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
            System.exit(0);
        }
        else {
        	JOptionPane.showMessageDialog(null, "O número é Impar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }


		
	}


	

