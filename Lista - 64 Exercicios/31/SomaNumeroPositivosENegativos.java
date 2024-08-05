/*******************************************************************************
* 31) Escrever um programa que leia um conjunto de n�meros positivos, e exiba se o n�mero
* lido � par ou �mpar. Exiba ao final a soma total dos n�meros pares lidos e tamb�m a soma dos
* n�meros �mpares lidos. Suporemos que o n�mero de elementos deste conjunto n�o �
* conhecido, e que um n�mero negativo ser� utilizado para sinalizar o fim dos dados.
*******************************************************************************/

import java.util.Scanner;

/**
 * SomaNumeroPositivosENegativos
 */
public class SomaNumeroPositivosENegativos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0, quantPar = 0, quantImpar = 0;

        while (numero >= 0){

            System.out.println("Digite um número - Se quiser sair do programa para sair do programa: ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                if (numero % 2 == 0) {
                    quantPar += numero;
                }else{
                    quantImpar += numero;
                }
            }

        }
        System.out.println("\n\nQuantidade de número pares: " + quantPar+"\nquantidade de números impares: " + quantImpar);
    }
}