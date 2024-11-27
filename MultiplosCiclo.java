/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Realiza un programa que lea dos números enteros positivos A y B y muestre los múltiplos
de A que hay desde 1 hasta B.

Por ejemplo si A = 4 y B = 50 el programa mostrará los múltiplos de 4 desde 1 hasta 50.

El valor de A deberá ser menor que el valor de B. Si no se introducen valores válidos para
A o B se mostrará el mensaje correspondiente y se vuelven a pedir.

Analisis de la Solución:

Para resolverlo seguiremos los siguientes pasos:
1. Introducir los valores de A y B por teclado.
En este punto se debes comprobar que los valores introducidos por teclado para A y B sean
válidos, debes comprobar que los valores de A y B sean mayores que cero y además que el valor
de A sea menor que el de B.
2. Mediante un ciclo se mostrarán los múltiplos de A entre 1 y B."
*/

package programas;
import javax.swing.JOptionPane;

public class MultiplosCiclo {
	public static void main(String[] args) {
		String strA, strB;
		int a = 0, b = 0;
		boolean correctoA = false, correctoB = false;
		
		JOptionPane.showMessageDialog(null, "Este programa le preguntará por dos números positivos " +
				   "e imprimirá los múltiplos del\nprimer número que ingrese desde el 1 hasta el segundo " +
				   "número que ingrese.\nPor ejemplo, si ingresa respectivamente 4 y 50, el programa " +
				   "revisará todos los números\ndel 1 al 50 e imprimirá en la consola solamente aquellos " +
				   "que son múltiplos de 4.",
			       "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
		
		while (!correctoA) {
			strA = JOptionPane.showInputDialog(null, "Ingrese su primer número entero positivo:", 
				   "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
			if (strA == null) {
				System.exit(0);
			} else {
				a = Integer.parseInt(strA);
				if (a <= 0) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor que cero.",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				} else {
					correctoA = true;
				}
			}
		}
		
		while (correctoA && !correctoB) {
			strB = JOptionPane.showInputDialog(null, "Ingrese su segundo número entero positivo:\n\n" +
				   "Tenga en cuenta que su segundo número tiene que ser mayor al anterior que ingresó.", 
				   "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
			if (strB == null) {
				System.exit(0);
			} else {
				b = Integer.parseInt(strB);
				if (b <= 0) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor que cero.",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				} else if (b < a) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor al de su " +
				    "primer número. Su primer número fue " + a + ".",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				// En otras palabras, es lo mismo decir que A debe ser menor a B, que B sea mayor a A.
				} else {
					correctoB = true;
				}
			}
		}
		
		System.out.print("Lista de números del 1 al " + b + " que son múltiplos de " + a + ":\n\n");
		
		for (int i = 1; i <= b; i++) {
			if (i % a == 0) {
                System.out.println(i);
            }
		}
		
		System.out.print("\nEjecución terminada.");
	}
}
