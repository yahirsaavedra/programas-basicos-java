package poo_marisela.Vectores;

/*               
 *  INSTITUTO TECNOLÓGICO DE MEXICALI                                          *
 *  TECNOLÓGICO NACIONAL DE MÉXICO                                             *
 *                                                                             *
 *  PROGRAMACIÓN ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIERÍA EN SISTEMAS COMPUTACIONALES                                     *
 *  NÚMERO DE CONTROL: 21490577                                                *
 *                                                                             *
 *  VIERNES 11 DE MARZO DE 2022                                                *
 */
 
/* INSTRUCCIONES DEL EJERCICIO (A ENTREGAR HOY MISMO):
 * 																				
 * "Operaciones con vectores"
 * 
 * el programa debe tener todas las operaciones basicas
 *
 * agregar, eliminar, consultar, modificar, repetidos
 */

import java.util.Arrays;

public class Vector {
	public int datos[]; 
	public int ultimo;
	public int tamVec;
	public Vector(int n){
		datos = new int[n];
		ultimo = -1;
		tamVec = n;
	}
	public Vector(int n, int m){
		datos = new int[n];
		ultimo = -1;
	}
	public Vector(){
		datos = new int[5];
		ultimo = -1;
	}
	public void agregar(int newDatito){
		ultimo++; //ultimo = ultimo+1;
		datos[ultimo] = newDatito;
	}
	public int buscar(int buscarE){
		for (int i = 0; i <= ultimo; i++) {
			if (datos[i] == buscarE)
				return i;
		}
		return -1;
	}

	public void recorrer(int pos) {
		for(int i = pos; i < ultimo; i++) {
			datos[i] = datos[i+1];
		}
		datos[ultimo] = 0;
		ultimo--;
	}

	public int modificar(int pos, int v1) {
        if(ultimo == -1) {
            return -1;
        }
        if(pos <= ultimo) {
			int val = datos[pos];
            datos[pos] = v1;
        return val;
        }
		return -1;
	}

	public void ordenar() {
		int vTemp = 0;
    	for(int i = 0; i < ultimo; i++) {
    		for(int j = (i + 1); j <= ultimo; j++) {
                if(datos[j] < datos[i]) {
                vTemp = datos[i];
                datos[i] = datos[j];
                datos[j] = vTemp;
				}
            } 
    	}  
    }

	public String mostrarIguales() {
		int tempDatos[] = new int[tamVec]; 
		int vTemp = 1;
		String msg = "";
		for(int i = 0; i <= ultimo; i++) {
			for(int j = i + 1; j <= ultimo; j++) {
				if(datos[i] == datos[j]) {
					vTemp++;
					tempDatos[j] = 1;
				}
			}
			if(tempDatos[i] != 1) {
				if(vTemp > 1) {
					msg = msg + "El valor " + datos[i] + " se repite " + vTemp + " veces\n";
				}
				else msg = msg + "El valor " + datos[i] + " se repite " + vTemp + " vez\n";
			}
			vTemp = 1;
		}
		return msg;
	}
	
	@Override
	public String toString() {
		return "Vector [datos=" + Arrays.toString(datos) + ", ultimo=" + ultimo + "]";
	}
	
}