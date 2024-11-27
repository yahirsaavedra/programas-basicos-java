/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"4. Realiza un programa que lea el siguiente la cadena “123456789” y
muestre por pantalla lo siguiente (utiliza la estructura que más se
te facilita)"
*/

package programas;

public class Ciclos3_Ejercicio4 {
	public static void main(String[] args) {
		String cadena = "123456789";
		System.out.println(cadena);
		while (cadena.length() >= 1) {
			cadena = cadena.substring(0, cadena.length() - 1);
			System.out.println(cadena);
		}
		System.out.println("Listo");
	}
}