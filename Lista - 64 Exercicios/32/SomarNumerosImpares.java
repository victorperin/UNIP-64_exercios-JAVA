/*******************************************************************************
* 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
* n�meros inteiros positivos �mpares a partir do n�mero informado pelo usu�rio menor que 10
* e maior que zero.
*******************************************************************************/

import java.util.Scanner;

/**
 * SomarNumerosImpares
 */
public class SomarNumerosImpares {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, numeroQuadrado, resultado = 0, i = 0;

        
        do {
            System.out.print("Digite um número maior que 0 e menor que 10: ");
			numero = entrada.nextInt();

                if (numero  > 0 && numero < 10 )
                    if (numero % 2 == 1) {
                    resultado += numero * numero;
                     i++;  
            }
            
        } while (i < 3);// Diminuido o a quantidade de numeros para teste ficar mais prático
    
        
        System.out.println("O resultado da soma dos quadrados dos 3 primeiros números \n inteiros positivos ímpares do número infomado é: " + resultado);
}      
}