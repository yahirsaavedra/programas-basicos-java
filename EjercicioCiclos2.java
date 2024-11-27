/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
Resolver utilizando el ciclo con estructura do while.

"Realiza un programa que lea el nombre y la edad de un grupo de 10
personas, imprima el nombre y la edad de las personas mayores de
edad y la cantidad de menores de edad."
*/

package programas;
import javax.swing.JOptionPane;

public class EjercicioCiclos2 {
	public static void main(String[] args) {
		int contadorPersonas = 0, contadorMenores = 0, contadorMayores = 0;
		/* A pesar de que no se requería un contador para mayores de edad, lo quise incluir
		para que el programa se vea estéticamente más bonito. */
		do {
			String nombre;
			int edad = 0;
			nombre = JOptionPane.showInputDialog(null, "Persona no. " + (contadorPersonas + 1) + ":\n\n¿Cuál es tu nombre?",
					 "Ejercicio de ciclos no. 2 - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE);
			edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Persona no. " + (contadorPersonas + 1) + ":\n\n¿Cuántos años tienes?",
					 "Ejercicio de ciclos no. 2 - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
			if (nombre == null || edad < 0) {
				JOptionPane.showMessageDialog(null, "Uno de los datos proporcionados no fue ingresado correctamente. Intenta de nuevo desde el principio.", "Ejercicio de ciclos no. 1 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
				break;
			} else {
				String determinante;
				if (edad < 18) {
					determinante = "menor";
					contadorMenores++;
					contadorPersonas++;
				} else {
					determinante = "mayor";
					contadorMayores++;
					contadorPersonas++;
				}
				JOptionPane.showMessageDialog(null, "Persona no. " + contadorPersonas + ":\n\n¡Hola, " + nombre + "! Tienes " + edad + " años y eres " + determinante + " de edad.", "Ejercicio de ciclos no. 2 - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
			}
		} while (contadorPersonas < 10);
		JOptionPane.showMessageDialog(null, "Total de personas registradas: " + contadorPersonas + "\nMenores de edad registrados: " + contadorMenores + "\nMayores de edad registrados: " + contadorMayores, "Ejercicio de ciclos no. 2 - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
	}
}