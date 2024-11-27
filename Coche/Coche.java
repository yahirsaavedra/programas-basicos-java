package poo_marisela.Coche;

public class Coche {
	 private boolean encendido;
	
	 public Coche() {
		 this.encendido = false;
		 System.out.println("Se ha creado un coche!");
	 }
	 
	 public void enciende() {
		 encendido = true;
		 System.out.println("Coche encendido"); 
	 }
	 
	 public void apaga() {
		 encendido = false;
		 System.out.println("Coche apagado"); 
	 }
	 
	 public boolean estaEncendido() {
		return encendido; 
	 }
}
