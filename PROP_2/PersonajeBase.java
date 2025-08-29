package personajes;

import habilidades.Habilidad;
import objetos.Inventario;

public abstract class PersonajeBase {
    protected String nombre;
    protected int salud;
    protected int nivel;
    protected Habilidad[] habilidades;
    protected Inventario inventario;

    private static int contadorPersonajes = 0;
    private static final int NIVEL_MAXIMO = 100;
    public static final int SALUD_MAXIMA = 100;
    public static final String MUNDO = "Aetheria";

    public PersonajeBase(String nombre, int salud, int nivel, int numHabilidades, int capacidadInventario) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        this.habilidades = new Habilidad[numHabilidades];
        this.inventario = new Inventario(capacidadInventario);
        contadorPersonajes++;
    }

    public abstract void usarHabilidad(int index, PersonajeBase objetivo);
    public abstract void atacar(PersonajeBase objetivo);

    public void agregarHabilidad(Habilidad h) {
        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i] == null) {
                habilidades[i] = h;
                break;
            }
        }
    }

    public void mostrarHabilidades() {
        System.out.println("Habilidades de " + nombre + ":");
        for (Habilidad h : habilidades) {
            if (h != null) {
                System.out.println("- " + h.getNombre() + " (Poder: " + h.getPoder() + ")");
            }
        }
    }

    public void recibirDanio(int danio) {
        salud -= danio;
        if (salud < 0) salud = 0;
    }

    public void mostrarEstado() {
        System.out.println(nombre + " | Salud: " + salud + " | Nivel: " + nivel);
    }

    public static int getContadorPersonajes() {
        return contadorPersonajes;
    }
}
