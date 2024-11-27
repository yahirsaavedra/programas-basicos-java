package poo_marisela.MetodosVectores;

/*               
 *  INSTITUTO TECNOLÓGICO DE MEXICALI                                          *
 *  TECNOLOGÍCO NACIONAL DE MÉXICO                                             *
 *                                                                             *
 *  PROGRAMACIÓN ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIERÍA EN SISTEMAS COMPUTACIONALES                                     *
 *  NÚMERO DE CONTROL: 21490577                                                *
 *                                                                             *
 *  DOMINGO 6 DE MARZO DE 2022                                                 *
 */

/* ÁRBOL DE ARCHIVOS DE ESTE EJERCICIO:
 * - MetodosVectores_App.java: 		   La interfaz de usuario para invocar
 * 									   todos los métodos a través del menú de
 * 									   opciones.
 * - MetodosVectores_Operaciones.java: La clase para realizar todas las
 * 									   operaciones básicas del vector.
 */

/* INSTRUCCIONES DEL EJERCICIO (A ENTREGAR EL 8 DE MAR.):
 * 																				
 * "Operaciones básicas de un vector de tipo entero"
 * 
 * Hacer un programa en java que sea capaz de realizar las operaciones básicas
 * de un vector y manipularlo con un menú de opciones.
 * 
 * - Agregar un elemento
 * - Presentar todos los elementos del vector                               
 * - Presentar un elemento del vector e indicar la posición donde se encuentra
 * - Modificar un elemento
 * - Eliminar un elemento
 * - Ordenar los elementos del vector
 * - Salir
 * 
 * Deberás de crear dos clases una para realizar todas las operaciones básicas
 * del vector y otra clase para invocar cada uno de los métodos por el menú de
 * opciones.
 */

/* NOTA DEL ALUMNO:
 * 
 * Esta práctica la realicé utilizando la interfaz de JOptionPane, el cual
 * aprendí el semestre anterior con la profesora Claudia. Pense qué no lo
 * usuaríamos aquí, pero es que todo es más bonito cuando es gráfico.
 */

import javax.swing.JOptionPane;

public class MetodosVectores_App {
	/* El arreglo que adoptará el constructor. */
	public static String[] arregloInicial = {"A", "B", "C", "1", "2", "3"}; 
	public static MetodosVectores_Operaciones arreglo =
							new MetodosVectores_Operaciones(arregloInicial);
	
	/* Como yo hice el programa con la GUI de JOptionPane, decidí presentar 
	 * siempre todos los valores del arreglo en pantalla, para que el 
	 * usuario sepa cómo está cambiando el arreglo, en lugar de ponerlo
	 * como una opción separada del menú. */
	public static String arregloEnPantalla;
	public static String tituloVentana = "Interacción con un arreglo: " +
							   			 "Menú de control - Yahir Saavedra, " +
							   			 "21490577";
	
