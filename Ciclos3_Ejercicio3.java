/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"3.	Realiza un programa que lea una serie de N datos y nos muestre:
el número de datos introducidos, la suma de los valores de los datos,
la media del conjunto de datos, el máximo, el mínimo. Utiliza
estructura while"
*/

package programas;
import javax.swing.JOptionPane;

public class Ciclos3_Ejercicio3 {
	public static void main(String[] args) {
		
		int numeroDatos = 0, datosCapturados = 0, suma = 0, maximo = 0, minimo = 0;
		double media = 0;
		numeroDatos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos datos quieres introducir? "
				      + "(como datos tomaremos números enteros)", "Lectura de datos - Yahir Saavedra, 21490577",
				      JOptionPane.QUESTION_MESSAGE));
		if (numeroDatos > 0) {
			while (datosCapturados < numeroDatos) {
				int dato = 0;
				dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número entero mayor de 0:",
				       "Lectura de datos - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
				if (dato < 0) {
					JOptionPane.showInputDialog(null, "El número es menor que cero. Intente de nuevo.",
								"Lectura de datos - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
					break;
				} else {
					suma = suma + dato;
					datosCapturados++;
				}
				
				if (dato > maximo) {
		            maximo = dato;
		        }
		        if (dato < minimo || minimo == 0) {
		        	minimo = dato;
		        }
			}
			media = Double.valueOf(suma) / Double.valueOf(datosCapturados);
			JOptionPane.showMessageDialog(null, "Resultados de la lectura de datos:\n\n" + 
						"Número de datos introducidos: " + datosCapturados + "\n" +
						"Suma de los valores de cada dato: " + suma + "\n" +
						"Media entre todos los datos: " + media + "\n" +
						"Dato máximo: " + maximo + "\n" +
						"Dato mínimo: " + minimo,
						"Lectura de datos - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showInputDialog(null, "No se pueden capturar cero o menos datos. Intenta de nuevo "
					    + "ingresando un número válido.",
				        "Lectura de datos - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
		}
	}
}