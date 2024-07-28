/*****************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
* 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
* 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
* 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
* 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
* 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

import java.util.Scanner;

/**
 * Exercicio
 */
public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double velocidadeMedia, tempoGasto, autonomia = 12; //Velocidade média em Km/h, tempo gasto em horas e autonomia em Km/L.
		double distancia, litrosUsados;
		
		System.out.println("Programa de cálculo da quantidade de litros de combustivel gasta em uma viagem\n\n");//Po que títulos tão grandes?!

		System.out.println("Por favor, digita o tempo que você gastou em sua viagem(haras): ");
		tempoGasto = entrada.nextDouble();

		System.out.println("Por favor, agora digite a velocidade mádia em que você fez e percurso(Km/h): ");
		velocidadeMedia = entrada.nextDouble();

		distancia = velocidadeMedia * tempoGasto;
		litrosUsados = distancia / autonomia;

		System.out.println("\n\n\\nResultados:\n\n");
		System.out.println("Velocidade média = " + velocidadeMedia+"Km/h\n");
		System.out.println("Tempo gasto = " + tempoGasto + "horas\n");
		System.out.println("Distância percorrida = " + distancia +" Km\n" );
		System.out.println("Quantidade de combustivel utilizados: " + litrosUsados + " litros\n");
	}
}