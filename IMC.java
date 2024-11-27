package programas;

import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		int imc;
		imc = Integer.parseInt(JOptionPane.showInputDialog(null, "Este programa te ayudará a determinar tu estado de salud según tu IMC.\n\n¿Cuál es tu IMC?",
		"IMC - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "Tu IMC es " + imc + ".\nTu estado de salud es: " + calcularEstado(imc),
				"IMC - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String calcularEstado(int imc) {
		String estado;
		if (imc >= 16 && imc <= 18) {
			estado = "Bajo peso";
		} else if (imc > 18 && imc <= 25) {
			estado = "Peso normal";
		} else if (imc > 25 && imc <= 40) {
			estado = "Obesidad";
		} else if (imc > 40) {
			estado = "Obesidad mórbida";
		} else {
			estado = "¿Estás bien?";
		}
		return estado;
	}
}