/*******************************************************************************
* 14) Escreva um programa que leia dois números e apresente a diferença do
* maior para o menor.
*******************************************************************************/

import java.util.Scanner;

/**
 * DiferencaEntre2Numeros
 */
public class DiferencaEntre2Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroNumero, segundoNumero, diferenca;

        System.out.println("Verificar de números\n\n");

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = entrada.nextInt();

        if(primeiroNumero >= segundoNumero){
            diferenca = primeiroNumero - segundoNumero;
            } else {
                diferenca = segundoNumero - primeiroNumero;
        }
        System.out.println("\nA diferença do maior para menor é " + diferenca);
    }
}