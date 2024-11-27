package poo_marisela.MetodosVectores;

/*               
 *  INSTITUTO TECNOL�GICO DE MEXICALI                                          *
 *  TECNOLOG�CO NACIONAL DE M�XICO                                             *
 *                                                                             *
 *  PROGRAMACI�N ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIER�A EN SISTEMAS COMPUTACIONALES                                     *
 *  N�MERO DE CONTROL: 21490577                                                *
 *                                                                             *
 *  DOMINGO 6 DE MARZO DE 2022                                                 *
 */

/* �RBOL DE ARCHIVOS DE ESTE EJERCICIO:
 * - MetodosVectores_App.java: 		   La interfaz de usuario para invocar
 * 									   todos los m�todos a trav�s del men� de
 * 									   opciones.
 * - MetodosVectores_Operaciones.java: La clase para realizar todas las
 * 									   operaciones b�sicas del vector.
 */

/* INSTRUCCIONES DEL EJERCICIO (A ENTREGAR EL 8 DE MAR.):
 * 																				
 * "Operaciones b�sicas de un vector de tipo entero"
 * 
 * Hacer un programa en java que sea capaz de realizar las operaciones b�sicas
 * de un vector y manipularlo con un men� de opciones.
 * 
 * - Agregar un elemento
 * - Presentar todos los elementos del vector                               
 * - Presentar un elemento del vector e indicar la posici�n donde se encuentra
 * - Modificar un elemento
 * - Eliminar un elemento
 * - Ordenar los elementos del vector
 * - Salir
 * 
 * Deber�s de crear dos clases una para realizar todas las operaciones b�sicas
 * del vector y otra clase para invocar cada uno de los m�todos por el men� de
 * opciones.
 */

/* NOTA DEL ALUMNO:
 * 
 * Esta pr�ctica la realic� utilizando la interfaz de JOptionPane, el cual
 * aprend� el semestre anterior con la profesora Claudia. Pense qu� no lo
 * usuar�amos aqu�, pero es que todo es m�s bonito cuando es gr�fico.
 */

public class MetodosVectores_Operaciones {
	public String[] entrada;
	
	public MetodosVectores_Operaciones(String[] arreglo) {
		this.entrada = arreglo;
	}
	
	public MetodosVectores_Operaciones() { /* Si no se inicializa con un
											arreglo, se adoptar� uno vac�o. */
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
