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

public class EmpleadoSinHorasExtras extends Empleado {
	private double horasTrabajadas;
	private double sueldoPorHora;
	
	public EmpleadoSinHorasExtras() {
		super();
		this.horasTrabajadas = 0;
		this.sueldoPorHora = 0;
	}
	
	@Override
	public double calcularSalario() {
		return horasTrabajadas * sueldoPorHora;
	}
}
