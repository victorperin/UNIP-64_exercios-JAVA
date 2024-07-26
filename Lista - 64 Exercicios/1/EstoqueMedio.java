import java.util.Scanner;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/
public class EstoqueMedio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double quantidadeMinima, quantidadeMaxima, estoqueMedio;

        System.out.println("Calculadora de Estoque médio: \n\n");

        System.out.println("Digite a quantidade mímima: ");
        quantidadeMinima = entrada.nextDouble();

        System.out.println("Digite a quantidade máxima");
        quantidadeMaxima = entrada.nextDouble();
        
        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("Estoque médio = " + estoqueMedio + "\n");
    }
}


