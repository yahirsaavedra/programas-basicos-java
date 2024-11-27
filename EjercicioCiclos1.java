/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
Resolver utilizando el ciclo con estructura while.

"Dada la nota definitiva de 30 estudiantes, realice un programa que
permita calcular y dar como salida lo siguiente:

      * Cantidad de Alumnos Aprobados
      * Cantidad de Alumnos Reprobados
      * Promedio General de Notas

  Nota: En este caso se utilizar�n dos contadores: uno para contar
  los alumnos aprobados y el otro para los reprobados. Adem�s se
  utilizar� un acumulador para calcular el promedio."
*/

package programas;
import javax.swing.JOptionPane;

public class EjercicioCiclos1 {
	public static void main(String[] args) {
		int contadorAprobados = 0, contadorReprobados = 0, contadorAlumnos = 0;
		double basePromedio = 0, promedioGeneral = 0;
		while (contadorAlumnos < 30) {
			double calificacion;
			calificacion = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la calificaci�n (entre el rango 0 y 100) del alumno no. " + (contadorAlumnos + 1),
											  "Ejercicio de ciclos no. 1 - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
			if (calificacion >= 70 && calificacion <= 100) {
				contadorAprobados++;
				contadorAlumnos++;
				basePromedio = basePromedio + calificacion;
			} else if (calificacion >= 0 && calificacion < 70){
				contadorReprobados++;
				contadorAlumnos++;
				basePromedio = basePromedio + calificacion;
			} else {
				JOptionPane.showMessageDialog(null, "Una de las calificaciones no fue ingresada correctamente. Intente de nuevo desde el principio.", "Ejercicio de ciclos no. 1 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
				break;
			}
		}
		promedioGeneral = basePromedio / contadorAlumnos;
		JOptionPane.showMessageDialog(null, "Total de alumnos registrados: " + contadorAlumnos + "\nAlumnos aprobados: " + contadorAprobados + "\nAlumnos reprobados: " + contadorReprobados + "\nPromedio general (todo el grupo): " + promedioGeneral, "Ejercicio de ciclos no. 1 - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
	}
}