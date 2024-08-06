/*******************************************************************************
* 33) Escreva um programa que calcule e exiba a média da nota dos alunos de uma
* turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno
* são: número de matrícula e a sua nota na prova em questão.
*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MediaAlunos
 */
public class MediaAlunos {


    static List<Aluno> alunoList;

    public MediaAlunos() {
        this.alunoList = new ArrayList<>();
    }

    public void adicionarAluno(String numeroMatricula, double notaProva){
        alunoList.add(new Aluno(numeroMatricula, notaProva));
    }

    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);
        String numeroMatricula;
        double notaProva;
        int soma = 0;
        double mediaTotal = 0;
        int cont = -1;

        do {
           

            System.out.print("\nDigite o número da matrícula do aluno: ");
			numeroMatricula = entrada.next();

            System.out.print("Digite a nota do aluno: ");
			 notaProva = entrada.nextDouble();

            MediaAlunos mediaAlunos = new MediaAlunos();
             mediaAlunos.adicionarAluno(numeroMatricula, notaProva);
        

            for (Aluno i : alunoList) {
                if(notaProva >= 0)
                soma += i.getNotaProva();
                cont++;
            }

        } while (notaProva >= 0);
        
        mediaTotal = (double) soma / cont;


        System.out.println("A soma das notas dos alunos é " + soma);
        System.out.println(" A media das notas dos alunos é: " + mediaTotal);

    }

}
