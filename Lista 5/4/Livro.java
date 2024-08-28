/*******************************************************************************
Exercício 4)
Escreva uma classe Livro que represente os dados básicos de um livro.
• Crie uma classe LivroLivraria que represente os dados básicos de um livro que
    está venda em uma livraria.
• Crie uma classe LivroBiblioteca que represente os dados básicos de um livro
    que pode ser emprestado a leitores.
• Escreva também um programa que demonstre o uso destas classes.
*******************************************************************************/

import javax.sound.sampled.LineEvent;

/**
 * Livro
 */
public class Livro {

  private String nome;
  private String autor;
  private String resumo;
  private Data dataLancamento;

  //construtires
  public Livro(String nomeLivro, String nomeAutor, Data dataLancamento){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = dataLancamento;
  }

  public Livro(String nomeLivro, String nomeAutor, String dataLancamento){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = new Data(dataLancamento);
  }

  public Livro(String nomeLivro, String nomeAutor, Data dataLancamento, String resumo){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = dataLancamento;
    this.resumo = resumo;
  }

  //getters
  public String getNome(){
    return nome;
  }
  public String getAutor(){
    return autor;
  }
  public String getDataLancamento(){
    return this.dataLancamento.toString();
  }
  public String getResumo(){
  return this.resumo;
}

//setters
public void setResumo(String resumo){
 this.resumo = resumo;
}

}