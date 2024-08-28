/*******************************************************************************
veja a imagem anexa na mesma pasta
*******************************************************************************/

public class ContaBancariaSimplificada {

  private String nomeDoCorrentista;
  private double saldo;
  private boolean contaEspecial;

  public ContaBancariaSimplificada(){
  }

  public ContaBancariaSimplificada(String nome, double saldo, boolean especial){
          this.nomeDoCorrentista = nome;
          this.saldo = saldo;
          this.contaEspecial = especial;
  }

  public void abreContaSimples(String nome){
    this.nomeDoCorrentista = nome;
    this.saldo = 0;
    this.contaEspecial = false;
  }

  public void deposita(double valor) {
    this.saldo += valor;
  }

  public void retira(double valor){
    this.saldo -= valor;
  }

  public void mostrarDados() {
    String especial;
    if (contaEspecial == true) {
      especial = "sim";
    }else{
      especial = "não";
    }

    System.out.println("Conta:\n\tNome do conrrentista: " +this.nomeDoCorrentista + "\n\tSaldo: "+this.saldo+"\n\tConta Especial? " +especial);
  }

}
