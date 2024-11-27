package programas;
import javax.swing.JOptionPane;
public class PrecioVentaGUI {
	public static void main(String[] args) {
		double precioUnidad, iva, totalVenta, totalIva;
		int cantidad;
		precioUnidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio por unidad del producto:"));
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de productos vendidos:"));
		iva = Double.parseDouble(JOptionPane.showInputDialog("Introduzca IVA:"));
		totalVenta = precioUnidad * cantidad;
        totalIva = totalVenta * iva / 100;
        totalVenta = totalVenta + totalIva;
        JOptionPane.showMessageDialog(null, "El precio de venta es: " + totalVenta,
                "Cálculo de precio de venta - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
	}
}