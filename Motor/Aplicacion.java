package poo_marisela.Motor;

public class Aplicacion {
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.inicia();
	}
	public void inicia() {
		Motor m = new Motor();
		Coche c = new Coche(m);
		c.acelera();
		c.enciende();
		for (int i = 1; i <= 21; i++)
			c.acelera();
		c.apaga();
	}
}