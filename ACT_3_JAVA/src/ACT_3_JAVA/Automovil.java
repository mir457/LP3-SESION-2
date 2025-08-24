package ACT_3_JAVA;

public class Automovil {
	private String placa;
	private int numPuertas;
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Automovil(String placa, int nPuertas, String marca, String modelo, Motor motor) {
		this.placa=placa;
		this.numPuertas= nPuertas;
		this.marca=marca;
		this.modelo = modelo;
		this.motor=motor;
	}
	
	String getPlaca() {return placa;}
	void setPlaca(String p) {placa = p;}
	int getNumPuertas(){return numPuertas;}
	void setNumPuertas(int num) {numPuertas = num;}
	String getMarca() {return marca;}
	void setMarca(String m) {marca =m;}
	String getModelo() {return modelo;}
	void setModelo(String mo) {modelo = mo;}
	
	public String toString() {
		return "--------AUTOMOVIL-------- \n"
				+"PLACA: "+placa
				+"\nNUMERO DE PUERTAS: "+numPuertas
				+"\nMARCA: "+marca
				+"\nMODELO: "+modelo
				+"\n"+motor.toString();
	}
	
}
