/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver: "Dado un valor num�rico determinar si se trata de un numero positivo, negativo o nulo, imprimiendo el mensaje correspondiente" con JOptionPane
 */

package programas;
import javax.swing.JOptionPane;
public class TipoNumeroGUI {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Este programa te ayudar� a determinar si un n�mero es positivo, negativo o nulo.\n\nIntroduce un n�mero entero:",
				"Tipo de n�mero - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
		if (numero > 0) {
			JOptionPane.showMessageDialog(null, "El n�mero " + numero + " es positivo, ya que es mayor que cero.",
	            "Tipo de n�mero - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		} else if (numero < 0) {
			JOptionPane.showMessageDialog(null, "El n�mero " + numero + " es negativo, ya que es menor que cero y tiene el s�mbolo de menos (-).",
		            "Tipo de n�mero - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero " + numero + " es nulo o neutro.",
	                "Tipo de n�mero - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}