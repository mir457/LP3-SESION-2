public class ContadorTest {
    public static void main(String[] args) {
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador creado con valor: " + Contador.getUltimoContador());

        Contador c1 = new Contador(5);
        System.out.println("\nSe crea c1 con valor 5");
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador creado con valor: " + Contador.getUltimoContador());

        Contador c2 = new Contador();
        System.out.println("\nSe crea c2 con valor por defecto");
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador creado con valor: " + Contador.getUltimoContador());

        Contador c3 = new Contador(20);
        System.out.println("\nSe crea c3 con valor 20");
        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Último contador creado con valor: " + Contador.getUltimoContador());
    }
}
