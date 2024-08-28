/*******************************************************************************
* 39) Faça um programa que leia um número inteiro e mostre uma mensagem
* indicando se este número é par ou ímpar, e se é positivo ou negativo. O
* programa só deve parar de rodar quando o usuário responder "S" na seguinte
* pergunta, "Deseja encerrar o programa?" .
*******************************************************************************/

import java.util.Scanner;

/**
 * NumeroParOuImparPositivoNegativo
 */
public class NumeroParOuImparPositivoNegativo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char letra;

        do {
            
            System.out.println("Digite um número inteiro: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println(" O número é par.\n ");
            }else{
                System.out.println(" O número é impar ");
            }
            if (numero < 0) {
                System.out.println(" O número é negativo\n ");
            }else{
                System.out.println(" O número é positivo ");
            }

            System.out.println("Deseja sair? (s/n)");
            letra = entrada.next().charAt(0);
            if (letra == 's' || letra == 'S') {
                    parar = true;
            }
        } while (parar==false);
    
    }

}