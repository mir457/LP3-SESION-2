package objetos;

public class Objeto {
    private String nombre;
    private int efecto;

    public Objeto(String nombre, int efecto) {
        this.nombre = nombre;
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEfecto() {
        return efecto;
    }
}
