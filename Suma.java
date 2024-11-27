import java.util.Scanner;

public class Suma {
	public static void main(String arg[]) {
		int numero1, numero2, suma;
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame el valor del primer número: ");
		numero1 = teclado.nextInt();

		System.out.print("Dame el valor del segundo número: ");
		numero2 = teclado.nextInt();

		suma = numero1 + numero2;

		System.out.println("La suma de los dos numeros es: " + suma);
	}
}