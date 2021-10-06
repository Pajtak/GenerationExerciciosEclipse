package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio04 {
	/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
- o número de pessoas calmas;
- o número de mulheres nervosas;
- o número de homens agressivos;
- o número de outros calmos;
- o número de pessoas nervosas com mais de 40 anos;
- o número de pessoas calmas com menos de 18 anos.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int totalPessoas = 0, idade, mNervosas = 0, hAgressivos = 0, pCalmas = 0, oCalmos = 0, nervosos40 = 0, calmos18 = 0, caracteristica, sexo;
		 
		
		 	while (totalPessoas <= 150) {
		 		System.out.println("Digite aqui a sua idade: ");
		 		idade = ler.nextInt();
		 		System.out.println("Você é do sexo [1]Masculino, [2]Feminino ou [3]Outros? ");
		 		sexo = ler.nextInt();
		 		System.out.println("Você se considera uma pessoa [1]Calma, [2]Nervosa ou [3]Agressiva? ");
		 		caracteristica = ler.nextInt();
		 		totalPessoas++;
		 		if (caracteristica == 1) {
		 			pCalmas++;
		 			}
		 		if (sexo == 2 && caracteristica == 2) {
		 			mNervosas++;
		 		}
		 		if (sexo == 1 && caracteristica == 3) {
		 			hAgressivos++;
		 		}
		 		if (sexo == 3 && caracteristica == 3) {
		 			oCalmos++;
		 		}
		 		if (idade >= 40 && caracteristica == 2) {
		 			nervosos40++;
		 		}
		 		if (idade <= 18 && caracteristica == 1) {
		 			calmos18++;
		 		}		 		
 			}
 		System.out.println("O número de pessoas calmas é: " + pCalmas);
 		System.out.println("O número de mulheres nervosas é: " + mNervosas);
 		System.out.println("O número de homens agressivos é: " + hAgressivos);
 		System.out.println("O número de outres calmos(as, es) é: " + oCalmos);
 		System.out.println("O número de pessoas nervosas com 40 anos ou mais é: " + nervosos40);
 		System.out.println("O número de pessoas calmas com 18 anos ou mais é: " + calmos18);
 		ler.close();
 		
	}

}
