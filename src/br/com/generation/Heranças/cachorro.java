package br.com.generation.Heranças;

public class cachorro extends Mamíferos implements AnimaisDomesticados, AnimaisEstimacao {
	
	
	private String correr = "O cachorro começou a correr...";
	
	
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	@Override
	public String levarpassear(String levarpassear) {
		return levarpassear = "Levar o cachorro para passear";
		
		
	}
	@Override
	public String brincar(String brincar) {
		return brincar = "Brincar com o cachorro";
		
		
	}
	@Override
	public String alimentar(String alimentar) {
		return alimentar = "Dar ração para o cachorro";
		
	}
	@Override
	public String levarveterinario(String levarvet) {
		return levarvet = "Levar o cachorro para o veterinário";
		
	}
	
	

}
