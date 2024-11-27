package poo_marisela.Motor;

public class Motor {
	private int revolucionesPorMinuto = 0;
	private boolean activo = false;
	
	public void cambiaRevolucionesPorMinuto(int rpm) {
		if (!activo)
			System.out.println("Error: El motor debe estar activo");
		else if (rpm < 0 || rpm > 10000)
			System.out.println("Error: RPM fuera de rango!");
		else {
			revolucionesPorMinuto = rpm;
			System.out.println("Nuevo valor de RPM: " + revolucionesPorMinuto);
		}
	}
	public void activa() {
		activo = true;
	}
	public void desactiva() {
		activo = false;
	}
	public boolean estaActivo() {
		return activo;
	}
	public int leeRevolucionesPorMinuto() {
		return revolucionesPorMinuto;
	}
}