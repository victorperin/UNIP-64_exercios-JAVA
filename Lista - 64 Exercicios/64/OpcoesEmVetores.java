import java.util.Scanner;

/*******************************************************************************
* 64) Escreva um programa que deverá ter as seguintes opções:
* 1 - Carregar Vetor
* 2 - Listar Vetor
* 3 - Exibir apenas os números pares do vetor
* 4 - Exibir apenas os números ímpares do vetor
* 5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
* 6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
* 7 - Sair
* Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
*******************************************************************************/
public class OpcoesEmVetores {

	 private static int[] vetor = new int[10];
	 private static Scanner entrada = new Scanner(System.in);
	 public static void main(String[] args) {
		
		boolean continuar = true;
		while (continuar) {
				System.out.println("Digite um opção: ");
				int opcao = entrada.nextInt();
				switch (opcao) {
					case 1:
							carregarVetor();
						break;
					case 2:
							System.out.println(listarVetor());
						break;
					case 3:
						System.out.println(listarParesVetor());
						break;
					case 4:
						System.out.println(listarImparesVetor());
						break;
					case 5:
						System.out.println(quantidadeParesNosIndicesImparesDoVetor());
						break;
					case 6:
						System.out.println(quantidadeImparesNosIndicesParesDoVetor());
						break;
					case 7:
						continuar = false;
						break;
					default:
						System.out.println("Número inválido.");				
		}
	 }
}
//1 - Carregar Vetor
public static void carregarVetor(){
	for(int x=0; x < 10; x++){
		System.out.println("Digite o "+ (x+1) + "° número do vetor: ");
		vetor[x] = entrada.nextInt();
	}
	System.out.println("\nVetor carregado com sucesso:\n");
}
	//2 - Listar Vetor
public static String listarVetor(){
	String listarVetor = "Valores do vetor:\n";
	for(int x=0; x < 10; x++){
		listarVetor += "\t"+vetor[x]+ "\n";
	}
	return listarVetor;
}
//3 - Exibir apenas os números pares do vetor
public static String listarParesVetor() {
		String listaVetor = "Valores do vetor:\n";
		for(int x=0; x < 10; x++){
			if (vetor[x]%2==0) {
					listaVetor += "\t"+vetor[x]+"\n";
			}
		}
		return listaVetor;
}
//4 - Exibir apenas os números ímpares do vetor
public static String listarImparesVetor() {
	String listaVetor = "Valores do vetor:\n";
	for(int x=0; x<10; x++) {
		if(vetor[x]%2==1){
			listaVetor += "\t"+ vetor[x] + "\n";
		}
	}
	return listaVetor;
}
//5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
public static int quantidadeParesNosIndicesImparesDoVetor(){
	int quantidade = 0;
	for(int x = 1; x<10; x=x+2){
		if (vetor[x]%2==0) {
			quantidade++;
		}
	}
	return quantidade;
}

//6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
public static int quantidadeImparesNosIndicesParesDoVetor(){
		int quantidade = 0;
		for(int x=0; x<10; x=x+2){
				if (vetor[x]%2==1) {
					quantidade++;
				}
		}
		return quantidade;
	}
}