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
 *  VIERNES 29 DE ABRIL DE 2022                                                *
 */
 
package poo_marisela.herencia;

public class App {

	public static void main(String[] args) {
		Motocicleta moto1 = new Motocicleta(Color.ROJO, 2, 2, 20, 2);
		Motocicleta moto2 = new Motocicleta(Color.BLANCO, 2, 1, 12, 2);
		Motocicleta moto3 = new Motocicleta(Color.NEGRO, 2, 4, 80, 2);
		Camion camion1 = new Camion(Color.PLATA, 8, 6, 120, 4);
		Camion camion2 = new Camion(Color.AZUL, 4, 6, 250, 2);
		System.out.println(moto1.toString() + "\n" + moto2.toString() + "\n" + 
						   moto3.toString() + "\n" + camion1.toString() + "\n" +
						   camion2.toString() );
	}
}
