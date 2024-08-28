/*******************************************************************************
* 35) Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma
* mensagem: "Múltiplo de 10".
*******************************************************************************/
/**
 * MultiploDeDez
 */
public class MultiploDeDez {

    public static void main(String[] args) {
        
        
        for(int numero = 1; numero <=100; numero++){

            if (numero % 10 ==0)
                System.out.println(numero + " é múltiplo de 10");
        }
        
    }
}