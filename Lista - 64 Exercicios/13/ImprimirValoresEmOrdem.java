/*******************************************************************************
* 13) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/
import java.util.Scanner;

/**
 * ImprimirValoresEmOrdem
 */
public class ImprimirValoresEmOrdem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade = 3;//Este valor é igual a quantidade de números para adicionar ao array.
        int[] numeros = new int[quantidade]; //Inicia os valores com a mesma quantidade de valores da variável "Quantidade"

        System.out.println("Ordenado de numeros\n\n");

        int aux;
        int i;
        for(i = 0; i < quantidade; i++){
        System.out.print("Digite o "+(i+1)+" número:  ");
        numeros[i] = entrada.nextInt();
        }

        for(i = 0; i < quantidade; i++) {
            for(int j = 0; j < (quantidade); j++){
             if (numeros[i] > numeros[j]) {
                
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j]= aux; 
             }
        }
        
    }
    for(int k = 0; k < quantidade; k++)
        System.out.println(numeros[k] );//Imprimindo os numeros digitados em ordem decrescente
  }
}
