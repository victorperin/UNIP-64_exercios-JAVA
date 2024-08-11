/*******************************************************************************
* 48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
* encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
* uma campanha publicitária milionária de produtos de beleza. Foram inscritas
* 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
* foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
* vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
* a campanha milionária.
*******************************************************************************/

import java.util.Scanner;

/**
 * EscolhaModelo
 */
public class EscolhaModelo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroCandidatas = 5;
        int quantidadeAptas = 0;
        String[] nome = new String[numeroCandidatas];
        int[] idade = new int[numeroCandidatas];

        for(int x=0; x < numeroCandidatas; x++) {
            System.out.println("Digite o nome da " +(x+1)+ "ª candidata: ");
            nome[x] = entrada.nextLine();
            System.out.println("Digite a idade da " +(x+1) + "ª canditata: ");
            idade[x] = Integer.parseInt(entrada.nextLine());

            if (idade[x] >= 18 && idade[x] < 21) {  
                    quantidadeAptas++;
            }
        }

        String[] nomeAptas = new String[quantidadeAptas];
        int[] idadeAptas = new int[quantidadeAptas];

        int y = 0;
        for(int x=0; x < numeroCandidatas; x++) {
            if (idade[x] >= 18 && idade[x] < 21) {
                nomeAptas[y] = nome[x];
                idadeAptas[y] = idade[x];
                y++;
            }
        }
        System.out.println();
        for(int x=0; x < quantidadeAptas; x++){
            System.out.printf("Nome: %-30.30s \tIdade: %d\n", nomeAptas[x], idadeAptas[x]);
        }
    }
}