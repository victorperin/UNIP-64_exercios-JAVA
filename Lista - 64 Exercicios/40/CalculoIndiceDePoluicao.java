/*******************************************************************************
* 40) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03
* grupos de indústrias que são altamente poluentes do meio ambiente. O índice
* de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as
* indústrias do 1o grupo são intimadas a suspenderem suas atividades, se o
* índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a
* suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
* notificados a paralisarem suas atividades. Faça um programa que leia o índice
* de poluição medido e emita a notificação adequada aos diferentes grupos de
* empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na
* seguinte pergunta, "Deseja encerrar o programa?".
*******************************************************************************/
/**
 * CalculoIndiceDePoluicao
 */
import java.util.Scanner;

public class CalculoIndiceDePoluicao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        boolean parar = false;
        char letra;

        do {

            do {
                    System.out.println("Digite o índice de poluição: ");
                    numero = entrada.nextDouble();
                    if (numero < 0) System.out.println("Número inválido digite um número positivo: ");
            } while (numero < 0);
            
            System.out.println();

            if (numero >= 0 && numero <= 0.25) {
                   System.out.println("Índice de poluição aceitável");  
            }

            if (numero >0.25) {
                    System.out.println("Suspender atividades das indústrias do 1º grupo");
            }

            if (numero >= 0.4) {
                System.out.println("Supender atividades das indústrias do 2º Grupo!");
            }

            if (numero >= 0.5) {
                System.out.println("Supender atividades das indústrias do 3º grupo!");
            }

            System.out.println("\n Deseja encerrar o programa? (s/N) ");
            letra = entrada.next().charAt(0);
            if (letra == 's' || letra == 'S') {
                parar = true;
            }

        } while (parar==false);
    }
}