	public static void main(String[] args) {
		arregloEnPantalla = arreglo.toString() + "\nElementos registrados: " +
							arreglo.entrada.length + "\n\n";
		
		Object[] opciones = {"Agregar un elemento", "Buscar un elemento",
							 "Modificar un elemento", "Eliminar un elemento",
							 "Ordenar el arreglo", "Salir del programa"};
		Object seleccion = "";
	
		seleccion = JOptionPane.showInputDialog(null,
			   	    arregloEnPantalla + "Aquí tienes un arreglo interactivo. " +
			   	    "¿Qué quieres hacer con él?", tituloVentana,
			   	    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		if (seleccion == opciones[0])
			agregar();
		else if (seleccion == opciones[1])
			buscar();
		else if (seleccion == opciones[2])
			modificar();
		else if (seleccion == opciones[3])
			eliminar();
		else if (seleccion == opciones[4])
			ordenar();
		else if (seleccion == null || seleccion == opciones[5])
			salir();
	}
	
	static void agregar() {
		String texto = JOptionPane.showInputDialog(null,
					   arregloEnPantalla + "Ingresa el texto que quieres " +
					   "agregar al arreglo.", tituloVentana,
					   JOptionPane.QUESTION_MESSAGE);
		if (texto == null)
			main(null);
		else {
			arreglo.agregar(texto);
			main(null);
		}
	}
	
	static void buscar() {
		String busqueda = JOptionPane.showInputDialog(null,
						  arregloEnPantalla + "Ingresa el elemento que " +
						  "quieres buscar en el arreglo.", tituloVentana,
						  JOptionPane.QUESTION_MESSAGE);
		if (busqueda == null)
			main(null);
		else {
			if (arreglo.buscar(busqueda).equals("")) 
				JOptionPane.showMessageDialog(null, arregloEnPantalla +
				"No se encontraron resultados para '" + busqueda + "'.",
				tituloVentana, JOptionPane.INFORMATION_MESSAGE);
			else 
				JOptionPane.showMessageDialog(null, arregloEnPantalla +
				"Se encontraron resultados para '" + busqueda + "' " +
				"en el/los siguiente(s) índice(s): " +
				arreglo.buscar(busqueda),
				tituloVentana, JOptionPane.INFORMATION_MESSAGE);
			main(null);
		}
	}
	
	static void modificar() {
		String indice = JOptionPane.showInputDialog(null, arregloEnPantalla + 
						"Escribe el índice que corresponde al elemento que " +
						"quieres modificar. Tiene que ser un número entero " + 
						"del 0 al " + (arreglo.entrada.length - 1) + ".",
						tituloVentana, JOptionPane.QUESTION_MESSAGE);
		int indiceNumero = Integer.parseInt(indice);
		if (indiceNumero < 0 && indiceNumero > arreglo.entrada.length - 1) {
			JOptionPane.showMessageDialog(null, "El índice que ingresate no " +
			"existe. Ingresa otro.", tituloVentana, JOptionPane.ERROR_MESSAGE);
			modificar();
		}
		else if (indice == null) 
			main(null);
		else {
			String texto = JOptionPane.showInputDialog(null, arregloEnPantalla +
				           "Estás modificando el índice no. " + indice + ", " +
				           "con texto '" + arreglo.entrada[indiceNumero] +
				           "'. Haz clic en 'Cancelar' si quieres cambiar el " +
				           "índice.\nAhora, escribe el texto que reemplazará " +
				           "este elemento.", tituloVentana,
				           JOptionPane.QUESTION_MESSAGE);
			if (texto != null && texto.length() == 0) {
				JOptionPane.showMessageDialog(null, "El texto está vacío. " +
				"Intenta de nuevo desde el principio.", tituloVentana,
				JOptionPane.ERROR_MESSAGE);
				modificar();
			}
			else if (texto == null)
				modificar();
			else {
				arreglo.modificar(indiceNumero, texto);
				main(null);
			}
		}
	}
	
	static void eliminar() {
		String indice = JOptionPane.showInputDialog(null, arregloEnPantalla + 
				"Escribe el índice que corresponde al elemento que " +
				"quieres eliminar. Tiene que ser un número entero " + 
				"del 0 al " + (arreglo.entrada.length - 1) + ".",
				tituloVentana, JOptionPane.QUESTION_MESSAGE);
		int indiceNumero = Integer.parseInt(indice);
		if (indiceNumero < 0 && indiceNumero > arreglo.entrada.length - 1) {
			JOptionPane.showMessageDialog(null, "El índice que ingresate no " +
			"existe. Ingresa otro.", tituloVentana, JOptionPane.ERROR_MESSAGE);
			eliminar();
		}
		else if (indice == null) 
			main(null);
		else {
			arreglo.eliminar(indiceNumero);
			main(null);
		}
	}
	
	static void ordenar() {
		arreglo.ordenar();
		main(null);
	}
	
	static void salir() {
		int confirmado = JOptionPane.showConfirmDialog(null, "¿Quieres salir " +
						 "del programa?", tituloVentana,
						 JOptionPane.YES_NO_OPTION,
						 JOptionPane.WARNING_MESSAGE);
		if (confirmado == JOptionPane.YES_OPTION)
			System.exit(0);
		else
			main(null);
	}
}
