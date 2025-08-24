package ACT_3_JAVA;

public class Motor {
	private int numMotor;
	private int revPorMin;
	
	public Motor(int numMotor, int revPorMin) {
		this.numMotor = numMotor;
		this.revPorMin = revPorMin;
	}
	
	public int getNumMotor() {return numMotor;}
	public void setNumMotor(int nuM) {numMotor = nuM;}
	public int getRevoluciones() {return revPorMin;}
	public void setRevoluciones(int rev){revPorMin = rev;}
	
	public String toString() {
		return "--------MOTOR-------- \n"
				+ "NUMERO DEL MOTOR: "+ numMotor
				+ "\nREVOLUCIONES POR MINUTO: "+revPorMin+"\n";
	}
}
