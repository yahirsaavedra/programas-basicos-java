/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
"Realiza un programa que imprima los n�meros enteros del 15 al 25
en orden descendente (25,24,23,...,15).
Utiliza la estructura Do..while"
*/


package programas;
import java.util.Scanner;

public class MasEjerciciosDeCiclos1 {
	public static void main(String[] args) {
		int i = 25;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa imprimir� los n�meros" +
				           "enteros del 15 al 25 en orden descendente." +
					       "\n\nPresiona ENTER para continuar.");
		teclado.nextLine();
		do {
			System.out.println(i);
			i--;
		} while (i >= 15);
		System.out.println("\nEjecuci�n terminada. Presiona ENTER para salir.");
		teclado.nextLine();
		teclado.close();
	}
}