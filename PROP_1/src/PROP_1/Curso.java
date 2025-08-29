package PROP_1;
import java.util.Vector;

public class Curso {
	private String catego, nombre, salon;
	private Vector<Estudiante> estudiantes = new Vector<>();
	private Profesor profe;
	private static final int MAX = 50;
	
	public Curso(String ca, String n, String s, Profesor profe) {
		this.catego=ca;
		this.nombre=n;
		this.salon=s;
		this.profe=profe;
		SistemaGestion.agregarCurso(this);
	}
	
	public Vector<Estudiante> getEstudiantes() {return estudiantes;}
	public int getCantEstudiantes() {return estudiantes.size();}
	public String getNombre() {return nombre;}
	public static int getMAX() {return MAX;}
	
	public void agregarEstudiante(Estudiante e) {
	    if(estudiantes.size() < MAX) {        
	        estudiantes.add(e);              
	        if(estudiantes.size() >= MAX) {
	            SistemaGestion.getCursosDispo().remove(this);
	        }
	    } else {
	        System.out.println("EL CURSO YA ESTÁ LLENO");
	    }
	}

    
	void mostrar() {
		System.out.println("CURSO: " + nombre);
		System.out.println("CATEGORIA: " + catego);
		System.out.println("PROFESOR: " + profe.getNombre());
		System.out.println("SALON: " + salon);
		System.out.println("CANTIDAD DE ALUMNOS: "+this.getCantEstudiantes());
	}
}
