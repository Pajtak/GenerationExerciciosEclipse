package br.com.generation.Heran�as;

public class cavalo extends Mam�feros implements AnimaisDomesticados {
	

	private String correr = "O cavalo come�ou a correr...;";
	
	
	
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	@Override
	public String alimentar(String alimentar) {
		return alimentar = "Dar ra��o para o cavalo";
	}
	@Override
	public String levarveterinario(String levarvet) {
		return levarvet = "Levar o cavalo para o veterin�rio.";
	}
}