/*******************************************************************************
* 19) Escreva um programa que leia três valores para os lados de um triângulo
* (variáveis A, B e C). Verificar se cada lado é menor que a soma dos outros dois lados. Se sim,
* saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero; Se não, verificar de A==B
* ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo
* será escaleno. Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
*******************************************************************************/

import java.util.Scanner;

/**
 * VerificarTipoDeTriangulo
 */
public class VerificarTipoDeTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b , c; //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.println("Vificador de triângulo \n\n");

        System.out.println("Digite o lado A = ");
        a = entrada.nextInt();  //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.println("Digite o lado B = ");
        b = entrada.nextInt(); //Escreva um programa que leia três valores para os lados de um triângulo

        System.out.println("Digite o lado C = ");
        c = entrada.nextInt();  //Escreva um programa que leia três valores para os lados de um triângulo

            if (a==b && b==c) {
                System.out.println("O triângulo é equilátero");
            }else if (a==b || a==c || b==c) {
                System.out.println("O triângulo é Isósceles");
            }else if (a != b && b !=c) {
                System.out.println("O triângulo é Escaleno. ");
            } else {
                System.out.println("Os lados fornecdo não caractetizam um triângulo");
        }
            
    }

}
