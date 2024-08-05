/*******************************************************************************
* 30) Faça um programa para imprimir uma tabuada.
*******************************************************************************/

import java.util.Scanner;

/**
 * ImprimiTabuada
 */
public class ImprimiTabuada {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        System.out.println();

        for(int i = 0 ; i <=10; i ++){
            System.out.printf("%d x %d = %d\n ", numero, i, numero*i);
        }
    

    }
}