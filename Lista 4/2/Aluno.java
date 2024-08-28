/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * Aluno
 */
public class Aluno extends Pessoa {

	private int matricula;

	public Aluno(String nome, String sobrenome, int matricula) {
		super(nome, sobrenome);
		this.matricula = matricula;

	}
	//getters
	public int getMatricula(){
		return matricula;
	}

	//setters
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}