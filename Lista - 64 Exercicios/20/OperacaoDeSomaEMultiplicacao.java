/*******************************************************************************
* 20) Escrever um programa declarando tr�s vari�veis do tipo inteiro (a, b e c). Ler um valor
* maior que zero para cada vari�vel (se o valor digitado n�o � v�lido, mostrar mensagem e ler
* novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
* menor.
*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;

/**
 * OperacaoDeSomaEMultiplicacao
 */
public class OperacaoDeSomaEMultiplicacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.println("Verificador de variáveis \n\n"); //seria melhor fazer com matrizes

                for(int x  = 0; x < 3; x++) {
                    System.out.println("Digite o valor "+(x+1)+":");
                    valores[x] = entrada.nextInt();
                    while (valores[x] < 0) {
                        System.out.println("Digite um valor válido no valor" +(x+1)+":");
                        valores[x] = entrada.nextInt();
                    }
                }
                Arrays.sort(valores);
                System.out.println("Exibe o menor valor lido multiplicado pelo maior: " +(valores[0]*valores[2])+ " e maior valor dividido pelo menor "+(double)(valores[2]/(double)valores[0]));
    }
}

