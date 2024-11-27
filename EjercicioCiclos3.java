/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
Resolver utilizando el ciclo con estructura for.

"Realiza un programa que calcule la suma de los n�meros pares
comprendidos entre el rango 20 y 50."
*/

package programas;
import java.util.Scanner;

public class EjercicioCiclos3 {
	public static void main(String[] args) {
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ejercicio de ciclos no. 3 - Yahir Saavedra, 21490577\n\n" + 
						   "Este programa imprimir� el c�lculo de la suma de n�meros " + 
					       "pares comprendidos entre el rango 20 y 50.\n\nPresiona " +
					       "ENTER para continuar.\n");
		teclado.nextLine();
		System.out.println("N�meros pares del 20 al 50:");
		for(int i = 20; i <= 50; i += 2) { /* Se pudo usar un if (i % 2 == 0), pero considero
		 									  que esta soluci�n tambi�n es valida. */
			suma = suma + i;
			System.out.println(i + " (suma actual: " + suma + ")");
		}
		System.out.println("Suma de todos los n�meros: " + suma);
		System.out.println("\nListo. Presiona ENTER para salir del programa.");
		teclado.nextLine();
		teclado.close();
	}
}