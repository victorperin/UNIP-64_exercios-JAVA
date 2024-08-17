/*******************************************************************************
2. Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTesteVetor
deverá ser criado um vetor para armazenar 30 objetos do tipo Lampada. O programa deverá exibir o seguinte
menu para o usuário:
1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair

*******************************************************************************//**
 * Lampada
 */
public class Lampada {

	private String tipo;
	private String cor;
	private String marca;
	private int voltagem;
	private double preco;
	private double potencia;
	private boolean status;
	
	public Lampada(){
	}

	public Lampada(String tipo, String cor, String marca,int voltagem, double preco, double potencia, boolean status){
		this.tipo = tipo;
		this.cor = cor;
		this.marca = marca;
		this.voltagem = voltagem;
		this.preco = preco;
		this.potencia = potencia;
		this.status = status;	
	}

	//getters
	public String getTipo(){
		return tipo;
	}
	public String getCor(){
		return cor;
	}
	public String getMarca(){
		return marca;
	}
	public int getVoltagem(){
		return voltagem;
	}
	public double getPreco(){
		return preco;
	}
	public double getPotencia(){
		return potencia;
	}
	public boolean getStatus(){
		return status;
	}

	//setters
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public void serPotencial(double potencia){
		this.potencia = potencia;
	}
	public void setStatus(boolean status){
		this.status = status;
	}

	//toString
	public String toString(){
		String texto = "Lâmpada:";
		texto +="\n\tTipo: " + tipo;
		texto +="\n\tVoltagem: " + voltagem;
		texto +="\n\tCor: " + cor;
		texto +="\n\tMarca: " + marca;
		texto +="\n\tPreço: " + preco;
		texto +="\n\tPotência: " + potencia;
		texto +="\n\tStatus: " + status;
		return texto;
	}

	//ascender e apagar
	public void ascender(){
		setStatus(true);
	}

	public void apagar(){
		setStatus(false);
	}
}