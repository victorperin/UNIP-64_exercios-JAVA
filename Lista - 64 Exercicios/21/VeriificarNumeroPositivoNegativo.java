/*******************************************************************************
* 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
* indicando se este número é positivo ou negativo. Pare a execução do programa
* quando o usuário requisitar.
*******************************************************************************/

import java.util.Scanner;

/**
 * VeriificarNumeroPositivoNegativo
 */
public class VeriificarNumeroPositivoNegativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Veirificador de numeros positivos ou negativos\n\n");

        do {
            System.out.println("Digite um numero, se quiser sair digite o numero 0: ");
            numero = entrada.nextInt();
            if (numero >0) {
                System.out.println("Numero positivo");
            }else if (numero < 0) {
                System.out.println("Numero negativo");
            }
            
        } while (numero != 0);
    }
}
