/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Elabora un programa que dado un vector V de N números
enteros, cambie cada elemento menor que 10 por 0 y cada
elemento mayor que 20 por 1.

Encuentre cuántos elementos quedaron sin cambiar."
*/

package programas;
import javax.swing.JOptionPane;

//IMPORTANTE: El programa requiere de la versión Java 1.8 o superior, o no funcionará.

public class Arreglos_Tarea2 {
	public static void main(String[] args) {
		int array[], arrayConvertido[], numeroDatos = 0, datosSinConvertir = 0, datosIngresados = 0;
		String arrayStr[], arrayConvertidoStr[];
		try {
				numeroDatos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos datos quieres introducir?",
														   "Arreglos, práctica 2 - Yahir Saavedra, 21490577",
														   JOptionPane.QUESTION_MESSAGE));
				array = new int[numeroDatos];
				arrayStr = new String[numeroDatos];
				arrayConvertido = new int[numeroDatos];
				arrayConvertidoStr = new String[numeroDatos];
			if (numeroDatos > 0) {
				int numero;
				while (datosIngresados < numeroDatos) {
					numero = Integer.parseInt(JOptionPane.showInputDialog(null, "¡Dame un número cualquiera! Este será " +
														  "tu dato no. " + (datosIngresados + 1) + " de " + numeroDatos + ".",
														  "Arreglos, práctica 2 - Yahir Saavedra, 21490577",
														  JOptionPane.QUESTION_MESSAGE));
					array[datosIngresados] = numero;
					arrayStr[datosIngresados] = String.valueOf(numero);
					if (numero < 10) {
						arrayConvertido[datosIngresados] = 0;
						arrayConvertidoStr[datosIngresados] = "0";
					} else if (numero > 20) {
						arrayConvertido[datosIngresados] = 1;
						arrayConvertidoStr[datosIngresados] = "1";
					} else {
						arrayConvertido[datosIngresados] = numero;
						arrayConvertidoStr[datosIngresados] = String.valueOf(numero);
						datosSinConvertir++;
					}
					datosIngresados++;
				}
				JOptionPane.showMessageDialog(null, "Estos son los datos introducidos:\n[" +
							String.join(", " , arrayStr) + "]\n\nEstos son los datos convertidos, de acuerdo " +
							"a las instrucciones de este ejercicio:\n\n[" + String.join(", " , arrayConvertidoStr) +
							"]\n\nSolamente " + datosSinConvertir + " números del arreglo no fueron convertidos.",
							"Arreglos, práctica 2 - Yahir Saavedra, 21490577",
							JOptionPane.INFORMATION_MESSAGE);
			} else {
			JOptionPane.showInputDialog(null, "No se pueden capturar cero o menos datos. Intenta de nuevo "
		    		   + "ingresando un número válido.",
				       "Arreglos, práctica 2 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrió un error interno en el programa. Intenta de nuevo.",
					    "Arreglos, práctica 2 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
		}
	}
}