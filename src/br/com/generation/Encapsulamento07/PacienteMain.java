package br.com.generation.Encapsulamento07;

public class PacienteMain {
	/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
	  Autor: Bruno Pajtak
	  Data: 07/10/2021*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	PacienteAtributos paciente1 = new PacienteAtributos();
	
	paciente1.setNome("John Smith");
	paciente1.setIdade(34);
	paciente1.setDoença("Sífilis tardia");
	paciente1.setTratRecom("Injeções de Penicilína Semanalmente: 3 doses");
	
	System.out.println("Nome do Paciente: " + paciente1.getNome());
	System.out.println("Idade do Paciente: " + paciente1.getIdade());
	System.out.println("Enfermidade: " + paciente1.getDoença());
	System.out.println("Tratamento indicado: " + paciente1.getTratRecom());
	
	}

}
