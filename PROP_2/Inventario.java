package objetos;

public class Inventario {
    private Objeto[] objetos;
    private int contador;

    public Inventario(int capacidad) {
        objetos = new Objeto[capacidad];
        contador = 0;
    }

    public void agregarObjeto(Objeto obj) {
        if (contador < objetos.length) {
            objetos[contador] = obj;
            contador++;
        }
    }

    public void mostrarObjetos() {
        System.out.println("Inventario:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + objetos[i].getNombre());
        }
    }
}
