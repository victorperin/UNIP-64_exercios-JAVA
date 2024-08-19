/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * Pessoa
 */
public class Pessoa {

	String nome;
	String sobrenome;

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	//getters
	public String getNome(){
		return nome;
	}

	public String getSobrenome(){
		return sobrenome;
	}

	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



}