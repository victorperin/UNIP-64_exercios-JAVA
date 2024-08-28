/*******************************************************************************
* 61) Escreva um programa que calcule e retorne o salário atualizado através do
* método REAJUSTE. O método deve receber o valor do salário e o índice de
* reajuste.
*******************************************************************************/
/**
 * ReajusteSalario
 */
import java.util.Scanner;


public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o salario atual: ");
		double salarioAtual = entrada.nextDouble();
		System.out.println("Digite o percentualde reajuste: ");
		double reajuste = entrada.nextDouble()/100;

		System.out.println("O novo salario é de R$" + String.format("%.2f", reajusteSalario(salarioAtual, reajuste))+".");
	}

	public static double reajusteSalario(double salario, double indiceReajuste) {
		double novoSalario = salario+(salario*indiceReajuste);
		return novoSalario;
	}

}
