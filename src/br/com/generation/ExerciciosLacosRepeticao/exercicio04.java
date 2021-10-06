package br.com.generation.ExerciciosLacosRepeticao;

import java.util.Scanner;

public class exercicio04 {
	/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
- o n�mero de pessoas calmas;
- o n�mero de mulheres nervosas;
- o n�mero de homens agressivos;
- o n�mero de outros calmos;
- o n�mero de pessoas nervosas com mais de 40 anos;
- o n�mero de pessoas calmas com menos de 18 anos.
	  Autor: Bruno Pajtak
	  Data: 05/10/2021*/
	
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int totalPessoas = 0, idade, mNervosas = 0, hAgressivos = 0, pCalmas = 0, oCalmos = 0, nervosos40 = 0, calmos18 = 0, caracteristica, sexo;
		 
		
		 	while (totalPessoas <= 150) {
		 		System.out.println("Digite aqui a sua idade: ");
		 		idade = ler.nextInt();
		 		System.out.println("Voc� � do sexo [1]Masculino, [2]Feminino ou [3]Outros? ");
		 		sexo = ler.nextInt();
		 		System.out.println("Voc� se considera uma pessoa [1]Calma, [2]Nervosa ou [3]Agressiva? ");
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
 		System.out.println("O n�mero de pessoas calmas �: " + pCalmas);
 		System.out.println("O n�mero de mulheres nervosas �: " + mNervosas);
 		System.out.println("O n�mero de homens agressivos �: " + hAgressivos);
 		System.out.println("O n�mero de outres calmos(as, es) �: " + oCalmos);
 		System.out.println("O n�mero de pessoas nervosas com 40 anos ou mais �: " + nervosos40);
 		System.out.println("O n�mero de pessoas calmas com 18 anos ou mais �: " + calmos18);
 		ler.close();
 		
	}

}
