package PROP_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        Profesor p1 = new Profesor("Carlos López");

        Curso c1 = new Curso("Programación", "Java Basico", "Lab 101", p1);
        Curso c2 = new Curso("Matemática", "Algebra", "Aula 202", p1);

        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("María Pérez", 12345);
        estudiantes[1] = new Estudiante("Juan Torres", 54321);
        estudiantes[2] = new Estudiante("Ana Castillo", 98745);

        do {
        	
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. MATRICULARSE");
            System.out.println("2. VER CURSOS DISPONIBLES");
            System.out.println("3. VER TODOS LOS CURSOS");
            System.out.println("4. MOSTRAR ESTUDIANTES DE UN CURSO");
            System.out.println("5. SALIR");
            System.out.print("Elige una opción: ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch(opc) {
                case 1:
                    System.out.println("Selecciona estudiante:");
                    for(int i = 0; i<estudiantes.length; i++) {
                        System.out.println((i+1)+".- " + estudiantes[i].getNombre());
                    }
                    int estSel = sc.nextInt();
                    sc.nextLine();
                    Estudiante est = estudiantes[estSel - 1];

                    System.out.println("Cursos disponibles:");
                    SistemaGestion.mostrarCursosDispo();
                    System.out.print("Nombre del curso: ");
                    String cursoNombre = sc.nextLine();
                    
                    for(Curso c : SistemaGestion.getCursosDispo()) {
                        if(c.getNombre().equalsIgnoreCase(cursoNombre)) {
                            c.agregarEstudiante(est);
                            System.out.println(est.getNombre() + " matriculado en " + c.getNombre());
                            break;
                        }
                    }
                    break;

                case 2:
                    SistemaGestion.mostrarCursosDispo();
                    break;

                case 3:
                    SistemaGestion.mostrarTodosCursos();
                    break;

                case 4:
                    System.out.print("Nombre del curso: ");
                    String cursoVer = sc.nextLine();
                    for(Curso c : SistemaGestion.getCursosDispo()) {
                        if(c.getNombre().equalsIgnoreCase(cursoVer)) {
                            System.out.println("Estudiantes en " + c.getNombre() + ":");
                            for(Estudiante e : c.getEstudiantes()) {
                                e.mostrarInfo();
                            }
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while(opc != 5);
    }
}

