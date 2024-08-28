/*******************************************************************************
* 24) Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja
* realizar:
* 1 – Verificar se um dos números lidos é ou não múltiplo do outro
* 2 – Verificar se os dois números lidos são pares
* 3 – Verificar se a média dos dois números é maior ou igual a 7.
* 4 – Sair
*******************************************************************************/

import java.util.Scanner;

/**
 * EscolherOpcoes
 */
public class EscolherOpcoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double primeiroNumero, segundoNumero, resultado;
        int menu = 0;
        //int loopMenu;

            System.out.println("Digite o primeiro número: ");
            primeiroNumero = entrada.nextDouble();
    
            
            System.out.println("Digite o segundo número: ");
            segundoNumero = entrada.nextDouble();

    
            while (menu != 4) {
                System.out.println("\nVocê deseja verificar se...\n\t1 - um dos números lidos é ou não múltiplo do outro\n\t2 - os dois números lidos são pares\n\t3 - a média dos dois números é maior ou igual a 7\n\t4 - Sair\n");
                menu = entrada.nextInt();

                switch (menu) {
                    case 1:
                        if (primeiroNumero%segundoNumero==0 || segundoNumero%primeiroNumero==0) {
                            System.out.println("Sim, um dois números é múltiplo deo outro");
                        }else{
                            System.out.println("Não, nenhum dos números é mútiplos dos outros");
                        }
                        break;
                    case 2:
                        if (primeiroNumero%2==0 || segundoNumero%2==0) {
                            System.out.println("Sim, os dois números lidos são pares");
                        }else{
                            System.out.println("Não, os dois números lidos são ímpares");
                        }
                        break;
                    case 3:
                        if ((primeiroNumero+segundoNumero)/2 >= 7) {
                            System.out.println("Sim,a média dos dois números é maior ou igual a 7");
                        }else{
                            System.out.println("Não, a média dos dois números não é maior que 7");
                        }
                        break;
                    case 4:
                            System.out.print("Saindo...\n");
                        break;
                
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        }

}
