/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

import java.util.Scanner;

/**
  * ConversorDolarReal
  */
 public class ConversorDolarReal {
  
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    double cotacaoDolar, valorDolar = 0, valorReal;

    System.out.println("Conversor de dolar para real\n\n");

    System.out.println("Digite a cotação do dolar hoje: ");
    cotacaoDolar = entrada.nextDouble();

    System.out.println("Digite o valor em dolar: ");
    valorDolar = entrada.nextDouble();
    
    valorReal = cotacaoDolar * valorDolar;

    System.out.println("O valor em reais é " + valorReal + "\n");

    }
  
 }