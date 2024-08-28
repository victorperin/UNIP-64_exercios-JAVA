/*******************************************************************************
* 23) Escreva um programa que exiba as seguintes op��es e realize os que se pede em cada
* uma delas:
*		1 � Adi��o
*		2 � Subtra��o
*		3 � Multiplica��o
*		4 � Divis�o
*******************************************************************************/

import java.util.Scanner;

/**
 * EscolherOperacoesMatematicas
 */
public class EscolherOperacoesMatematicas {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double pimeiroNumero, segundoNumero, resultado;
            int menu;
            System.out.println("Menu Calculadora\n\n");
                
                System.out.println("Digite uma das operações a seguir:\n\t1 - Adição\n\t2 - Subtração\n\t3 - Multiplcação\n\t4 - Divisão\n ");
                menu = entrada.nextInt();


                System.out.println("Digite o primeiro número: ");
                pimeiroNumero = entrada.nextDouble();

                System.out.println("Digite o primeiro número: ");
                segundoNumero = entrada.nextDouble();

                switch (menu) {
                    case 1:
                            resultado = pimeiroNumero + segundoNumero;
                            System.out.printf("%.2f + %.2f = %.2f" , pimeiroNumero, segundoNumero, resultado);
                        break;
                    case 2:
                        resultado = pimeiroNumero - segundoNumero;
                        System.out.printf("%.2f - %.2f = %.2f" , pimeiroNumero, segundoNumero, resultado);
                    break;
                    case 3:
                            resultado = pimeiroNumero * segundoNumero;
                            System.out.printf("%.2f * %.2f = %.2f" , pimeiroNumero, segundoNumero, resultado);
                        break;
                    case 4:
                            resultado = pimeiroNumero / segundoNumero;
                            System.out.printf("%.2f / %.2f = %.2f" , pimeiroNumero, segundoNumero, resultado);
                        break;
                    default:
                        break;
                }


        }
    
}
