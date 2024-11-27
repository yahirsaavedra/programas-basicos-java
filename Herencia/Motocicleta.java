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

public class Motocicleta extends Vehiculo {
    private int plazas;

    public Motocicleta(Color color, int ruedas, int cilindros, int potencia,
    				   int plazas) {
		super(color, ruedas, cilindros, potencia);
		this.plazas = plazas;
	}

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta [Plazas: " + plazas + "]";
    }

    
}
