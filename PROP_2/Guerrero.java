package personajes;

import habilidades.Habilidad;
import interfaces.IAtaqueFisico;

public class Guerrero extends PersonajeBase implements IAtaqueFisico {

    public Guerrero(String nombre) {
        super(nombre, SALUD_MAXIMA, 1, 3, 3);
    }

    @Override
    public void usarHabilidad(int index, PersonajeBase objetivo) {
        if (index >= 0 && index < habilidades.length && habilidades[index] != null) {
            Habilidad h = habilidades[index];
            System.out.println(nombre + " usa " + h.getNombre() + " contra " + objetivo.nombre);
            objetivo.recibirDanio(h.getPoder());
        }
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " ataca físicamente a " + objetivo.nombre);
        objetivo.recibirDanio(15);
    }

    @Override
    public void ataqueFisico() {
        System.out.println(nombre + " realiza un ataque físico poderoso.");
    }
}
