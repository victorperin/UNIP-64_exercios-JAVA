/*******************************************************************************
2. Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTesteVetor
deverá ser criado um vetor para armazenar 30 objetos do tipo Lampada. O programa deverá exibir o seguinte
menu para o usuário:
1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair

*******************************************************************************/

import java.util.Scanner;

/**
 * LampadaTesteVetor
 */
public class LampadaTesteVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeVetor = 30, quantidadeLampadas=0, opcoes;
		
		Lampada[] lampadas = new Lampada[quantidadeVetor];

		do {
			System.out.println("""
					Digite uma das seguintes opções:
					1 - Cadastrar lâmpada
					2 - Exibir todas as lâmpadas
					3 - Exibir quantidade de lâmpadas cadastradas
					4 - Consultar quanidade de lâmpadas de uma determinada potência (Digitada pelo usuário)
					5 - Exibir os dados das lâmpadas com preço menor do que o médio das lâmpadas cadastradas
					6 - Exibir a quantidade de lâmpadas acessas e apagadas
					0- Sair
					""");
					opcoes = Integer.parseInt(entrada.nextLine());

					switch (opcoes) {
						case 1:
							if (quantidadeLampadas >= quantidadeVetor) {
								System.out.println("Já existem muitas lâmpadas.");
							}else{
								String tipo, cor, marca;
								int voltagem;
								boolean status;
								double preco, potencia;

								System.out.println("Digite o tipo: ");
								tipo = entrada.nextLine();
								System.out.println("Digite a cor: ");
								cor = entrada.nextLine();
								System.out.println("Digite a marca: ");
								marca = entrada.nextLine();
								System.out.println("Digite a voltagem: ");
								voltagem = Integer.parseInt(entrada.nextLine());
								System.out.println("Digite o preço: ");
								preco = Double.parseDouble(entrada.nextLine());
								System.out.println("Digite a potencia: ");
								potencia = Double.parseDouble(entrada.nextLine());
								
								lampadas[quantidadeLampadas] = new Lampada(tipo, cor, marca ,voltagem, preco, potencia, false);
								quantidadeLampadas++;
							}
							break;
						case 2:
								for(int x = 0; x < quantidadeLampadas; x++) {
									System.out.println(lampadas[x].toString());
								}
								break;
						case 3:
								System.out.println("Quantidade de lampadas cadastradas: " + quantidadeLampadas);
								break;
						case 4:
								System.out.println("Digite a potencia que você deseja: ");
								double potenciaProcurada = Double.parseDouble(entrada.nextLine());
								int quanidadeEncontrada = 0;
								for(int x = 0; x < quantidadeLampadas; x++) {
									if (lampadas[x].getPotencia() == potenciaProcurada) {
										quanidadeEncontrada++;	
									}
								}
								System.out.println("Quantidade de lâmpadas com " + potenciaProcurada+ "de potencia: "  + quanidadeEncontrada);
								break;
						case 5:
								double mediaPreco = 0;
								int x;
								for(x = 0; x<quantidadeLampadas; x++){
									mediaPreco += lampadas[x].getPreco();
								}
								mediaPreco = mediaPreco /x;
								for(int y=0; y < quantidadeLampadas; y++){
									double precoAtual = lampadas[y].getPreco();
									if (precoAtual < mediaPreco) {
										System.out.println(lampadas[y].toString());
									}
								}	
								break;
						case 6:
								int quanidadeAscessa = 0, quanidadeApagadas = 0;
								for(x=0; x < quantidadeLampadas; x++){
									if (lampadas[x].getStatus()) quanidadeAscessa++;
								else 
									quanidadeApagadas++;
								}
								System.out.println("Quantidade de lâmpadas acessas: " +quanidadeAscessa+ "\nQuantidade de lâmpadas apagadas: " + quanidadeApagadas);
								break;

			case 0:
				break;
				default:
				System.out.println("Você digitou a opção errada, tente novamente.");
					}

		} while (opcoes != 0);
	}

}