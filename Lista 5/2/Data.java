/**
 * Data
 */
public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(){};
	public Data(String dataString){
		 int[] dataInt = converterToArray(dataString);
		 if (validarData(dataString)) {
				this.dia = dataInt[0];
				this.mes = dataInt[1];
				this.ano = dataInt[2];
		 }
}
//getters 
public int getDia(){
	return dia;
}
public int getMes(){
	return mes;
}

public int getAno(){
	return ano;
}

//setters
public void setDia(int dia){
	this.dia = dia;
}
public void setMes(int mes){
	this.mes = mes;
}
public void setAno(int ano){
	this.ano = ano;
}

public void setData(String dataString){
	int[] data = converterToArray(dataString);
	this.dia = data[0];
	this.mes = data[1];
	this.ano = data[2];
}

//toString
public String toString(){
	return dia+"/"+ mes+"/"+ano;
}
public int[] converterToArray(String dataString){
		String partes[] = dataString.split("/");
		int[] dataInt = new int[3];
		for(int x=0; x < partes.length; x++){
			dataInt[x] = Integer.parseInt(partes[x]);
		}
		return dataInt;
}

//validarData
public boolean validarData(String dataString){
	int[] data = converterToArray(dataString);
	if (data[2]>0) {//ano
			switch (data[1]) {//mes
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
						if(data[0] <= 31) return true;//dia
						break;
				case 2:
					if (data[2]%4==0) {
						if (data[0]<=29) return true;//dia
					}
					else{
						if (data[0] <= 28) return true;}//dia
						break;
				case 4:
				case 6:
				case 9:
				case 11:
						if (data[0]<=30) return true; //dia
						break;		
				default:
					break;
			}
		}
		return false;
	}	
}