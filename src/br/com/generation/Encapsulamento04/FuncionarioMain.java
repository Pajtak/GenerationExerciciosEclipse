package br.com.generation.Encapsulamento04;

public class FuncionarioMain {
	/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	FuncionarioAtributos funcionario1 = new FuncionarioAtributos();
	
	funcionario1.setNome("Pedro da Silva");
	funcionario1.setHorasTrabalho(200);
	funcionario1.setSalario(3300);
	
	System.out.println("Nome do Funcion�rio: " + funcionario1.getNome());
	System.out.println("Horas trabalhadas no m�s: " + funcionario1.getHorasTrabalho());
	System.out.println("Sal�rio.......... R$" + funcionario1.getSalario());
	
	}

}
