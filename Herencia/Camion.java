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

public class Camion extends Vehiculo {
	private int ejes;
	
	public Camion(Color color, int ruedas, int cilindros, int potencia,
				  int ejes) {
		super(color, ruedas, cilindros, potencia);
		this.ejes = ejes;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	@Override
	public String toString() {
			if (ejes <= 0) {
				return "ERROR: Los ejes no pueden ser igual o menor a cero.";
			}
		return super.toString() + "Camion [Ejes: " + ejes + "]";
	}
	
	public void presentar() {
		System.out.println("Imprimiendo desde la clase hija");
	}
}
