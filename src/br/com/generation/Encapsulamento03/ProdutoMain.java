package br.com.generation.Encapsulamento03;

public class ProdutoMain {
	/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ProdutoAtributos produto1 = new ProdutoAtributos();
	
	produto1.setGadget("Iphone 13");
	produto1.setMarca("Apple");
	produto1.setMemoria("1 TB");
	
	System.out.println("Nome do Aparelho: " + produto1.getGadget());
	System.out.println("Marca do Aparelho: " + produto1.getMarca());
	System.out.println("Capacidade do Aparelho: " + produto1.getMemoria());
	
	}

}
