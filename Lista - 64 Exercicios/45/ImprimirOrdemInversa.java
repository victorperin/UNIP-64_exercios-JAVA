/*******************************************************************************
* 45) Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
* foi realizada a leitura.
*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;

/**
 * ImprimirOrdemInversa
 */
public class ImprimirOrdemInversa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade;

		System.out.println("Digite a quantidade de números: ");
		quantidade = entrada.nextInt();

		int[] numeros = new int[quantidade];

		for(int x=0; x< quantidade; x++) {
			System.out.println("Digite o " + (x+1) + " ° Número: ");
			numeros[x] = entrada.nextInt();
		}
		
		for (int j =quantidade-1; j >= 0; j--) {
            System.out.printf(" %d ",numeros[j]);
        }
		
	}
}