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

public class MetodosVectores_Operaciones {
	public String[] entrada;
	
	public MetodosVectores_Operaciones(String[] arreglo) {
		this.entrada = arreglo;
	}
	
	public MetodosVectores_Operaciones() { /* Si no se inicializa con un
											arreglo, se adoptará uno vacío. */
		this.entrada = new String[0];
	}
	
	public void agregar(String elemento) {
		String copia[] = new String[entrada.length + 1];
		for (int i = 0; i < entrada.length + 1; i++) {
			System.out.println(i);
			if (i != entrada.length)
				copia[i] = entrada[i];
			else
				copia[entrada.length] = elemento;
		}
		entrada = copia;
	}
	
	public String buscar(String elemento) {
		int encontrados = 0;
		String indices = "";
		for (int i = 0; i < entrada.length - 1; i++) {
			if (entrada[i].equalsIgnoreCase(elemento)) {
				encontrados++;
				if (encontrados == 1)
					indices = String.valueOf(i);
				if (encontrados >= 2)
					indices = indices + ", " + String.valueOf(i);
			}
		}
		return indices;
	}
	
	public void modificar(int indice, String elemento) {
		entrada[indice] = elemento;
	}
	
	public void eliminar(int indice) {
		String copia[] = new String[entrada.length - 1];
		for (int i = 0; i < entrada.length - 1; i++) {
			if (i < indice)
				copia[i] = entrada[i];
			else
				copia[i] = entrada[i + 1];
		}
		entrada = copia;
	}
	
	public void ordenar() {
		for (int i = 0; i < entrada.length - 1; i++) {
            for (int j = i + 1; j < entrada.length; j++) {
                if (entrada[i].compareTo(entrada[j]) > 0) {
                    String temp = entrada[i];
                    entrada[i] = entrada[j];
                    entrada[j] = temp;
                }
            }
        }
	}
	
	@Override
	public String toString() {
	    StringBuilder lista = new StringBuilder();
	    for (int i = 0, n = entrada.length; i < n; i++) {
	        if (i > 0) {
	            lista.append(", ");
	        }
	        lista.append(entrada[i]);
	    }
	    return "[" + lista.toString() + "]";
	}
}
