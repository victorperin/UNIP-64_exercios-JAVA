/*****************************************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 		V = 3.14159 * R * R * A
* 		Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

import java.util.Scanner;

public class CalculoVolumeLataOleo{

		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			double raioLata, alturaLata, volumeLata;

			System.out.println("Cálculo de volume de lata de óleo"); //Porque lata de óleo é especial

			System.out.println("Digite diâmetro da lata (em cm)");
			raioLata = entrada.nextDouble()/2;

			System.out.println("Digite a altura da lata (em cm): ");
			alturaLata = entrada.nextDouble();

			volumeLata= Math.PI * raioLata * raioLata * alturaLata;

			System.out.println("\n O volume da lata é de "+volumeLata+ " cm³\n");
	
	}		

}