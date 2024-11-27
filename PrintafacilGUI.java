/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOL�GICO DE MEXICALI
N�MERO DE CONTROL: 21490577

Problema a resolver:
La empresa "PRINTAFACIL S.A de C.V" se dedica a vender impresoras con sistema de tinta
a un precio unitario de $378 (sin IVA).
Realiza un programa que permita ingresar la cantidad de impresores a comprar y seleccionar
la forma de pago para luego generar el detalle del pago a realizar.
Seg�n la forma de pago, la empresa realiza los siguientes descuentos:
Forma de pago Descuento
  - Efectivo 10%
  - Tarjeta de cr�dito 5%   
  - Vale de regalo 15%
Finalmente, el programa debe mostrar:
  - La cantidad de impresoras a comprar
  - El precio unitario de la impresora (con IVA).
  - La forma de pago
  - El descuento realizado
  - El total a pagar
Considere que todos los descuentos se realizan sobre el precio CON IVA (iva del 8%)
 */

package programas;
import javax.swing.JOptionPane;
public class PrintafacilGUI {

	public static void main(String[] args) {
		int cantidad;
		double descuento, total, precio = 378, iva = 0.08, precioConIva, totalConDescuento;
		char formaPago;
		// Los '\n' son saltos de l�nea
		 cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "�Bienvenido a su sucursal digital Printafacil, su mejor soluci�n para impresion(arlo a usted)!\n\nEn este momento, tenemos impresoras de $" + precio + " a la venta. �Cu�ntas gusta comprar?",
	                "PRINTAFACIL, S.A de C.V.", JOptionPane.INFORMATION_MESSAGE));
		 formaPago = (JOptionPane.showInputDialog(null, "�C�mo le gustar�a pagar su compra? Ingrese un n�mero seg�n la opci�n:\n\n[1] Con efectivo (10% de descuento)\n[2] Tarjeta de cr�dito (5% de descuento)\n[3] Vale de regalo (15% de descuento)",
				 	"PRINTAFACIL, S.A de C.V.", JOptionPane.INFORMATION_MESSAGE)).charAt(0);
		 
			switch (formaPago) {
			
			case '1':
				precioConIva = precio + (precio * iva);
				total = precioConIva * cantidad;
				descuento = total * 0.1;
				totalConDescuento = total - descuento;
				JOptionPane.showMessageDialog(null, "Impresoras a comprar: " + cantidad + "\nSubtotal (con IVA): $" + precioConIva * cantidad + "\nForma de pago: Efectivo\nDescuento aplicado: $" + descuento + "\nTotal: $" + totalConDescuento + "\n�Muchas gracias por su compra, que tenga un buen d�a!", "PRINTAFACIL, S.A de C.V.", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case '2':
				precioConIva = precio + (precio * iva);
				total = precioConIva * cantidad;
				descuento = total * 0.05;
				totalConDescuento = total - descuento;
				JOptionPane.showMessageDialog(null, "Impresoras a comprar: " + cantidad + "\nSubtotal (con IVA): $" + precioConIva * cantidad + "\nForma de pago: Tarjeta de cr�dito\nDescuento aplicado: $" + descuento + "\nTotal: $" + totalConDescuento + "\n�Muchas gracias por su compra, que tenga un buen d�a!", "PRINTAFACIL, S.A de C.V.", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case '3':
				precioConIva = precio + (precio * iva);
				total = precioConIva * cantidad;
				descuento = total * 0.15;
				totalConDescuento = total - descuento;
				JOptionPane.showMessageDialog(null, "Impresoras a comprar: " + cantidad + "\nSubtotal (con IVA): $" + precioConIva * cantidad + "\nForma de pago: Vale de regalo\nDescuento aplicado: $" + descuento + "\nTotal: $" + totalConDescuento + "\n�Muchas gracias por su compra, que tenga un buen d�a!", "PRINTAFACIL, S.A de C.V.", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			default:
				JOptionPane.showInputDialog(null, "Por favor, elija un m�todo de pago correcto.", "PRINTAFACIL, S.A de C.V.", JOptionPane.ERROR_MESSAGE);
				break;
			}
		 
	}
}