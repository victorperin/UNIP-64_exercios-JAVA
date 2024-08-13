/*******************************************************************************
* 57) Fazer um programa que leia uma frase e imprima somente as vogais.
*******************************************************************************/

import java.util.Scanner;

/**
 * ImprimirAsVogais
 */
public class ImprimirAsVogais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase , vogais = "aeiouAEIOU", stringVogais = "";

		System.out.println("Digite uma frase: ");
		frase = entrada.nextLine();

		char[] arrayChars = frase.toCharArray();
		
		for(int x=0; x < arrayChars.length; x++) {

			if (vogais.contains(""+arrayChars[x])) {// ""+Char - soma uma string "" com um charactere, transformando o caractere em string
				stringVogais+=arrayChars[x];
			}
		}
		System.out.println("Nova frase: " + stringVogais);

	}
}