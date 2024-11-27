package poo_marisela.Coche;

public class Persona {
	public String nombre;
	public Coche c;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		System.out.println("El objeto " + nombre + " ha sido creado.");
	}
	
	public void asignaCoche(Coche c) {
		this.c = c;
	}
	public void viaja() {
		System.out.println(nombre + " viajando...");
		c.enciende();
		try {
			 Thread.sleep(1000);
		} catch (InterruptedException e) {}
		c.apaga();
	}
}
