package poo_marisela.Motor;

public class Coche {
	private Motor motor;
	private boolean encendido = false;
	
	public Coche(Motor m) {
		motor = m;
	}
	public void enciende() {
		encendido = true;
		motor.activa();
	}
	public void apaga() {
		encendido = false;
		motor.desactiva();
	}
	public void acelera() {
		motor.cambiaRevolucionesPorMinuto(motor.leeRevolucionesPorMinuto() + 500);
	}
	public void frena() {
		motor.cambiaRevolucionesPorMinuto(motor.leeRevolucionesPorMinuto() - 500);
	}
	public boolean estaEncendido() {
		return encendido;
	}
}