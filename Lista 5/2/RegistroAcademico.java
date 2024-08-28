/*******************************************************************************
2- Dado o diagrama, implemente:
  (imagem)
  Obs: O valor inicial da mensalidade deverá ser de R$ 400,00 e caso o aluno
  seja bolsista deverá ter desconto de 50%.
  Dica: O atributo dataDeNascimento deve ser do tipo Data (classe já criada em
  exercício anterior)
*******************************************************************************/
public class RegistroAcademico {

  private String nomeDoAluno;
  private int numeroDaMatricula;
  private int anoDeMatricula;
  private double mensalidade;
  private Data dataDeNascimento;
  private boolean eBolsista;

  public RegistroAcademico(){}
  public void iniciaRegistro(String nome, int matricula, String nascimento, boolean bolsista, int ano){
    this.nomeDoAluno = nome;
    this.numeroDaMatricula = matricula;
    this.dataDeNascimento = new Data(nascimento);
    this.eBolsista = bolsista;
    this.anoDeMatricula = ano;
    CalculaMensalidade();
  }
  public void CalculaMensalidade(){
    double valorPadraoMensalidade = 400;
    if (this.eBolsista == false) {
      this.mensalidade = valorPadraoMensalidade;
    }
    else{
      this.mensalidade = valorPadraoMensalidade * 0.5;
    }
  }
    public void MostraRegistro(){
      System.out.println("Rigistro Acadêmico:");
      System.out.println("\tNome do Aluno: " + this.nomeDoAluno);
      System.out.println("\tNúmero da Matrícula: " + this.numeroDaMatricula);
      System.out.println("\tData de Nascimento: " + this.dataDeNascimento);
      System.out.println("\tAno de Matrícula: " + this.anoDeMatricula);
      System.out.println("\tMensalidade: " + this.mensalidade);

    }

    public static void main(String[] args) {
      
       RegistroAcademico registroAcademico = new RegistroAcademico();


      registroAcademico.iniciaRegistro("jovem", 321654, "11/09/1986", true,2018);

       registroAcademico.MostraRegistro();

    }
  }

