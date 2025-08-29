package PROP_1;
import java.util.Scanner;
import java.util.Vector;

public class SistemaGestion {
	private static Vector<Curso> cursos = new Vector<>();
	private static Vector<Curso> cursosDispo = new Vector<>();
	Scanner sc = new Scanner(System.in);
	
	public static Vector<Curso> getCursosDispo(){return cursosDispo;}
	
	public static void mostrarCursosDispo() {
		for(Curso i:cursosDispo) {
			System.out.println(i.getNombre());
		}
	}
	
	public static void mostrarTodosCursos() {
		for(Curso i:cursos) {
			System.out.println("- "+i.getNombre());
		}
	}
	
	public static void agregarCurso(Curso c) {
	    cursos.add(c);
	    if(c.getCantEstudiantes() < Curso.getMAX()) {
	        cursosDispo.add(c);
	    }
	    
	}
	
	public static Curso buscarCursoPorNombre(String nombre) {
	    for (Curso c : cursos) {
	    	//.qualsIgnoreCase IGNORA LAS MAYUSCULAS Y MINUSCULAS
	        if (c.getNombre().equalsIgnoreCase(nombre)) {	
	            return c;
	        }
	    }
	    return null;
	}
	
}
