/*******************************************************************************
* 38) Faça um programa que leia as variáveis C e N, respectivamente código e
* número de horas trabalhadas de um operário. E calcule o salário sabendo-se que
* ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o
* excesso de pagamento armazenando-o na variável E, caso contrário zerar tal
* variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
* imprimir o salário total e o salário excedente. O programa só deve parar de
* rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o
* programa?".
*******************************************************************************/

import java.util.Scanner;

/**
 * CalculoSalario
 */
public class CalculoSalario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int c;
		double n, e = 0, precoHora, precoExcedente;
		boolean continuar = true;
		char texto;
	
		do {
			 e = 0;
			 precoHora = 10;
			 precoExcedente = precoHora * 2;

			 System.out.println("Digite o código do operario: ");
			 c = entrada.nextInt();

			 System.out.println("Digite o número de horas trabalhadas: ");
			 n = entrada.nextDouble();

			 if (n > 50) {
				
				e = n - 50;
			 }

			 System.out.println("\nID: " +c+ "\nSalario: " +(n*precoHora)+ " \nSalario excedente: " +(e*precoExcedente)+"\nSalario total: " +(e*precoExcedente+n*precoHora)+"\n\nDeseja encerrar o programa?(s/n)");
			 texto = entrada.next().charAt(0);
			 if (texto == 's' || texto == 'S') {
					continuar = false;
			 }
		} while (continuar);
	
	}

}