/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
"Elabora un programa que dado un vector V de N n�meros
enteros, cambie cada elemento menor que 10 por 0 y cada
elemento mayor que 20 por 1.

Encuentre cu�ntos elementos quedaron sin cambiar."
*/

package programas;
import javax.swing.JOptionPane;

//IMPORTANTE: El programa requiere de la versi�n Java 1.8 o superior, o no funcionar�.

public class Arreglos_Tarea2 {
	public static void main(String[] args) {
		int array[], arrayConvertido[], numeroDatos = 0, datosSinConvertir = 0, datosIngresados = 0;
		String arrayStr[], arrayConvertidoStr[];
		try {
				numeroDatos = Integer.parseInt(JOptionPane.showInputDialog(null, "�Cu�ntos datos quieres introducir?",
														   "Arreglos, pr�ctica 2 - Yahir Saavedra, 21490577",
														   JOptionPane.QUESTION_MESSAGE));
				array = new int[numeroDatos];
				arrayStr = new String[numeroDatos];
				arrayConvertido = new int[numeroDatos];
				arrayConvertidoStr = new String[numeroDatos];
			if (numeroDatos > 0) {
				int numero;
				while (datosIngresados < numeroDatos) {
					numero = Integer.parseInt(JOptionPane.showInputDialog(null, "�Dame un n�mero cualquiera! Este ser� " +
														  "tu dato no. " + (datosIngresados + 1) + " de " + numeroDatos + ".",
														  "Arreglos, pr�ctica 2 - Yahir Saavedra, 21490577",
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
							"]\n\nSolamente " + datosSinConvertir + " n�meros del arreglo no fueron convertidos.",
							"Arreglos, pr�ctica 2 - Yahir Saavedra, 21490577",
							JOptionPane.INFORMATION_MESSAGE);
			} else {
			JOptionPane.showInputDialog(null, "No se pueden capturar cero o menos datos. Intenta de nuevo "
		    		   + "ingresando un n�mero v�lido.",
				       "Arreglos, pr�ctica 2 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurri� un error interno en el programa. Intenta de nuevo.",
					    "Arreglos, pr�ctica 2 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
		}
	}
}