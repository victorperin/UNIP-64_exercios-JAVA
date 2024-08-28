import java.util.Scanner;

/**
 * Exercicio
 */
public class Exercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = new int[4];

		System.out.println("Exercíco 4 , leia o enunciado.\n\n");//Desisto, jamais!!

		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o valor " + (i + 1) + ": ");
			valores[i] = entrada.nextInt();
		}	

	System.out.println("\nResultados:\n\n");

	System.out.println("Valor 1 e Valor 2:\n");
	System.out.println("    "+valores[0] + " + "+valores[1]+ " = "+(valores[0]+valores[1])+"\n" );
	System.out.println("     "+valores[0]+ " * " +valores[1]+ " = " +(valores[0]*valores[1])+"\n\n");
	
	System.out.println("Valor 1 e valor 3:\n");
	System.out.println("   "+valores[0]+" + "+valores[2]+ " = "+(valores[0]+valores[2])+"\n");
	System.out.println("   "+valores[0]+" * "+valores[2]+ " = "+(valores[0]*valores[2])+"\n\n");	

	System.out.println("Valor 1 e Valor 4:\n");
	System.out.println("   "+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
	System.out.println("   "+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");

	System.out.println("Valor 2 e Valor 3:\n");
	System.out.println("   "+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
	System.out.println("   "+valores[1]+" * "+valores[2]+" = " +(valores[1]*valores[2])+"\n\n");
	
	System.out.println("Valor 2 e Valor 4:\n");
	System.out.println("   "+valores[1]+" + "+valores[3]+ " = "+(valores[1]+valores[3])+"\n");
	System.out.println("   "+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

	System.out.println("Valor 3 e Valor 4:\n");
	System.out.println("   "+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
	System.out.println("   "+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");

	}
}
