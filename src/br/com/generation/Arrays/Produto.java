package br.com.generation.Arrays;



public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quant;
	
	public Produto() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Produto(String nome, Double preco, Integer quant) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}
	public String toString () {
		return "Produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quant;
	}
	
	public void removeProd (int quant) {
		this.quant -= quant;
	}
	public void addProd (int quant) {
		this.quant += quant;
	}
	public void newPreco (double preco) {
		this.preco = preco;
	}
}




	
	

