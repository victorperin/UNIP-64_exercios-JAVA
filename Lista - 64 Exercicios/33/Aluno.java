public class Aluno { //usando um array de objetos para que não seja necessário especificar 2 arrays diferentes.

	private String numeroMatricula;
	private double notaProva;
	public int getNotaProva;


	public Aluno(String numeroMatricula, double notaProva) {
		this.numeroMatricula = numeroMatricula;
		this.notaProva = notaProva;
	}


	public String getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}


	public double getNotaProva() {
		return notaProva;
	}


	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva;
	}


	@Override
	public String toString() {
		
		return "Aluno [numeroMatricula=" + numeroMatricula + ", notaProva=" + notaProva + "]";
	}



}