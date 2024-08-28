/*******************************************************************************
* 28) Faça um programa que gera e escreve os números ímpares dos números lidos
* entre 100 e 200.
*******************************************************************************/
/**
 * Impares100A200
 */
public class ImparesCemADuzentos {

        public static void main(String[] args) {
            for(int x = 100; x <= 200; x++){
                if (x % 2 == 1) {
                    System.out.println(x);
                }
            }
        }
}