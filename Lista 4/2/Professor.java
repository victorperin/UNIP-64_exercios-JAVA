/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * Professor
 */
public class Professor extends Pessoa {

	private String disciplina;

	//contructor
	public Professor(String nome, String sobrenome, String disciplina) {
		super(nome, sobrenome);
		this.disciplina = disciplina;
	}

	//getters
	public String getDisciplina() {
		return disciplina;
	}

	//setters
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}