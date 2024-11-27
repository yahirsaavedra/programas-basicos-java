/*               
 *  INSTITUTO TECNOLÓGICO DE MEXICALI                                          *
 *  TECNOLOGÍCO NACIONAL DE MÉXICO                                             *
 *                                                                             *
 *  PROGRAMACIÓN ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIERÍA EN SISTEMAS COMPUTACIONALES                                     *
 *  NÚMERO DE CONTROL: 21490577                                                *
 *                                                                             *
 *  MIÉRCOLES 11 DE MAYO DE 2022                                               *
 */

package poo_marisela.Salario;

public class EmpleadoConHorasDobles extends Empleado {
	private double horasTrabajadas;
	private double sueldoPorHora;
	private double horasExtra;
	
	public EmpleadoConHorasDobles() {
		super();
		this.horasTrabajadas = 0;
		this.sueldoPorHora = 0;
		this.horasExtra = 0;
	}
	
	public double getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public double calcularSalario() {
		return (sueldoPorHora * horasTrabajadas) +
			   ((sueldoPorHora * 2) * horasExtra);
	}
}
