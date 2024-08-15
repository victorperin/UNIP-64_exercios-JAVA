/*******************************************************************************
* 62) Escreva um programa que calcule e retorne o valor da hipotenusa através do
* método HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo
* Fórmulas: hipotenusa² = base² + altura²
*             base x altura
*    área = -----------------
*                  2
*******************************************************************************/

import java.util.Scanner;

/**
 * ValorDaHipotenusa
 */
public class ValorDaHipotenusa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho da base: ");
        double base = entrada.nextDouble();
        System.out.println("Digite o tamanho da altura: ");
        double altura = entrada.nextDouble();
        System.out.println("A hipotenusa é: " + hipotenusa(base, altura));
    }
    public static double hipotenusa(double base, double altura) {
        double hipotenusaValor = ( base * base) + (altura*altura);
        hipotenusaValor = Math.sqrt(hipotenusaValor);
        return hipotenusaValor;
    }
}