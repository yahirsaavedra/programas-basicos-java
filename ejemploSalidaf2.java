/*
PROGRAMA COMENTADO POR:
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERÍA EN SISTEMAS COMPUTACIONALES
GRUPO C DE FUNDAMENTOS DE PROGRAMACIÓN
INSTITUTO TECNOLÓGICO DE MEXICALI
VIERNES, 8 DE OCTUBRE DE 2021
*/

// Inicio del programa

/* El archivo se guarda en el paquete 'programas', donde hemos guardado
todos los programas que hemos hecho en esta materia. */

package programas;

// Declaramos una clase con el nombre del programa, en este caso "ejemploSalidaf2"
public class ejemploSalidaf2 
{ // Abrimos la clase
	public static void main(String[] args) 
	{
	  /* Declaramos una variable, tipo double, es decir, número real decimal, llamada 'q'
		 y en ella guardamos el valor matemático de la operación 1 y 3. Como son números reales,
	 	 ponemos un .0 al final de los números por el tipo de dato (si no queremos decimales que
		 le precedan). */
	  double q = 1.0/3.0;
	  
		 /* El valor de q se imprime con un total de 5 números (contando el punto) y 3 decimales
		    de precisión y arroja 0.333 y el resto se llena con espacios. El %n se usa para 
			indicar un salto de línea. Para imprimir el número se usa la librería reservada de 
			System y se usa la función printf para imprimir una salida con un formato especificado. */
		 System.out.printf("1.0/3.0 = %5.3f %n", q);
		 /* Lo mismo, pero con 7 números totales y 5 decimales de máximo. Arroja 0.33333.
			Sigue un salto de linea. */
		 System.out.printf("1.0/3.0 = %7.5f %n", q);
		 q = 1.0/2.0; // El valor de q se reasigna y pasa a ser 1.0/2.0
		 /* El valor nuevo se imprime con 9 números totales y 3 decimales de precisión. Sin embargo,
			aquí se pide que el resultado no se rellene con espacios, sino con ceros, por ser "09". Arroja 
			00000.500. Sigue un salto de linea. */
		 System.out.printf("1.0/2.0 = %09.3f %n", q);
		 q = 1000.0/3.0; // Ahora el valor pasa a ser 1000 entre 3
		 /* El valor nuevo se imprime como una notación cientifica con el formato %e, con 7
			números totales y 1 solo decimal de precisión. Arroja 3.3e+02 y su espacio. Sigue
			la letra 'h' y luego un salto de línea.*/
		 System.out.printf("1000/3.0 = %7.1e h%n", q);
		 q = 3.0/4567.0; // Cambiamos el valor a una división entre 3 y 4567
		/* Lo mismo que antes, pero ahora imprimimos con 7 números totales y 3 decimales de
			precisión como notación científica. Arroja 6.569e-04. Sigue un salto de línea. */
		 System.out.printf("3.0/4567.0 = %7.3e %n", q);
		 q = -1.0/0.0; // q ahora es una división entre -1 y 0
		/* Lo mismo que antes, pero con 7 números totales y 2 decimales como notación científica.
		   Como la divisón es -1/0, el resultado es Infinity, porque una división de cualquier
		   número ajeno a 0 entre 0, es infinito. Sigue un salto de línea. */
		 System.out.printf("-1.0/0.0 = %7.2e %n", q);
		 q = 0.0/0.0; // q ahora es una división entre 0
		 /* El número se imprime como notación cientifica de 5 números totales y 2 decimales de
			precisión. Pero resulta que una división entre cero no tiene valor matemático real,
			no es posible calcularlo. Así que en este caso, arroja NaN (not a number). Salto de línea. */
		 System.out.printf("0.0/0.0 = %5.2e %n", q);
		 /* En esta línea, no se usa q, sino que se tomaron dos valores de una librería reservada
			de Java llamada Math, que son el valor informático del número pi y el número de Euler.
			Esos números se imprimen respectivamente como números reales. El primero, pi, con 5 
			números totales y 3 de precisión. El número de Euler como 10 números totales y 4 
			de precisión. Ambos resultados arrojan "3.142" y "    2.7183" respectivamente. 
			Recordemos que lo que falta del número se llena con espacios. Sigue un alto de línea. */
		 System.out.printf("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
		 /* Definimos una variable, tipo double, llamada 'r' con el valor de 1.1. Recordemos
			que acepta todo tipo de decimales, no solo números con el .0 */
		 double r = 1.1;
		 
		 /* Aquí se usa lo que nosotros llamamos índices de argumento, denotados por "%1$" y "%2$", el símbolo
			de dinero. Por orden: se indexa el primer argumento y se imprime como real de 5 números y 5 decimales.
			Luego se indexa el segundo argumento y se imprime como real de 4 números y 1 decimal. Ambos resultados
			arrojan "3.14159" y " 1.1", respectivamente. Se anida otro string con el símbolo de más. Se indexa el
			segundo y primer agumento y se repite el mismo proceso. Finalmente, un salto de línea. */
		 System.out.printf("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n",Math.PI, r);
		}
} // Cerramos la clase

// Fin del programa