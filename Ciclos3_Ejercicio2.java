/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"2.	Realiza un programa eleve un número a n potencia usando for."
*/

package programas;
import javax.swing.JOptionPane;

public class Ciclos3_Ejercicio2 {
	public static void main(String[] args) {
		long numero = 0, potencia = 0, resultado = 1;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero:",
				  "Elevar número a una potencia - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
		potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas veces desea elevar el número? Ingrese un" + 
				   "número.\n\nPor ejemplo, 2 es al cuadrado, 3 es al cubo y así, sucesivamente.",
				   "Elevar número a una potencia - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
		
		for (int i = 1; i <= potencia; i++) {
			resultado = resultado * numero;
		}
			
		JOptionPane.showMessageDialog(null, "El resultado de " + numero + "^" + potencia + " es " + resultado + "." ,
		"Elevar número a una potencia - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE);
		
		}
}