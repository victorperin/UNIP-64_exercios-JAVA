/*******************************************************************************
* 37) Faça um programa de conversão de base numérica. O programa deverá
* apresentar uma tela de entrada com as seguintes opções:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
* Informe a opção:
* A partir da opção escolhida, o programa deverá solicitar para que o usuário
* digite dois números. Em seguida, o programa deve exibir o resultado da opção
* indicada pelo usuário e perguntar ao usuário se ele deseja voltar ao menu
* principal. Caso a resposta seja  ́S ́ ou  ́s ́, deverá voltar ao menu, caso
* contrário deverá encerrar o programa.
*******************************************************************************/
import java.util.Scanner;

/**
 * ConcersaoDeBaseNumerica
 */
public class ConcersaoDeBaseNumerica {
    private static double primeiro, segundo;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        char charOpcao;
        boolean encerrar = false;

        while (encerrar == false) {
            System.out.println("""
                    Digite uma das opções para as operações :
                    1 - Adição
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    Opção:
                    """);
                    opcao = entrada.nextInt();

                    switch (opcao) {
                            case 1:
                                    pegarNumeros();
                                    System.out.println("Resultado de " +primeiro+ " + "+segundo+ " = "+(primeiro+segundo));
                                    break;

                            case 2:
                                    pegarNumeros();   
                                    System.out.println("Resultado de"+primeiro+ " - "+segundo+" = "+(primeiro-segundo));
                                    break;
                            case 3:
                                    pegarNumeros();
                                    System.out.println("Resultado de "+primeiro+ " * "+segundo+ " = " +(primeiro*segundo));
                                    break;
                            case 4: 
                                    pegarNumeros();
                                    System.out.println("Resulta de"+primeiro+ " / " +segundo+ " = "+(primeiro/segundo));
                                    break;
                                    
                            default:
                                    System.out.println("Opção inválida");
                                    break;

                    }


                    System.out.println("Deseja continuar?(s/n)");
                    charOpcao = entrada.next().charAt(0);
                    if (charOpcao == 'N' || charOpcao == 'n') {
                            encerrar = true;
            }    
        }
    }

    public static void pegarNumeros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeio número: ");
        primeiro = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundo = entrada.nextDouble();
    }
}