/*               
 *  INSTITUTO TECNOLÓGICO DE MEXICALI                                          *
 *  TECNOLÓGICO NACIONAL DE MÉXICO                                             *
 *                                                                             *
 *  PROGRAMACIÓN ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIERÍA EN SISTEMAS COMPUTACIONALES                                     *
 *  NÚMERO DE CONTROL: 21490577                                                *
 *  
 *  JUEVES 5 DE MAYO DE 2022
 */

package poo_marisela.herenciaEjercicioII;

public class Coche {
	private String matricula;
	private double velocidad;
	private int marcha;
	
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
		this.velocidad = 0;
		this.marcha = 0;
	}
	
	public Coche() {
		super();
		this.matricula = null;
		this.velocidad = 0;
		this.marcha = 0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public void acelerar(int cantidad) {
		if (cantidad < 0)
			frenar(Math.abs(cantidad));
		else
			setVelocidad(getVelocidad() + cantidad);
	}
	
	public void frenar(int cantidad) {
		if (cantidad < 0)
			acelerar(Math.abs(cantidad));
		else {
			double frenado = 0;
			if (frenado > 0)
				frenado = getVelocidad() - cantidad;
			setVelocidad(frenado);
		}
	}
	
	protected void cambiaMarcha(int marcha) {
		
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", velocidad=" + velocidad +
			   ", marcha=" + marcha + "]";
	}
}
