/*******************************************************************************
* 59) Escreva um programa que solicite dois caracteres de A a Z ao usuário e
* imprima o número de caracteres existente entre eles. Assuma que o usuário
* digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir
* mensagem de erro.
* Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9
*******************************************************************************/

import java.util.Scanner;

/**
 * TamanhoDaDiferencaEntreLetrasDoAlfabeto
 */
public class TamanhoDaDiferencaEntreLetrasDoAlfabeto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] alfabeto =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z'};

        System.out.println("Digite o primeiro caractere: ");
        char caractere = (char) entrada.nextLine().toLowerCase().charAt(0);

        int primeiroCaractere = checarCaractere( caractere, alfabeto);

        System.out.println("Digite o segundo caractere: ");
        char caractere2 = (char) entrada.nextLine().toLowerCase().charAt(0);

        int segundoCaractere = checarCaractere(caractere2, alfabeto);
        
        int diferenca = segundoCaractere - primeiroCaractere -1;
        if (primeiroCaractere>=0&&segundoCaractere>=0&&diferenca>=0) {
            System.out.println("O numero de caractares entre eles é: " + diferenca);
        }else{
            System.out.println("ERRO!");
        }

    }
    public static  int checarCaractere(char ch, char[] alfabeto){

        int numero = -1;
        for(int x=0; x < alfabeto.length; x++){
            if (alfabeto[x]==ch) {
                numero = x;
            }
        }
        return numero;
    }
}