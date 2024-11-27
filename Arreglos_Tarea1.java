/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
"Realiza un programa usando arreglo que lea 10 valores y
al final muestre cual fue el valor m�nimo que tiene el
arreglo junto con el registro en donde se encuentra." 
*/

package programas;
import javax.swing.JOptionPane;

// IMPORTANTE: El programa requiere de la versi�n Java 1.8 o superior, o no funcionar�.

public class Arreglos_Tarea1 {
	public static void main(String[] args) {
		int[] arregloValores = new int[10];
		String[] arregloValoresStr = new String[10];
		int valorMinimo = 0, registroMinimo = 0;
		for (int i = 0; i <= 9; i++) {
			String valor = "";
			try {
				valor = JOptionPane.showInputDialog(null, "Ingrese un n�mero entero cualquiera " +
										 "(entrada no. " + (i + 1) + ")" + ":",  "Arreglos, pr�ctica 1 - Yahir "
										 + "Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE);
				arregloValores[i] = Integer.parseInt(valor);
				arregloValoresStr[i] = valor;
			} catch (Exception e) {
				if (valor == null) {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null, "Uno de los valores no fue ingresado correctamente u ocurri� un " +
						 "error. Intenta de nuevo.", "Arreglos, pr�ctica 1 - Yahir Saavedra, 21490577",
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
				 "el valor m�nimo es " + valorMinimo + " y se encuentra en el registro no. " + (registroMinimo + 1) + "\n" +
				 "(valor de arreglo: " + registroMinimo + ")"
				 ,
				 "Arreglos, pr�ctica 1 - Yahir Saavedra, 21490577",
				 JOptionPane.INFORMATION_MESSAGE);
	}
}
