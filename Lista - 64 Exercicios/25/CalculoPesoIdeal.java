/*******************************************************************************
* 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
* programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
* (h = altura)
*   - Para homens: (72.7*h) - 58
*   - Para mulheres: (62.1 *h) - 44.7
*******************************************************************************/

import java.util.Scanner;

/**
 * CalculoPesoIdeal
 */
public class CalculoPesoIdeal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, pesoIdeal;
        char sexo='n';

        System.out.println("Digite sua altura (em metros): ");
        altura = entrada.nextDouble();

        while (sexo !='m' && sexo != 'M' && sexo != 'h' && sexo != 'H' ) {
            System.out.println("Digite H ou M para especificar o sexo: ");
            sexo = entrada.next(".").charAt(0);

            switch (sexo) {
                case 'h':
                case 'H':
                    pesoIdeal = (72.7 * altura) - 58;
                    System.out.println("Seu peso ideal é de: " +pesoIdeal+" kg. ");   
                    break;
                case 'm':
                case 'M':
                    pesoIdeal = (62.1 * altura) - 44.7;
                    System.out.println("Seu peso ideal é de: " +pesoIdeal+" kg. ");   
                    break;
            
                default:
                    System.out.println("Não é M");
                    break;
            }  
        }
    }
}