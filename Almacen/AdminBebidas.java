/*               
 *  INSTITUTO TECNOL�GICO DE MEXICALI                                          *
 *  TECNOL�GICO NACIONAL DE M�XICO                                             *
 *                                                                             *
 *  PROGRAMACI�N ORIENTADA A OBJETOS                                           *
 *  PROFRA. MARISELA PONCE MILLANES                                            *
 *  CICLO 2022-1, SEGUNDO SEMESTRE                                             *
 *                                                                             *
 *  YAHIR ALEJANDRO SAAVEDRA GALLARDO                                          *
 *  INGENIER�A EN SISTEMAS COMPUTACIONALES                                     *
 *  N�MERO DE CONTROL: 21490577                                                *
 *  																		   *
 *  MI�RCOLES 11 DE MAYO DE 2022											   *
 */

package poo_marisela.Almacen;

import java.util.Scanner;

public class AdminBebidas {
	public static void main(String[] args) {
		adminBebida();
	}
	
	public static void adminBebida() {
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("===== ALMACEN DE BEBIDAS =====\n" +
						   "1. Agregar un producto\n" +
						   "2. Eliminar un producto\n" +
						   "3. Mostrar informaci�n\n" +
						   "4. Calcular precios\n" +
						   "5. Salir");
			opc = leer.nextInt();
			switch (opc) {
				case 1:
					int opcTemp;
					System.out.println("AGREGAR UNA BEBIDA\n" +
							   "1. Agua mineral\n" +
							   "2. Bebida azucarada\n" +
							   "3. Regresar al men�");
					opcTemp = leer.nextInt();
					if (opcTemp == 1) {
						
					} else if (opcTemp == 2) {
						
					} else if (opcTemp == 3) {
						break;
					} else {
						System.out.println("Opci�n invalida. Intenta de " +
										   "nuevo.");
						break;
					}	
				case 2:
					System.out.println("ELIMINAR UNA BEBIDA\n" +
							   		   "Por favor, ingresa la ID de la " + 
									   "bebida que quieras eliminar.");
				case 3:
					
				case 4:
					int opcTemp;
					System.out.println("CALCULAR PRECIOS\n" +
							   "1. \n" +
							   "2. Bebida azucarada\n" +
							   "3. Regresar al men�");
					opcTemp = leer.nextInt();
					if (opcTemp == 1) {
						
					} else if (opcTemp == 2) {
						
					} else if (opcTemp == 3) {
						break;
					} else {
						System.out.println("Opci�n invalida. Intenta de " +
										   "nuevo.");
						break;
					}	
				case 5:
					System.out.println("�Muchas gracias y hasta pronto!");
					break;
				default:
					System.out.println("Opci�n invalida. Intenta de nuevo.");
					break;
			}
		} while (opc != 5);
	}
}
