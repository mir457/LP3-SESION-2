package personajes;

import habilidades.Habilidad;
import interfaces.IAtaqueFisico;

public class Arquero extends PersonajeBase implements IAtaqueFisico {

    public Arquero(String nombre) {
        super(nombre, SALUD_MAXIMA, 1, 2, 2);
    }

    @Override
    public void usarHabilidad(int index, PersonajeBase objetivo) {
        if (index >= 0 && index < habilidades.length && habilidades[index] != null) {
            Habilidad h = habilidades[index];
            System.out.println(nombre + " dispara " + h.getNombre() + " contra " + objetivo.nombre);
            objetivo.recibirDanio(h.getPoder());
        }
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " dispara una flecha a " + objetivo.nombre);
        objetivo.recibirDanio(12);
    }

    @Override
    public void ataqueFisico() {
        System.out.println(nombre + " dispara una ráfaga de flechas rápidas.");
    }
}
