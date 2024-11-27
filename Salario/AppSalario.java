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

import java.util.Scanner;

public class AppSalario {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Empleado empleado;
		System.out.println("�De cu�nto es tu sueldo por hora?");
		double sueldo = leer.nextDouble();
		System.out.println("�Cu�ntas horas trabajaste en la semana?");
		double horas = leer.nextDouble();
		leer.close();
		if (horas <= 0) {
			System.out.println("ERROR: No tiene sentido que trabajes 0 horas " +
							   "o menos. Reinicia el programa.");
		} else if (horas > 0 && horas <= 40) {
			empleado = new EmpleadoSinHorasExtras();
			empleado.setHorasTrabajadas(horas);
			empleado.setSueldoPorHora(sueldo);
			System.out.println("Tu salario final de la semana es de $" +
							   empleado.calcularSalario());
		} else if (horas > 40 && horas <= 45) {
			empleado = new EmpleadoConHorasDobles();
			empleado.setHorasTrabajadas(40);
			empleado.setSueldoPorHora(sueldo);
			empleado.setHorasExtra(horas - 40);
			System.out.println("Tu salario final de la semana es de $" +
					   		   empleado.calcularSalario());
		} else if (horas > 45 && horas <= 48) {
			empleado = new EmpleadoConHorasTriples();
			empleado.setHorasTrabajadas(40);
			empleado.setSueldoPorHora(sueldo);
			empleado.setHorasExtra(horas - 40);
			System.out.println("Tu salario final de la semana es de $" +
							   empleado.calcularSalario());
		} else {
			System.out.println("ERROR: La Ley Federal del Trabajo establece " +
							   "que no se pueden trabajar m�s de 48 horas. " +
							   "Reinicia el programa.");
		}
	}
}
