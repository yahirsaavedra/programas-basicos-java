/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Realiza un programa usando arreglo que lea 10 valores y
al final muestre cual fue el valor mínimo que tiene el
arreglo junto con el registro en donde se encuentra." 
*/

package programas;
import javax.swing.JOptionPane;

// IMPORTANTE: El programa requiere de la versión Java 1.8 o superior, o no funcionará.

public class Arreglos_Tarea1 {
	public static void main(String[] args) {
		int[] arregloValores = new int[10];
		String[] arregloValoresStr = new String[10];
		int valorMinimo = 0, registroMinimo = 0;
		for (int i = 0; i <= 9; i++) {
			String valor = "";
			try {
				valor = JOptionPane.showInputDialog(null, "Ingrese un número entero cualquiera " +
										 "(entrada no. " + (i + 1) + ")" + ":",  "Arreglos, práctica 1 - Yahir "
										 + "Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE);
				arregloValores[i] = Integer.parseInt(valor);
				arregloValoresStr[i] = valor;
			} catch (Exception e) {
				if (valor == null) {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null, "Uno de los valores no fue ingresado correctamente u ocurrió un " +
						 "error. Intenta de nuevo.", "Arreglos, práctica 1 - Yahir Saavedra, 21490577",
						 JOptionPane.ERROR_MESSAGE);
					i--;
				}
			}
		}
		valorMinimo = arregloValores[0]; 
		for (int i = 1; i < arregloValores.length; i++) { 
		    if (arregloValores[i] < valorMinimo) { 
		        valorMinimo = arregloValores[i]; 
		        registroMinimo = i;
		    } 
		}
		JOptionPane.showMessageDialog(null, "De acuerdo al orden en el que fueron ingresados los valores,\n" +
				 "los datos registrados son:\n" + String.join(", " , arregloValoresStr) + "\n\nDe estos valores, " +
				 "el valor mínimo es " + valorMinimo + " y se encuentra en el registro no. " + (registroMinimo + 1) + "\n" +
				 "(valor de arreglo: " + registroMinimo + ")"
				 ,
				 "Arreglos, práctica 1 - Yahir Saavedra, 21490577",
				 JOptionPane.INFORMATION_MESSAGE);
	}
}
