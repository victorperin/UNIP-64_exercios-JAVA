/*******************************************************************************
* 51) Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada
* um dos N alunos e calcular a média aritmética das notas. Contar quantos alunos
* estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0,
* imprimir mensagem: Não há nenhum aluno com nota acima de 5.
*******************************************************************************/

import java.util.Scanner;

/**
 * MediaAlunos
 */
public class MediaAlunos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeAlunos, notasBoas=0; //notas boas são consideradas quando a nota é maior que 7.
        boolean salaFu = true; //Sala quando ninguém tirou nota maior que 5.
        System.out.println("Digite  quantidade de alunos: ");
        quantidadeDeAlunos = entrada.nextInt();

        int[]  notas = new int[quantidadeDeAlunos];

        for(int x=0; x<quantidadeDeAlunos; x++) {
            System.out.println("Digite a nota do " +(x+1)+ "° Aluno: ");
            notas[x] = entrada.nextInt();

            if (notas[x] > 7) {
                notasBoas++;
            }
            if (notas[x]>5) {
                salaFu = false;
            }
        }
        if (salaFu==false) {
            System.out.println("Existem " +notasBoas + " notas maiores que 7." );
        
        }else{
            System.out.println("Não há nenhum aluno com nota acima d 5.");
        }
    }
}