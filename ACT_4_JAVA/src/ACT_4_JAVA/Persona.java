package ACT_4_JAVA;

public class Persona {
	private int id;
	private String nombre;
	private String apellido;
	private Cuenta cuenta;
	private static int numero = 0;  
	
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		++numero;
		this.cuenta = new Cuenta(numero);
	}
	
	int getID() {return id;}
	void setID(int d) {id = d;}
	String getNombre() {return nombre;}
	void setNombre(String n) {nombre = n;}
	String getApellido() {return apellido;}
	void setApellido(String p) {apellido = p;}
	
	public String toString() {
		return "NOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nID: "+id+"\n"+cuenta.toString();
	}
	
}
