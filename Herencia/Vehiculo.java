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

public class Vehiculo {

	private Color color;
	private int ruedas;
	private int cilindros;
	private int potencia;
	
	public Vehiculo(Color color, int ruedas, int cilindros, int potencia) {
		super();
		this.color = color;
		this.ruedas = ruedas;
		this.cilindros = cilindros;
		this.potencia = potencia;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [Color: " + color + ", Ruedas: " + ruedas +
			   ", Cilindros: " + cilindros + ", Potencia: " + potencia +
			   "HP] \tTipo de Vehiculo: ";
	}
	
	public void presentar() {
		System.out.println("Imprimiendo desde la clase padre");
	}
}
