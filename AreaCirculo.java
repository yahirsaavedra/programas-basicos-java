import java.util.Scanner;

public class AreaCirculo {
	public static void main(String args[]) {
		double r, area;
		Scanner s = new Scanner(System.in);
		System.out.print("Dame el valor del radio: ");
		r=s.nextDouble();
		area=3.1416*(r*r);
		System.out.println("Area del circulo: " + area);
	}
}