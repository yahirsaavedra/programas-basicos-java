package programas;
import javax.swing.JOptionPane;
public class NumeroImparGUI {
	public static void main(String[] args) {
		int numero, resultado;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));
		resultado = numero % 2;
		if (resultado == 0) {
        JOptionPane.showMessageDialog(null, numero + " es número par. El residuo de la división es cero.",
                "Número impar - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, numero + " es un número impar. El residuo de la división no es cero.",
	            "Número impar - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		}
	}
}