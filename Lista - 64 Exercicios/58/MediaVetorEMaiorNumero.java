/*******************************************************************************
* 58) Fazer um programa para armazenar em um vetor, vários números inteiros e
* positivos e calcular a média. Imprimir também o maior. A quantidade de números
* lidos será definida pelo usuário.
*******************************************************************************/
/**
 * MediaVetorEMaiorNumero
 */
import java.util.Scanner;
import java.util.Arrays;


public class MediaVetorEMaiorNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int quantidade = entrada.nextInt();

        double media = 0;

        int[] numeros = new int[quantidade];

        for(int x=0; x < quantidade; x++) {
            System.out.println("Digite o valor " +(x+1) + " :");
            numeros[x] = entrada.nextInt();
            media += numeros[x];
        }

        media = media/quantidade;
        Arrays.sort(numeros);
        
        for (int i : numeros) {
            System.err.println(i);    
        }
        System.out.println("A média dos valores é: " + media+ "\nO maior valor é: " + numeros[quantidade+1]);

    }
}