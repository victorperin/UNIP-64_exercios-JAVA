/*******************************************************************************
* 54) Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em
* C que imprima todos os elementos comuns aos dois vetores.
*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * CompararDoisVetores
 */

//utilizando a classe pronta de List e ArrayLists do java, para alocar memória da maneira correta 

public class CompararDoisVetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[5], b = new int[8];
        List<Integer> c = new ArrayList<Integer>();
        int w=0;
        for(int x=0; x < 5; x++) {
            System.out.println("Digite um número para o vetor A: ");
            a[x] = entrada.nextInt();
        }
        for(int x=0; x  < 8; x++) {
        System.out.println("Digite um numero para o vetor B: ");
        b[x] = entrada.nextInt();
        for(int y=0; y < 5; y++){
                            if (b[x] == a[y]) {
                                c.add(w, b[x])
                                w++;
                            }
                  }  

    }
    System.out.println("Números comuns: ");
    for(int x=0; x < c.size(); x++){
        System.out.println(c.get(x)+" ");
    }
    System.out.println();
    }
}