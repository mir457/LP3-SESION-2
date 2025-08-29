package sistema;

import personajes.*;
import habilidades.Habilidad;
import objetos.Objeto;

public class SistemaJuego {
    public static void main(String[] args) {
        Guerrero g = new Guerrero("Thorin");
        Mago m = new Mago("Merlin");
        Arquero a = new Arquero("Legolas");

        g.agregarHabilidad(new Habilidad("Golpe Poderoso", 18));
        m.agregarHabilidad(new Habilidad("Bola de Fuego", 25));
        a.agregarHabilidad(new Habilidad("Flecha Precisa", 15));

        g.mostrarEstado();
        m.mostrarEstado();
        a.mostrarEstado();

        g.usarHabilidad(0, m);
        m.usarHabilidad(0, g);
        a.usarHabilidad(0, m);

        g.atacar(a);
        m.atacar(g);
        a.atacar(m);

        g.mostrarEstado();
        m.mostrarEstado();
        a.mostrarEstado();

        Objeto pocion = new Objeto("Poción de Vida", 20);
        g.inventario.agregarObjeto(pocion);
        g.inventario.mostrarObjetos();

        System.out.println("Personajes creados: " + PersonajeBase.getContadorPersonajes());
        System.out.println("Mundo del juego: " + PersonajeBase.MUNDO);
    }
}
