package poo_marisela.Coche;

public class Aplicacion {
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.inicia();
	}
	public void inicia() {
		System.out.println("La aplicacion ha iniciado...");
		System.out.println("===== RESULTADOS DE LA PRÁCTICA 1 ===");
		Coche c = new Coche();
		System.out.println("El coche esta encendido: " + c.estaEncendido());
		try {
			 Thread.sleep(1000);
		} catch (InterruptedException e) {}
		c.enciende();
		System.out.println("El coche esta encendido: " + c.estaEncendido());
		try {
			 Thread.sleep(1000);
		} catch (InterruptedException e) {}
		c.apaga();
		System.out.println("El coche esta encendido: " + c.estaEncendido());
		System.out.println("===== RESULTADOS DE LA PRÁCTICA 2 ===");
		Persona p1 = new Persona("Paola");
		Persona p2 = new Persona("Pedro");
		p1.asignaCoche(c);
		p1.viaja();
		p2.asignaCoche(c);
		p2.viaja();
		p1.asignaCoche(c);
		p1.viaja();
	}
}