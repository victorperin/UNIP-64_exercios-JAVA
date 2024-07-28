/*****************************************************************************************************************
* 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
* 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
* 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*****************************************************************************************************************/

import java.util.Scanner;

/**
 * ConcersaoCelsiusParaFahrenheit
 */
public class ConcersaoCelsiusParaFahrenheit {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            double celsius, fahrenheit; //Consegui colocar o nome de variavel mais dificil do mundo" o/

            System.out.println("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n");//Pronto, bem mais simples!

            System.out.println("Digite a temperatura em Celsius: ");
            celsius = entrada.nextDouble();

            fahrenheit = (9 * celsius + 160) / 5;

            System.out.println("\n A medida convertida é " + fahrenheit + " ºF\n");
        
    }
}