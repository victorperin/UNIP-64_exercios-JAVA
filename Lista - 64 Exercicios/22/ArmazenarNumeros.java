/*******************************************************************************
* 22) Faça um programa que leia um número. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ArmazenarNumeros
 */
public class ArmazenarNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> a = new ArrayList<>(); 
        List<Integer> b = new ArrayList<>(); 

        int numero;
        
        System.out.println("Organizador de numeros \n\n");
        
            do {
                System.out.println("Digite um numero, digite 0 se quiser sair do programa");
                 numero = entrada.nextInt();
                if (numero > 0) {   
                    a.add(numero);
                
                    System.out.println("Numero positivo armazenado em A");
                }else if (numero < 0) {
                    b.add(numero);
                    System.out.println("Numero negativo armazenado em B");
                }
                
            } while (numero != 0);

            for ( Integer valorA : a ) 
            System.out.print(" " + valorA); 

            System.out.println("\n\n");
            
            for ( Integer valorB : b ) 
            System.out.print(" " + valorB);

        }
    }
