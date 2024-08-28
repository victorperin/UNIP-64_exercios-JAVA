/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/

import java.util.Scanner;

/**
 * IdadeEmDias
 */
public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idadeAnos /*not anus */, idadeMeses, idadeDias, idadeTotalDias;
        
        System.out.println("Calculadora de idade em dias\n\n");//Existe algum exercício mais aleatário do que esse?!

        System.out.println("Digite os anos: ");
        idadeAnos = entrada.nextInt();

        System.out.println("Digite os meses: ");
        idadeMeses = entrada.nextInt();

        System.out.println("Digite os dias: ");
        idadeDias = entrada.nextInt();

        idadeTotalDias = idadeAnos * 365 +idadeMeses * 30 + idadeDias;

        System.out.println("Idade total em dias = " + idadeTotalDias+"\n");

    }
}

