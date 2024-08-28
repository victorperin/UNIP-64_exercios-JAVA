/*******************************************************************************
* 49) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
* Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
* mesmas posições.
*******************************************************************************/

import java.util.Scanner;

/**
 * CompararDoisVetores
 */
public class CompararDoisVetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroComponentes;

        System.out.println("Digite o número de posições: ");
        numeroComponentes = entrada.nextInt();
        System.out.println();

        int[]  v1 = new int[numeroComponentes];
        int[]  v2 = new int[numeroComponentes];

        for(int x = 0; x < numeroComponentes; x++) {
            System.out.println("Digite um valor para a posição " +(x+1)+ " do vetor 1\n");
            v1[x] = entrada.nextInt();
        }

        for(int x=0; x<numeroComponentes; x++){
            System.out.println("\nDigite um valor para a posição " +(x+1)+ " do vetor 2");
            v2[x] = entrada.nextInt();
        }
        System.out.println();
        for(int x = 0; x < numeroComponentes; x++){
            if (v1[x] == v2[x]) {
                System.out.println("\nValores das posições " +(x+1)+ " dos valores é igual.");
            }
        }
    }
}
