/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * Cliente
 */
public class Cliente {

	private String nome;
	private String endereco;
	private String telefone;

	public Cliente(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//getters

	public String getNome(){
		return nome;
	}

	public String getEndereco(){
		return endereco;
	}
	public String getTelefone(){
		return telefone;
	}

	//setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}