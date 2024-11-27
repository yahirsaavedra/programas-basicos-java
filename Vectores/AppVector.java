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

import java.util.Scanner;

public class AppVector {
	public void menu(){
		Scanner leer = new Scanner(System.in);
		Vector objV = new Vector(5);
		int opc = 0;
		String msj = "Operaciones Basicas del un Vector de tipo\n";
		msj+="1..... Agregar un elemento\n";
		msj+="2..... Presentar todos los datos\n";
		msj+="3..... Buscar un elemento\n";
		msj+="4..... Eliminar un elemento\n";
		msj+="5..... modificar un elemento\n";
		msj+="6..... ordenar los elementos\n";
		msj+="9..... Buscar elementos repetidos\n";
		msj+="Seleccionar\n"; // msj= msj+"Seleccionar";
		do {
			System.out.println(msj);
			opc = leer.nextInt();
			switch(opc){
				case 1: int newDato =0;
					    System.out.println("Dame un numero entero");
						newDato = leer.nextInt();
					    objV.agregar(newDato);
						break;
				case 2: 
					   System.out.println(objV.toString());
					   break;
				case 3: 
						int buscarE =0;
						System.out.println("Dame un numero a buscar");
						buscarE = leer.nextInt();
						int pos = objV.buscar(buscarE);
						if (pos!= -1){
							System.out.println("El dato "+objV.datos[pos]+" esta en la posicion "+pos);
						}else
							System.out.println("Dato no existe");
						
					    break;
				case 4:
						int eliminar =0;
						System.out.println("Dame un numero a eliminar");
						eliminar = leer.nextInt();
						pos = objV.buscar(eliminar);
						if (pos!= -1) {
							System.out.println("El dato "+objV.datos[pos]+" esta en la posicion "+pos);
							objV.recorrer(pos);
						} else
							System.out.println("Dato no existe");
						break;
				case 5:
						int v1 =0;
						System.out.println("Dame la posicion del valor a modificar");
						pos = leer.nextInt();
						System.out.println("Dame el valor a modificar");
						v1 = leer.nextInt();
						int ret = objV.modificar(pos, v1);
						if (ret != -1) {
							System.out.println("El dato "+ret+" se modifico por "+v1);
						} else
							System.out.println("Dato no existe");
						break;
				case 6:
						objV.ordenar();
						System.out.println("Se han ordenado los valores");
						break;
				case 9:
						System.out.println(objV.mostrarIguales());
						break;
			}
		} while(opc!=10);
		leer.close();
		
	}

	public static void main(String[] args) {
		AppVector obj = new AppVector();
		obj.menu();
	}
}