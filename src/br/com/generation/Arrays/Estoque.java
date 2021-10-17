package br.com.generation.Arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Estoque {

	public static void getEstoque() {
	boolean terminar = false;
	Scanner sc = new Scanner(System.in);
	Funcionario func1 = new Funcionario();
	List<Produto> list = new ArrayList<>();
	String nome;
			
	System.out.println("Para entrar no sistema digite o seu nome:");
	func1.setNome(sc.nextLine());
	System.out.println();
	System.out.println("-----------------------Bem Vindo------------------------");
	System.out.println("------------------------"+func1.getNome()+"---------------------------");
	System.out.println();
	
	while (!terminar) {
		System.out.println("Qual operação você deseja realizar?");
		System.out.println("Digite:\n[0] Para sair do programa \n[1] Para Registrar um novo Produto \n[2] Para Remover Produtos \n[3] Para Atualizar a Quantidade e o Preço de um Produto"
		+ "\n[4] Remover completamente um Produto do Estoque \n ");
		int opcao = sc.nextInt();
	try {
	if (opcao == 1) {
		System.out.println("Quantos produtos você deseja registrar? ");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o nome do Produto: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Insira o valor do Produto");
			Double preco = sc.nextDouble();
			System.out.println("Insira a quantidade em Estoque: ");
			Integer quant = sc.nextInt();
			Produto prod = new Produto(nome, preco, quant);
			list.add(prod);}}}
	catch (NumberFormatException e) {
			System.out.println("\n\nDesculpe, mas você não digitou o nome de um Produto Válido");
	}
	if (opcao == 2) {
		System.out.println("Qual o Produto que você quer diminuir a quantidade? ");
		sc.nextLine();
		nome = sc.nextLine();
		int pos = temProd(list, nome);
		System.out.println(pos);
		if (pos == -1) {
			System.out.println("Esse produto não existe.");}
		else {
			System.out.println("Digite a quantidade que você deseja remover: ");
			list.get(pos).removeProd(sc.nextInt());}}
	if (opcao == 3) {
		System.out.println("Qual o item que você quer Atualizar? ");
		sc.nextLine();
		nome = sc.nextLine();
		int pos = temProd(list, nome);
		System.out.println("Você deseja atualizar:\n[1] Preço \n[2]Quantidade");
		int opc1 = sc.nextInt();
			if (opc1 == 1) {
				if (pos == -1) {
					System.out.println("Esse produto não existe.");}
				else {
					System.out.println("Digite o novo preço do produto: ");
					list.get(pos).newPreco(sc.nextDouble());}}
			else if (opc1 == 2) {
				if (pos == -1) {
					System.out.println("Esse produto não existe.");}
				else {
					System.out.println("Digite quantos novos Produtos você deseja adicionar: ");
					list.get(pos).addProd(sc.nextInt());}}}
		if (opcao == 4) {
			System.out.println("Qual o item que você quer remover? ");
			sc.nextLine();
			nome = sc.nextLine();
			int pos = temProd(list, nome);
			if (pos == -1) {
				System.out.println("Esse produto não existe.");}
			else {
				System.out.println("O produto referido está na posição: " + pos + ". Por favor, digite a posição do produto para removê-lo do estoque: ");
				list.remove(sc.nextInt());}}
		else {
			System.out.println("A opção escolhida é inválida, favor escolha umas das opções disponíveis.\n\n");
		}
		System.out.println("Lista de produtos: ");
		for (Produto e: list) {
		System.out.println(e);}
		if(opcao == 0) {
			terminar = true;}}
	sc.close();}
	
public static int temProd (List<Produto> list, String nome) {
		Produto produto = list.stream().filter(player -> player.getNome().contains(nome))
	       .findFirst().orElse(null);
			if (produto == null) {
				return -1;}
		return list.indexOf(produto);}


}
