/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Una clínica de maternidad necesita determinar cuántos bebés han
nacido recientemente. Realiza un programa que solicite al usuario
capturar la cantidad de nacimientos (N) y si fue niña o niño
(genero, siendo M para masculino y F para femenino). Al final,
debe imprimir la cantidad de bebés de cada género.
Utiliza la estructura for"
*/

package programas;
import javax.swing.JOptionPane;

public class MasEjerciciosDeCiclos2 {
	public static void main(String[] args) {
		int nacimientos = 0, contadorHombres = 0, contadorMujeres = 0, total = 0;
		nacimientos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de nacimientos a registrar:",
							 		   "Clínica de maternidad Seguritas", JOptionPane.QUESTION_MESSAGE));
		
		if (nacimientos < 0) {
			JOptionPane.showMessageDialog(null, "Cantidad incorrecta. Intente de nuevo.",
										  "Clínica de maternidad Seguritas", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		} else if (nacimientos == 0) {
			System.exit(0); // Actúa como un comando "Cancelar", 0 nacimientos -> salir del programa.
		} else {
			for (int registro = 1; registro <= nacimientos; registro++) {
				String genero;
				char generoChar;
				genero = JOptionPane.showInputDialog(null, "Especifique el género del infante no. " + registro + ":\n\n" +
													 "[M] Masculino\n[F] Femenino", "Clínica de maternidad Seguritas",
													 JOptionPane.QUESTION_MESSAGE);
				if (genero != null) {
					generoChar = genero.charAt(0);
				} else {
					generoChar = 'x'; /* Si el valor del string 'genero' es nulo, el usuario le dio clic al botón
										 de cancelar. Sale del programa. */
				}
				
				if (generoChar == 'M' || generoChar == 'm') {
					contadorHombres++;
				} else if (generoChar == 'F' || generoChar == 'f') {
					contadorMujeres++;
				} else if (generoChar == 'x') {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null, "El género del infante no. " + registro + " se especificó de manera " + 
												 "incorrecta. Intente de nuevo.", "Clínica de maternidad Seguritas", 
												 JOptionPane.ERROR_MESSAGE);
					registro = registro - 1;
				}
			}
			total = contadorHombres + contadorMujeres;
			JOptionPane.showMessageDialog(null, "Total de infantes registrados: " + total + "\n" +
												"Niños (sexo masculino): " + contadorHombres + "\n" +
												"Niñas (sexo femenino): " + contadorMujeres,
												"Clínica de maternidad Seguritas", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
