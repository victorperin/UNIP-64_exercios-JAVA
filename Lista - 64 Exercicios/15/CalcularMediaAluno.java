/*******************************************************************************
* 15) Escreva um programa que leia quatro notas escolares de um aluno e
* apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
* for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
* do recuperação, somar com o valor da média e obter a nova média. Se a nova
* média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
* foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
* mensagem informando esta condição. Apresentar junto com as mensagens o valor
* da média do aluno.
*******************************************************************************/

import java.util.Scanner;

/**
 * CalcularMediaAluno
 */
public class CalcularMediaAluno {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double primeiraNota, segundaNota, terceiraNota, quartaNota, recuperacao, media;

            System.out.println("Verificador de notas \n\n");

            System.out.println("Digite a primeira nota: ");
            primeiraNota = entrada.nextDouble();

            System.out.println("Digite a primeira nota: ");
            segundaNota = entrada.nextDouble();
            
            System.out.println("Digite a primeira nota: ");
            terceiraNota = entrada.nextDouble();

            System.out.println("Digite a primeira nota: ");
            quartaNota = entrada.nextDouble();

            media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

            if(media >= 7) {
                System.out.println("Aluno aprovado sem recuperação");
            }else{
                System.out.println("O aluno ficou de recuperação, digite a nota: ");
                recuperacao = entrada.nextDouble();
                media = (media + recuperacao) / 2;
                if (media >= 7)  {
                    System.out.println("\n\nO Aluno foi aprovado na recuperação com a média " + media);
                }else{
                    System.out.println("\n\nO Aluno foi reprovado na recuperação com a média " + media);
                }
           }
      }
}