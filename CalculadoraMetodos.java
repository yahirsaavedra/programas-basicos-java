/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Realiza el programa de la mini calculadora que ya realizamos
anteriormente pero esta vez tu solución deberá utilizar métodos."
*/

package programas;

import javax.swing.JOptionPane;

public class CalculadoraMetodos {
	public static void main(String[] args) {
		double num1 = 0, num2 = 0, resultado = 0;
		char operacion;
		operacion = (JOptionPane.showInputDialog(null, "Este programa te ayudará a calcular el resultado de una operación básica entre dos números.\n\n¿Qué operación te gustaría realizar? Escribe el símbolo de tu elección:\n\n[+] Suma\n[-] Resta\n[*] Multiplicación\n[/] División\n[S] Salir",
			 	"Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE)).charAt(0);
		
		if (operacion != '+' && operacion != '-' && operacion != '*' && operacion != 'x' && operacion != 'X' && operacion != '/' && operacion != '^') {
			if (operacion == 'S' || operacion == 's') {
				// No hacer nada, ya que esta instruccion cerrará el programa a través del case-switch.
			} else {
				JOptionPane.showMessageDialog(null, "Opción inválida. Intenta de nuevo", "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			}
		} else {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu primer número: ",
						"Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
			if (String.valueOf(num1).isEmpty()) {
				JOptionPane.showMessageDialog(null, "No ingresaste el primer número. Intenta de nuevo", "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			} else {
				num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu segundo número: ",
						"Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.QUESTION_MESSAGE));
				if (String.valueOf(num2).isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ingresaste el segundo número. Intenta de nuevo", "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
				} else if (num2 == 0 && operacion == '/') {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre cero. Intenta de nuevo", "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
					System.exit(1);
				} else {
					switch (operacion) {
						case '+':
							resultado = suma(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " " + operacion + " " + num2 + " = " + resultado, "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
							break;
						case '-':
							resultado = resta(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " " + operacion + " " + num2 + " = " + resultado, "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
							break;
						case '*':
						case 'x':
						case 'X':
							resultado = multiplicacion(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " " + operacion + " " + num2 + " = " + resultado, "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
							break;
						case '/':
							resultado = division(num1, num2);
							JOptionPane.showMessageDialog(null, num1 + " " + operacion + " " + num2 + " = " + resultado, "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
							break;
						case 'S':
						case 's':
							System.exit(0);
						default:
							JOptionPane.showMessageDialog(null, "Opción inválida. Intenta de nuevo", "Minicalculadora - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
							break;
					}
				}
			}
		}
	}
	
	public static double suma(double a, double b) {
		return a + b;
	}
	
	public static double resta(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacion(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}
}
