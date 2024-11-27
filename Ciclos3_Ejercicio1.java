/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"1.	Realiza un programa que pida el sueldo de N trabajadores e imprima
el que tiene mayor sueldo, deberás mostrar el número del trabajador y
su sueldo, usa la estructura do..while"
*/

package programas;
import javax.swing.JOptionPane;

public class Ciclos3_Ejercicio1 {
	public static void main(String[] args) {
		int numeroTrabajadores = 0, trabajadoresCapturados = 0, trabajadorConMejorSueldo = 0;
		double mayorSueldo = 0;
		numeroTrabajadores = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos trabajadores se van a "
			      			 + "capturar?", "Sueldo de trabajadores - Yahir Saavedra, 21490577",
			      			 JOptionPane.QUESTION_MESSAGE));
		if (numeroTrabajadores > 0) {
			do {
				double sueldo;
				sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Trabajador no. " +
											(trabajadoresCapturados + 1) + ", ingrese su sueldo:",
											"Sueldo de trabajadores - Yahir Saavedra, 21490577",
											JOptionPane.QUESTION_MESSAGE));
				if (sueldo >= 0) {
					if (sueldo > mayorSueldo) {
						mayorSueldo = sueldo;
						trabajadorConMejorSueldo = (trabajadoresCapturados + 1);
					}
					trabajadoresCapturados++;
				} else {
					JOptionPane.showInputDialog(null, "No es posible ganar menos de cero pesos, es ilógico. "
						    + "Intente de nuevo desde el principio con una cantidad correcta.",
					        "Sueldo de trabajadores - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
					break;
				}
			} while (trabajadoresCapturados < numeroTrabajadores);
		} else {
			JOptionPane.showInputDialog(null, "No se pueden capturar cero o menos trabajadores. Intente de nuevo "
					    + "ingresando un número válido.",
				        "Sueldo de trabajadores - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "El trabajador no. " + trabajadorConMejorSueldo + ", con un sueldo de $"
			    + mayorSueldo + " es quien cuenta con el mayor sueldo de los registrados.",
		        "Sueldo de trabajadores - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
	}
}