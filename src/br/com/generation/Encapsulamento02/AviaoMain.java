package br.com.generation.Encapsulamento02;

public class AviaoMain {
	/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	AviaoAtributos aviao1 = new AviaoAtributos();
	
	aviao1.setTipo("Airbus A320");
	aviao1.setMarca("Airbus");
	aviao1.setUtilidade("Passageiros");
	
	System.out.println("Tipo de Aeronave: " + aviao1.getTipo());
	System.out.println("Marca da Aeronave: " + aviao1.getMarca());
	System.out.println("Utilidade da Aeronave: " + aviao1.getUtilidade());
	
	}

}
