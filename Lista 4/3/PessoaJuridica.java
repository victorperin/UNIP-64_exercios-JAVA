/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/
/**
 * PessoaJuridica
 */
public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String nomeFantasia; 

	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	//getters
	public String getcCnpf(){
		return cnpj;
	}
	public String getNomeFantasia(){
		return nomeFantasia;
	}

	//setters
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	public void SetNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}

	//toString
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone() + "]";
	}

}