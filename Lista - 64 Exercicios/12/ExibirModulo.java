/*******************************************************************************
* 12) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/

import java.util.Scanner;

/**
 * ExibirModulo
 */
public class ExibirModulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, moduloNumero;

        System.out.println("Modulo de numero \n\n"); //Finalmente...
        numero = entrada.nextInt();


        moduloNumero = (numero < 0)? moduloNumero = numero*(-1):numero;

        System.out.println("O modulo do numero é " + moduloNumero + "\n");
    }

}
