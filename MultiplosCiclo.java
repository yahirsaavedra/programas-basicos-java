/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
"Realiza un programa que lea dos n�meros enteros positivos A y B y muestre los m�ltiplos
de A que hay desde 1 hasta B.

Por ejemplo si A = 4 y B = 50 el programa mostrar� los m�ltiplos de 4 desde 1 hasta 50.

El valor de A deber� ser menor que el valor de B. Si no se introducen valores v�lidos para
A o B se mostrar� el mensaje correspondiente y se vuelven a pedir.

Analisis de la Soluci�n:

Para resolverlo seguiremos los siguientes pasos:
1. Introducir los valores de A y B por teclado.
En este punto se debes comprobar que los valores introducidos por teclado para A y B sean
v�lidos, debes comprobar que los valores de A y B sean mayores que cero y adem�s que el valor
de A sea menor que el de B.
2. Mediante un ciclo se mostrar�n los m�ltiplos de A entre 1 y B."
*/

package programas;
import javax.swing.JOptionPane;

public class MultiplosCiclo {
	public static void main(String[] args) {
		String strA, strB;
		int a = 0, b = 0;
		boolean correctoA = false, correctoB = false;
		
		JOptionPane.showMessageDialog(null, "Este programa le preguntar� por dos n�meros positivos " +
				   "e imprimir� los m�ltiplos del\nprimer n�mero que ingrese desde el 1 hasta el segundo " +
				   "n�mero que ingrese.\nPor ejemplo, si ingresa respectivamente 4 y 50, el programa " +
				   "revisar� todos los n�meros\ndel 1 al 50 e imprimir� en la consola solamente aquellos " +
				   "que son m�ltiplos de 4.",
			       "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
		
		while (!correctoA) {
			strA = JOptionPane.showInputDialog(null, "Ingrese su primer n�mero entero positivo:", 
				   "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
			if (strA == null) {
				System.exit(0);
			} else {
				a = Integer.parseInt(strA);
				if (a <= 0) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un n�mero mayor que cero.",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				} else {
					correctoA = true;
				}
			}
		}
		
		while (correctoA && !correctoB) {
			strB = JOptionPane.showInputDialog(null, "Ingrese su segundo n�mero entero positivo:\n\n" +
				   "Tenga en cuenta que su segundo n�mero tiene que ser mayor al anterior que ingres�.", 
				   "Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
				   JOptionPane.QUESTION_MESSAGE);
			if (strB == null) {
				System.exit(0);
			} else {
				b = Integer.parseInt(strB);
				if (b <= 0) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un n�mero mayor que cero.",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				} else if (b < a) {
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un n�mero mayor al de su " +
				    "primer n�mero. Su primer n�mero fue " + a + ".",
					"Ejercicio de ciclos no. 7 - Yahir Saavedra, 21490577",
					JOptionPane.WARNING_MESSAGE);
				// En otras palabras, es lo mismo decir que A debe ser menor a B, que B sea mayor a A.
				} else {
					correctoB = true;
				}
			}
		}
		
		System.out.print("Lista de n�meros del 1 al " + b + " que son m�ltiplos de " + a + ":\n\n");
		
		for (int i = 1; i <= b; i++) {
			if (i % a == 0) {
                System.out.println(i);
            }
		}
		
		System.out.print("\nEjecuci�n terminada.");
	}
}
