/*******************************************************************************
* 10) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

import java.util.Scanner;

/**
 * RelacaoEntreDoisNumeros
 */
public class RelacaoEntreDoisNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroNumero, segundoNumero;
        boolean igual=false, diferente = false, maior=false, menor=false, maiorOuIgual=false, menorOuIgual=false; 

        System.out.println("Mostrador de relacionamento\n\n"); //Mais um exercicio away

        System.out.println("Digite o primeiro número: ");
        primeiroNumero =entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = entrada.nextInt();

        if(primeiroNumero == segundoNumero) igual = true;
        if(primeiroNumero != segundoNumero) diferente = true;
        if(primeiroNumero > segundoNumero) maior = true;
        if(primeiroNumero < segundoNumero) menor = true;
        if(primeiroNumero >= segundoNumero) maior = true;
        if(primeiroNumero <= segundoNumero) menorOuIgual = true;

        System.out.println("\n igual =" + igual);
        System.out.println("\n diferente =" + diferente);
        System.out.println("\n Maior =" + maior);
        System.out.println("\n menor =" + menor);
        System.out.println("\n maior igual =" + maiorOuIgual);
        System.out.println("\n menor igual =" + menorOuIgual);  
    
    }
}
