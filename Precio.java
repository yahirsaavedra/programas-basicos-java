import java.util.Scanner;

public class Precio {
	public static void main(String args[]) {
		double precioUnitario, iva, precioVenta;
		int cantidad;
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Cuanto cuesta el producto? ");
		precioUnitario = teclado.nextDouble();

		System.out.print("Cuantas unidades compraste? ");
		cantidad = teclado.nextInt();

		System.out.print("Cual es el porcentaje de IVA? ");
		iva = teclado.nextDouble();
		
		precioVenta = (cantidad * precioUnitario) * (1 + iva / 100);
		
		System.out.println("El precio de venta del producto es de $" + precioVenta);
	}
}