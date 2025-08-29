package personajes;

import habilidades.Habilidad;
import interfaces.IAtaqueMagico;

public class Mago extends PersonajeBase implements IAtaqueMagico {

    public Mago(String nombre) {
        super(nombre, SALUD_MAXIMA, 1, 3, 3);
    }

    @Override
    public void usarHabilidad(int index, PersonajeBase objetivo) {
        if (index >= 0 && index < habilidades.length && habilidades[index] != null) {
            Habilidad h = habilidades[index];
            System.out.println(nombre + " lanza " + h.getNombre() + " sobre " + objetivo.nombre);
            objetivo.recibirDanio(h.getPoder());
        }
    }

    @Override
    public void atacar(PersonajeBase objetivo) {
        System.out.println(nombre + " lanza un ataque mágico a " + objetivo.nombre);
        objetivo.recibirDanio(20);
    }

    @Override
    public void ataqueMagico() {
        System.out.println(nombre + " realiza un conjuro de energía mágica.");
    }
}
