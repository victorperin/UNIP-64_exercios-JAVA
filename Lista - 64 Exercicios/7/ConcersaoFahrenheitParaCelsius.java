/*****************************************************************************************************************
* 7) Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
* 		temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
* 		variável C é a temperatura em graus Celsius.

*****************************************************************************************************************/

import java.util.Scanner;

/**
 * ConcersaoFahrenheitParaCelsius
 */
public class ConcersaoFahrenheitParaCelsius {

		public static void main(String[] args) {

				Scanner entrada = new Scanner(System.in);
				double celsius, fahrenheit;

				System.out.println("Coversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n "); //é basicamente uma copia do exercicios anterior
				fahrenheit = entrada.nextDouble();

				celsius = (fahrenheit - 32) * 5 / 9;

				System.out.println("\nA medida convertida é " + celsius + "°C\n");
		}
}