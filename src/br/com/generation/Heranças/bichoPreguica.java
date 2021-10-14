package br.com.generation.Heranças;

public class bichoPreguica extends Mamíferos implements AnimaisSilvestres{
	
	
	private String escalar;
	
	public String getEscalar() {
		return escalar;
	}
	public void setEscalar(String escalar) {
		this.escalar = escalar;
	}
	
	@Override
	public String morarnafloresta(String morarflor) {
		return morarflor = "A preguiça está morando na floresta";
		
	}
	

}
