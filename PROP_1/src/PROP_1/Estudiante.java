package PROP_1;
import java.util.Scanner;

public class Estudiante extends Persona {
	Scanner sc = new Scanner(System.in);
	private String nombre;
	private int codigo;
	
	public Estudiante(String n, int c) {
		super(n);
		this.nombre = n;
		this.codigo=c;
	}
	
	public String getNombre() {return nombre;}
	public int getCodigo() {return codigo;}
	
	public void matricularse() {
	    boolean enc = false;
	    System.out.println("¿Qué curso se desea matricular?");
	    do {
	        SistemaGestion.mostrarCursosDispo();
	        String cur = sc.nextLine();
	        for (Curso c : SistemaGestion.getCursosDispo()) {
	            if (c.getNombre().equalsIgnoreCase(cur)) {
	                c.agregarEstudiante(this);
	                System.out.println("MATRICULADO EN: " + c.getNombre());
	                enc = true;
	                break;
	            }
	        }
	        if (!enc) {
	            System.out.println("CURSO NO ENCONTRADO O LLENO");
	        }
	    } while (!enc);
	}
	
	public void mostrarInfo() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("CODIGO: "+codigo);
	}
}
