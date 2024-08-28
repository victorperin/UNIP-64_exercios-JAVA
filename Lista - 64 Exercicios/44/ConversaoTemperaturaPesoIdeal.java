/*******************************************************************************
* 44) Faça um programa que exiba as opções:
* 	1 – Conversão de Graus Celsius em Graus Fahrenheit
* 	2 – Conversão de Graus Fahrenheit em Graus Celsius
* 	3 – Peso ideal do homem
* 	4 – Peso ideal da mulher
* O programa só deve encerrar quando o usuário digitar  ́S ́ para a pergunta
*  “Deseja encerrar o programa?”
* Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
*******************************************************************************/

import java.util.Scanner;

/**
 * ConversaoTemperaturaPesoIdeal
 */
public class ConversaoTemperaturaPesoIdeal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        char letra; 
        int opcao;

        do {    
                do {
                    System.out.println("Digite um das opções:\n\t1 - Conversão de Graus Celsius em Graus Fahrenheit\n\t2 - Conversão de Graus Fahrenheit em Graus Graus Celsius\n\t3 - Peso ideal do homem\n\t4 - Peso ideal da mulher\n\n");
                    opcao = entrada.nextInt();
                    if (opcao<1 || opcao>4) System.out.println("Opções Errada.\n");
                } while (opcao<1 || opcao>4);

                double celsius, fahrenheit, altura, pesoIdeal;
                
                switch (opcao) {
                    case 1:
                            System.out.println("Digite a temperatura em °C: ");
                            celsius = entrada.nextDouble();
                            fahrenheit = (celsius * 1.8) + 32;
                            System.out.println("A temperatura convertida é : " + fahrenheit+ " °F.\n");
                        break;
                    case 2:
                            System.out.println("Digite a temperatura em °F: ");
                            fahrenheit = entrada.nextDouble();
                            celsius = (fahrenheit - 32) / 1.8;
                            System.out.println("A temperatura convertida é: " + celsius + " °C.\n");
                            break;
                    case 3:
                            System.out.println("Digite a altura: ");
                            altura = entrada.nextDouble();
                            pesoIdeal = (72.7 * altura) - 58;
                            System.out.println("Seu peso ideal é: " +pesoIdeal+" kg");
                            break;
                    case 4:
                            System.out.println("Digite a altura: ");
                            altura = entrada.nextDouble();
                            pesoIdeal = (62.1 * altura) - 44.7;
                            System.out.println("Seu peso ideal é " +pesoIdeal+ " kg");
                    default:
                        System.out.println("Opções Errada.\n");
                }
                System.out.println("\nDeseja encerrar o programa? (s/n)");
                letra = entrada.next().charAt(0);
                if (letra == 's' || letra == 'S') 
                        continuar = false;
            
            } while (continuar);
    }
}