package programas;
import javax.swing.JOptionPane;
public class NumeroImparGUI {
	public static void main(String[] args) {
		int numero, resultado;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero entero:"));
		resultado = numero % 2;
		if (resultado == 0) {
        JOptionPane.showMessageDialog(null, numero + " es n�mero par. El residuo de la divisi�n es cero.",
                "N�mero impar - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, numero + " es un n�mero impar. El residuo de la divisi�n no es cero.",
	            "N�mero impar - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);	
		}
	}
}