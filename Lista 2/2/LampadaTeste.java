/*******************************************************************************
* 2. Implementar uma classe Lampada que deve possuir como características tipo
* (led, fluorescente,...), voltagem, cor, marca, preço, potência,
* status(boolean). Nesta classe devem ser implementados os métodos construtores,
* getters, setters, toString, ascender e apagar. Em uma outra classe chamada
* LampadaTeste devem ser criados dois objetos do tipo Lampada, atribuir valores
* e exibir os dados deste objeto. O programa deverá informar também qual das
* duas lâmpadas possui maior potência e também qual das lâmpadas é a mais cara.
*******************************************************************************/
/**
 * LampadaTeste
 */
import java.util.Scanner;

public class LampadaTeste {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Lampada lampadaAzul = new Lampada("led",110,"azul","Baconzitos", 10.32, 200, false);
    Lampada lampadaVerde = new Lampada("led", 220,"verde", "Bacon Supreme", 11.1115, 350, false);
  
    System.out.println(lampadaAzul.toString());
    System.out.println(lampadaVerde.toString());

  }
}