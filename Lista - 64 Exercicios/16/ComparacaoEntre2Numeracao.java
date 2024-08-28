/*******************************************************************************
* 16) Escreva um programa que leia dois números e exiba mensagem informando o
* valor do maior número e o valor do menor número. Se os dois números forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

import java.util.Scanner;

public class ComparacaoEntre2Numeracao {

      public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int primeiroNumero, segundoNumero;

            System.out.println("Verificado de números\n\n");

            System.out.println("Digite o primeiro número: ");
            primeiroNumero = entrada.nextInt();

            System.out.println("Digite o segundo número: ");
            segundoNumero = entrada.nextInt();

            if (primeiroNumero > segundoNumero) {
              System.out.println("O primeiro numero digitado é maior que o segundo");
            }else if (primeiroNumero < segundoNumero) {
              System.out.println("O primeiro numero digitado é menor que o segundo numero");
            }else {
              System.out.println("Os dois números são iguais.");
            }
      }

}
