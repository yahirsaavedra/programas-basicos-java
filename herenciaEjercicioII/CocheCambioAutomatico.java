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
 *  
 *  JUEVES 5 DE MAYO DE 2022
 */

package poo_marisela.herenciaEjercicioII;

public class CocheCambioAutomatico extends Coche {
	private String matricula;
	private double velocidad;
	private int marcha;
	
	public CocheCambioAutomatico(String matricula) {
		super(matricula);
		this.matricula = matricula;
		this.velocidad = 0;
		this.marcha = 0;
	}
}
