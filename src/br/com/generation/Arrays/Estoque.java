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
		System.out.println("Qual opera��o voc� deseja realizar?");
		System.out.println("Digite:\n[0] Para sair do programa \n[1] Para Registrar um novo Produto \n[2] Para Remover Produtos \n[3] Para Atualizar a Quantidade e o Pre�o de um Produto"
		+ "\n[4] Remover completamente um Produto do Estoque \n ");
		int opcao = sc.nextInt();
	try {
	if (opcao == 1) {
		System.out.println("Quantos produtos voc� deseja registrar? ");
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
			System.out.println("\n\nDesculpe, mas voc� n�o digitou o nome de um Produto V�lido");
	}
	if (opcao == 2) {
		System.out.println("Qual o Produto que voc� quer diminuir a quantidade? ");
		sc.nextLine();
		nome = sc.nextLine();
		int pos = temProd(list, nome);
		System.out.println(pos);
		if (pos == -1) {
			System.out.println("Esse produto n�o existe.");}
		else {
			System.out.println("Digite a quantidade que voc� deseja remover: ");
			list.get(pos).removeProd(sc.nextInt());}}
	if (opcao == 3) {
		System.out.println("Qual o item que voc� quer Atualizar? ");
		sc.nextLine();
		nome = sc.nextLine();
		int pos = temProd(list, nome);
		System.out.println("Voc� deseja atualizar:\n[1] Pre�o \n[2]Quantidade");
		int opc1 = sc.nextInt();
			if (opc1 == 1) {
				if (pos == -1) {
					System.out.println("Esse produto n�o existe.");}
				else {
					System.out.println("Digite o novo pre�o do produto: ");
					list.get(pos).newPreco(sc.nextDouble());}}
			else if (opc1 == 2) {
				if (pos == -1) {
					System.out.println("Esse produto n�o existe.");}
				else {
					System.out.println("Digite quantos novos Produtos voc� deseja adicionar: ");
					list.get(pos).addProd(sc.nextInt());}}}
		if (opcao == 4) {
			System.out.println("Qual o item que voc� quer remover? ");
			sc.nextLine();
			nome = sc.nextLine();
			int pos = temProd(list, nome);
			if (pos == -1) {
				System.out.println("Esse produto n�o existe.");}
			else {
				System.out.println("O produto referido est� na posi��o: " + pos + ". Por favor, digite a posi��o do produto para remov�-lo do estoque: ");
				list.remove(sc.nextInt());}}
		else {
			System.out.println("A op��o escolhida � inv�lida, favor escolha umas das op��es dispon�veis.\n\n");
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
