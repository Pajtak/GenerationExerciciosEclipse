package br.com.generation.Heranças;

public class cavalo extends Mamíferos implements AnimaisDomesticados {
	

	private String correr = "O cavalo começou a correr...;";
	
	
	
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	@Override
	public String alimentar(String alimentar) {
		return alimentar = "Dar ração para o cavalo";
	}
	@Override
	public String levarveterinario(String levarvet) {
		return levarvet = "Levar o cavalo para o veterinário.";
	}
}