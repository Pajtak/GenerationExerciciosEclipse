package br.com.generation.Encapsulamento05;

public class PatineteMain {
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console..
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	PatineteAtributos patinete1 = new PatineteAtributos();
	
	patinete1.setMarca("Multilaser");
	patinete1.setModelo("es-205");
	patinete1.setPreco(950.00);
	
	System.out.println("Marca do Patinete: " + patinete1.getMarca());
	System.out.println("Modelo do Patinete: " + patinete1.getModelo());
	System.out.println("Preço do Patinete...R$ " + patinete1.getPreco());
	
	}

}
