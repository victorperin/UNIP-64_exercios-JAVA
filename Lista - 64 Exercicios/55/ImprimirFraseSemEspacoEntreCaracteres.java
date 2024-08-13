/*******************************************************************************
* 55) Fazer um programa que leia uma frase de até 50 caracteres e imprima a
* frase sem os espaços em branco.
* Imprimir também a quantidade de espaços em branco da frase.
*******************************************************************************/

import java.util.Scanner;

/**
 * ImprimirFraseComEspacoEntreCaracteres
 */
public class ImprimirFraseSemEspacoEntreCaracteres {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String frase;
        String novaFrase="";

        do {
                System.out.println("Digite sua frase (até 50 caracteres): ");
                frase = entrada.nextLine();
        } while (frase.length()>50);
        
        char[] arrayChars = frase.toCharArray();

        for(int x=0; x < arrayChars.length; x++) {
            if (arrayChars[x] != ' ') {
                novaFrase = novaFrase + arrayChars[x];
            }
        }
            System.out.println("Nova frase: " + novaFrase);
    }

    
}