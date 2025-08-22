package ACT_1;

public class Coche {
	public String color;
	private String modelo;
	private String marca;
	private int velocidadMaxima;
	private int potenciaMotor;
	private boolean enMarcha;
	private int anioFa;
	private float precio;

	public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.potenciaMotor = potenciaMotor;
		this.enMarcha = false; // El coche comienza apagado
	}
	
	public Coche(String modelo, String marca, int anioFa, float precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.anioFa = anioFa;
		this.precio = precio;
	}
	
	public Coche() {
		this.color = "";
		this.modelo = "";
		this.velocidadMaxima = 0;
		this.potenciaMotor = 0;
		this.enMarcha = false;
		this.anioFa = 0;
		this.precio = 0;
	}
	
	public String getModelo() {return modelo;}
	public int getVelocidadMaxima() {return velocidadMaxima;}
	public int getPotenciaMotor() {return potenciaMotor;}
	public boolean getEnMarcha() {return enMarcha;}
	public int getAnioFa() {return anioFa;}
	public float getPrecio() {return precio;}
	
	
	void setModelo(String m) {modelo = m;}
	void setVelocidadMaxima(int v){velocidadMaxima = v;}
	void setPotenciaMotor(int po) {potenciaMotor = po;}
	void setEnMarcha(boolean e) {enMarcha = e;}
	void setAnioFa(int a) {anioFa = a;}
	void setPrecio(float p) {precio = p;}
	
	
	public void acelerar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta acelerando.");
		} else {
			System.out.println("Primero enciende el coche.");
		}	
	}
	
	public void frenar() {
		if (enMarcha) {
			System.out.println("El coche " + modelo + " esta frenando.");
		} else {
		System.out.println("El coche esta apagado, no se puede frenar.");
		}
	}
	
	public void encender() {
		enMarcha = true;
		System.out.println("El coche " + modelo + " se ha encendido.");
	}
	public void apagar() {
		enMarcha = false;
		System.out.println("El coche " + modelo + " se ha apagado.");
	}
	
	public void aplicarDescuento() {
		if(anioFa<2010) {
			float descuento=precio-(precio*(0.1f));
			this.setPrecio(descuento);
			System.out.println("Se realizó el descuento por el año de fabricación");
		}
		else {
			System.out.println("No se aplicó el descuento");
		}
	}
}

