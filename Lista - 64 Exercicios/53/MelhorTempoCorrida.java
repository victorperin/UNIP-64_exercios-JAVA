/*******************************************************************************
* 53) Durante uma corrida de automóveis com N voltas de duração foram anotados
* para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
* programa para ler os tempos das N voltas, calcular e imprimir:
* 	i. melhor tempo;
* 	ii. a volta em que o melhor tempo ocorreu;
* 	iii. tempo médio das N voltas;
*******************************************************************************/

import java.util.Scanner;

/**
 * MelhorTempoCorrida
 */
public class MelhorTempoCorrida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroVoltas, total = 0, media, melhorTempo=0, melhorVolta=0;

        System.out.println("Digite o número de voltas: ");
        numeroVoltas = entrada.nextInt();

        int[] tempos = new int[numeroVoltas];
        for(int x=0; x<numeroVoltas; x++){
            System.out.println("Digite o tempo da " +(x+1) +"ª volta (em segndos):");
            tempos[x] = entrada.nextInt();
            total += tempos[x];
            if (tempos[x]<melhorTempo || x==0) {
                melhorTempo = tempos[x];
                melhorVolta = x+1;
            }
        }
        media =total/numeroVoltas;

        System.out.println("i. O melhor tempo foi " + melhorTempo+ " segundos.");
        System.out.println("ii.  Melhor volta foi a " +melhorVolta + " ª.");
        System.out.println("iii. A média de tempo foi: " + media);
    }
}