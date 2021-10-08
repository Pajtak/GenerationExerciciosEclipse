package br.com.generation.Encapsulamento06;

public class ContaMain {
	/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ContaAtributos conta1 = new ContaAtributos();
	
	conta1.setDonoConta("John Smith");
	conta1.setCpf("129.342.456-21");
	conta1.setSaldo(234.76);
	
	System.out.println("Nome do titular da Conta: " + conta1.getDonoConta());
	System.out.println("CPF do titular da Conta: " + conta1.getCpf());
	System.out.println("Saldo Corrente: " + conta1.getSaldo());
	
	}

}
