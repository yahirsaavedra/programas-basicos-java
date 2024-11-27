/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
"Una cl�nica de maternidad necesita determinar cu�ntos beb�s han
nacido recientemente. Realiza un programa que solicite al usuario
capturar la cantidad de nacimientos (N) y si fue ni�a o ni�o
(genero, siendo M para masculino y F para femenino). Al final,
debe imprimir la cantidad de beb�s de cada g�nero.
Utiliza la estructura for"
*/

package programas;
import javax.swing.JOptionPane;

public class MasEjerciciosDeCiclos2 {
	public static void main(String[] args) {
		int nacimientos = 0, contadorHombres = 0, contadorMujeres = 0, total = 0;
		nacimientos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de nacimientos a registrar:",
							 		   "Cl�nica de maternidad Seguritas", JOptionPane.QUESTION_MESSAGE));
		
		if (nacimientos < 0) {
			JOptionPane.showMessageDialog(null, "Cantidad incorrecta. Intente de nuevo.",
										  "Cl�nica de maternidad Seguritas", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		} else if (nacimientos == 0) {
			System.exit(0); // Act�a como un comando "Cancelar", 0 nacimientos -> salir del programa.
		} else {
			for (int registro = 1; registro <= nacimientos; registro++) {
				String genero;
				char generoChar;
				genero = JOptionPane.showInputDialog(null, "Especifique el g�nero del infante no. " + registro + ":\n\n" +
													 "[M] Masculino\n[F] Femenino", "Cl�nica de maternidad Seguritas",
													 JOptionPane.QUESTION_MESSAGE);
				if (genero != null) {
					generoChar = genero.charAt(0);
				} else {
					generoChar = 'x'; /* Si el valor del string 'genero' es nulo, el usuario le dio clic al bot�n
										 de cancelar. Sale del programa. */
				}
				
				if (generoChar == 'M' || generoChar == 'm') {
					contadorHombres++;
				} else if (generoChar == 'F' || generoChar == 'f') {
					contadorMujeres++;
				} else if (generoChar == 'x') {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null, "El g�nero del infante no. " + registro + " se especific� de manera " + 
												 "incorrecta. Intente de nuevo.", "Cl�nica de maternidad Seguritas", 
												 JOptionPane.ERROR_MESSAGE);
					registro = registro - 1;
				}
			}
			total = contadorHombres + contadorMujeres;
			JOptionPane.showMessageDialog(null, "Total de infantes registrados: " + total + "\n" +
												"Ni�os (sexo masculino): " + contadorHombres + "\n" +
												"Ni�as (sexo femenino): " + contadorMujeres,
												"Cl�nica de maternidad Seguritas", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
