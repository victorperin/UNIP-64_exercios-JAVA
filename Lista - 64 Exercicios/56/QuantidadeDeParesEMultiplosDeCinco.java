/*******************************************************************************
* 56) Fazer um programa para ler um vetor de inteiros positivos de 50 posições.
* Imprimir a quantidade de números pares e de múltiplos de 5.
*******************************************************************************/
/**
 * QuantidadeDeParesEMultiplosDeCinco
 */
import java.util.Scanner;


public class QuantidadeDeParesEMultiplosDeCinco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numerosInteiros = new int[50];
        int quantidadeParesMaioresDeCinco = 0, x =0;

        while ((x < 50
        )) {
            System.out.println("Digite um número inteiro para  a posição "+(x+1) +":");
            numerosInteiros[x] = entrada.nextInt();
            if (numerosInteiros[x] > 0) {
                if (numerosInteiros[x]%5==0&&numerosInteiros[x]%2==0) {
                    quantidadeParesMaioresDeCinco++;
                }
                x++;
            }
        }
        System.out.println("\nA quantidade de números pares e multiplos de 5 é: " + quantidadeParesMaioresDeCinco);
    }
}
