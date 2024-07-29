/*******************************************************************************
* 11) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/

import java.util.Scanner;

/**
 * TrocaValorDoisNumeros
 */
public class TrocaValorDoisNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, variavelTemporaria;

        System.out.println("Efetuador de troca de valores entre variaveis\n\n");

        System.out.println("Digite a variável A:");
        a = entrada.nextInt();

        System.out.println("Digite a variavel B: ");
        b = entrada.nextInt();

        variavelTemporaria = a;
        a = b;
        b = variavelTemporaria;

        System.out.println("A = " + a + " B = " + b + "\n");
    }
}
