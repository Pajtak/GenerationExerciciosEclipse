package br.com.generation.Arrays;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.Position;

public class TestaProduto {
	
	public static void main(String[] args) {
		boolean terminar = false;
		Scanner sc = new Scanner(System.in);
		Funcionario func1 = new Funcionario();
		List<Produto> list = new ArrayList<>();
		String nome;
		
		
		
		
		System.out.println("Para entrar no sistema digite o seu nome:");
		func1.setNome(sc.nextLine());
		System.out.println();
		System.out.println("-----------------------Bem Vindo------------------------");
		System.out.println("-----------------------"+func1.getNome()+"----------------------------");
		System.out.println();
		while (!terminar) {
		System.out.println("Qual operação você deseja realizar?");
		System.out.println("Digite: \n[1] Para Registrar um novo Produto \n[2] Para Remover Produtos \n[3] Para Atualizar a Quantidade e o Preço de um Produto");
		int opcao = sc.nextInt();
		
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
		list.add(prod);
		
		}
		}
		else if (opcao == 2) {
			
		System.out.println("Qual o item que você quer remover? ");
		sc.nextLine();
		nome = sc.nextLine();
		String pos = temProd(list, nome);
			if (pos.equals(null)) {
				System.out.println("Esse produto não existe.");
				}
			else {
				System.out.println("Digite quantos produtos você deseja remover: ");
				list.remove(sc.nextInt());
			}
			
		}
		
		System.out.println("Lista de produtos: ");
		for (Produto e: list) {
			System.out.println(e);
		}
		
		}		
			
		
		
		
		
		terminar = true;
		
		sc.close();	
	}
		public static String temProd (List<Produto> list, String nome) {
			 for (int i = 0; i>list.size(); i++) {
				 if (list.get(i).getNome().equals(nome)) {
					 return nome;
				 }
			 }
			 return null;
		}
			
		
	}


