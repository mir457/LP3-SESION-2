package PROP_1;

public abstract class Persona {
	private String nombre;
	
	public Persona(String n) {
		this.nombre=n;
	}
	
	String getNombre() {return nombre;}
}
