/*               
 *  INSTITUTO TECNOL�GICO DE MEXICALI                                          *
 *  TECNOLOG�CO NACIONAL DE M�XICO                                             *
 *                                                                             *
 *  PROGRAMACI�N ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIER�A EN SISTEMAS COMPUTACIONALES                                     *
 *  N�MERO DE CONTROL: 21490577                                                *
 *                                                                             *
 *  MI�RCOLES 11 DE MAYO DE 2022                                               *
 */

package poo_marisela.Salario;

public class Empleado {
	private double horasTrabajadas;
	private double sueldoPorHora;
	protected double horasExtra;
	
	public Empleado() {
		this.horasTrabajadas = 0;
		this.sueldoPorHora = 0;
	};
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	protected void getHorasExtra() { };
	
	protected double setHorasExtra(double horasExtra) { return 0.0f; };
	
	public abstract double calcularSalario();
}
