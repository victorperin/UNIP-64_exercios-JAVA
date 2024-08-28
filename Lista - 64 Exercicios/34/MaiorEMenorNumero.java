/*******************************************************************************
* 34) Escreva um programa que leia um conjunto de números positivos e exiba o
* menor e o maior. Suporemos que o número de elementos deste conjunto não é
* conhecido, e que um número negativo será utilizado para sinalizar o fim dos
* dados.
*******************************************************************************/
//Obs: Nesse exercício seria um ótimo lugar para se colocar listas ligadas
/**
 * MaiorEMenorNumero
 */
public class MaiorEMenorNumero {

    public static void main(String[] args) {
            int maior=0, menor, numero=0;
            
            System.out.println("Digite um numero positivo - caso queira sair do program digite um numero negativo: ");
            numero = Integer.parseInt(System.console().readLine());

            if( numero >= 0){

                        maior = numero;
                        menor = numero;

                        while (numero >= 0) {
                            numero = Integer.parseInt(System.console().readLine());
                        
                            if (numero > maior)     
                                maior = numero;
                            else if (numero >= 0 && numero < menor) 
                                menor = numero;

            }

            System.out.println("O menor numero é " + menor + " 0 maior numero é " + maior);
        }
    }
}