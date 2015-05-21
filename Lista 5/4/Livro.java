/*******************************************************************************
Exercício 4)
Escreva uma classe Livro que represente os dados básicos de um livro.
• Crie uma classe LivroLivraria que represente os dados básicos de um livro que
    está venda em uma livraria.
• Crie uma classe LivroBiblioteca que represente os dados básicos de um livro
    que pode ser emprestado a leitores.
• Escreva também um programa que demonstre o uso destas classes.
*******************************************************************************/
public class Livro{
  private String nome,autor,resumo;
  private Data dataLancamento;

  //construtores
  public Livro(String nomeLivro, String nomeAutor, Data dataLancamento){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = dataLancamento;
  }
  public Livro(String nomeLivro, String nomeAutor, Data dataLancamento, String resumo){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = dataLancamento;
    this.resumo = resumo;
  }

  //setters
  public void setResumo(String resumo){
    this.resumo = resumo;
  }
}