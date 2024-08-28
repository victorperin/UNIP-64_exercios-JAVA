/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * PessoaFisica
 */
public class PessoaFisica extends Cliente{

	private String cpf;

	//constructor
	public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}
	
	//getters
	public String getCpf(){
		return cpf;
	}

	//setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getTelefone()=" + getTelefone() + "]";
	}
	
}