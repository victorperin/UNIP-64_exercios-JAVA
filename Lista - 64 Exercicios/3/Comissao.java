/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

*************************************************************************/

import java.util.Scanner;

/**
 * Comissao
 */
public class Comissao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa par pagamento de comissão de vendedores de peças. \n\n"); //Why so specific?!
		
		int idVendedor, idPeca;
		float precoPeca, quantidade, valorComissao, porcentagemComissao = 0.05f;

		System.out.println("Digite a identificação do vendedor: ");
		idVendedor = entrada.nextInt();

		System.out.println("Digite o ID da peça: ");
		idPeca = entrada.nextInt();

		System.out.println("Digite o preço unitario da peca: ");
		precoPeca = entrada.nextFloat();

		System.out.println("Digite a quantidade de peças vendidas");
		quantidade = entrada.nextFloat();

		valorComissao = (precoPeca * quantidade) * porcentagemComissao;

		System.out.printf("O valor da comissao é de %.2f reis.\n", valorComissao);

	}
}