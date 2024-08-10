/*******************************************************************************
* 46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses
* vetores. Ou seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].
*******************************************************************************/

import java.util.Scanner;

/**
 * MultiplicacaoDeVetores
 */
public class MultiplicacaoDeVetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite a quantidade de numero: ");
        quantidade = entrada.nextInt();

        int[] vetorX = new int[quantidade];
        int[] vetorY = new int[quantidade];

        for(int x=0; x < quantidade; x++) {
            System.out.println("Digite  " +(x+1)+ " ° Número do vetor x: ");
            vetorX[x] = entrada.nextInt();
        }
        for(int y = 0; y < quantidade; y++) {
            System.out.println("Digite o " + (y+1)+" ° Número do vetor Y: ");
            vetorY[y] = entrada.nextInt();
        }

        System.out.println("A multiplecação do vetores é:\n ");
        for(int w=0; w < quantidade; w++) {
            System.out.println(vetorX[w]+ " * " + vetorY[w] + " = " +(vetorX[w]*vetorY[w]));
        }
     }
}