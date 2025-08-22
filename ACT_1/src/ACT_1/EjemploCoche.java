package ACT_1;

public class EjemploCoche {
	public static void main(String[] args) {
		Coche cocheDeportivo = new Coche();
		Coche cocheTodoTerreno = new Coche();
		
		cocheDeportivo.encender();
		cocheTodoTerreno.encender();
		
		cocheDeportivo.acelerar();
		cocheTodoTerreno.acelerar();
		
		cocheTodoTerreno.apagar();
		cocheTodoTerreno.apagar();

	}
}
