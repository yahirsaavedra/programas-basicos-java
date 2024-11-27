/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver: "Dado un valor numérico determinar si se trata de un numero positivo, negativo o nulo, imprimiendo el mensaje correspondiente" con JOptionPane
 */

package programas;
import javax.swing.JOptionPane;
public class TipoNumeroGUI {
	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Este programa te ayudará a determinar si un número es positivo, negativo o nulo.\n\nIntroduce un número entero:",
				"Tipo de número - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
		if (numero > 0) {
			JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo, ya que es mayor que cero.",
	            "Tipo de número - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		} else if (numero < 0) {
			JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo, ya que es menor que cero y tiene el símbolo de menos (-).",
		            "Tipo de número - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		} else {
			JOptionPane.showMessageDialog(null, "El número " + numero + " es nulo o neutro.",
	                "Tipo de número - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}