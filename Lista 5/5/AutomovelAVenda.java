/*******************************************************************************
Exercício 5)
Escreva uma classe VeiculoAVenda que represente informações básicas sobre um veículo genérico que esteja à venda, como tipo (podendo ser representado por uma String), ano e precoDeVenda.
• Escreva uma classe AutomovelAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor constante "Automóvel",
• Escreva uma classe MotocicletaAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor "Motocicleta".
• Escreva também um programa que demonstre o uso destas classes usando Polimorfismo.
*******************************************************************************/
/**
 * AutomovelAVenda
 */
public class AutomovelAVenda extends VeiculoAVenda{

    public AutomovelAVenda(String tipo, int ano, float precoDeVenda){
        super();
        String automovelTipo = "Automovel "+tipo;
        super.setTipo(automovelTipo);
        super.setAno(ano);
        super.setPrecoVenda(precoDeVenda);
    }         
}