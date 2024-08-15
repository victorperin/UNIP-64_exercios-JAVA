/*******************************************************************************
* 63) Escreva um programa que verifique se um número é par ou ímpar através de
* um método chamado VERIFICA. O método deverá receber um número inteiro (n) e
* deverá retornar a mensagem “PAR” ou “ÍMPAR”.
*******************************************************************************/

import java.util.Scanner;

/**
 * VerificarSeParOuImpar
 */
public class VerificarSeParOuImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println(verifica(numero));
    }
    public static String verifica(int numero) {
        if (numero%2==0) return "PAR";
        else return "ÍMPAR";
    }

}