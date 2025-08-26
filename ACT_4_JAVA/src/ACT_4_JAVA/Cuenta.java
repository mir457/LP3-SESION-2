package ACT_4_JAVA;

public class Cuenta {
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Cuenta(int numero) {
		this(numero,0);
	}
	
	int getNumCuenta() {return numero;}
	void setNumCuenta(int n) {numero = n;}
	double getSaldo() {return saldo;}
	void setSaldo(double s) {saldo = s;}
	
	public String toString() {
		return "---CUENTA---\n"+"NUMERO: "+numero+"\nSALDO: "+saldo;
	}
}
