package ACT_3_JAVA;

public class TestAgregacion {
	public static void main(String[] args) {
		Motor motor = new Motor(12345, 20);
		Automovil auto = new Automovil("A1B2C3", 4, "Toyota", "Yaris", motor);
		
		System.out.println(motor.toString());
		System.out.println(auto.toString());
	}

}
