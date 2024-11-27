/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Usando la estructura while.
Realiza un programa que lea la especialidad a la que pertenecen
10 estudiantes de posgrado para que al finalizar despliegue lo
siguiente:
- Cuántos estudiantes son de Electrónica
- Cuántos estudiantes son de Sistemas
- Cuántos estudiantes son de Mecatrónica
- Cuantos son de otra especialidad"
*/

package programas;
import javax.swing.JOptionPane;

public class MasEjerciciosDeCiclos3 {
	public static void main(String[] args) {
		int registro = 1;
		int electronica = 0, sistemas = 0, mecatronica = 0, otros = 0, total = 0;

		while (registro <= 10) {
			String entrada;
			char carrera;
			entrada = JOptionPane.showInputDialog(null, "Alumno no. " + registro + ", ingrese " +
					  "la especialidad a que corresponde usted:\n\n[E] Electrónica\n[S] Sistemas " +
					  "Computacionales\n[M] Mecatrónica\n[O] Otra especialidad",
					  "Registro de alumnos de posgrado", JOptionPane.QUESTION_MESSAGE);
			if (entrada != null) {
				carrera = (entrada).charAt(0);
			} else {
				carrera = 'x'; // El usuario le dio clic al botón "Cancelar". Termina el programa.
			}
			
			if (carrera == 'x') { 
				System.exit(0);
			} else if (carrera == 'e' || carrera == 'E') {
				electronica++;
				registro++;
			} else if (carrera == 's' || carrera == 'S') {
				sistemas++;
				registro++;
			} else if (carrera == 'm' || carrera == 'M') {
				mecatronica++;
				registro++;
			} else if (carrera == 'o' || carrera == 'O') {
				otros++;
				registro++;
			} else {
				JOptionPane.showMessageDialog(null, "La carrera del alumno no. " + registro + " fue " +
						"registrada incorrectamente. Intente de nuevo.",
						"Registro de alumnos de posgrado", JOptionPane.ERROR_MESSAGE);
			}
		}
		total = electronica + sistemas + mecatronica + otros;
		JOptionPane.showMessageDialog(null, "Total de alumnos registrados: " + total + "\n" +
				"Estudiantes de Electrónica: " + electronica + "\n" +
				"Estudiantes de Sistemas Computacionales: " + sistemas + "\n" +
				"Estudiantes de Mecatrónica: " + mecatronica + "\n" +
				"Estudiantes de otras carreras: " + otros,
				"Registro de alumnos de posgrado", JOptionPane.INFORMATION_MESSAGE);
	}
}
