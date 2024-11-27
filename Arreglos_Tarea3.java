/*
YAHIR ALEJANDRO SAAVEDRA GALLARDO
INGENIERIA EN SISTEMAS COMPUTACIONALES
INSTITUTO TECNOLÓGICO DE MEXICALI
NÚMERO DE CONTROL: 21490577

Problema a resolver:
"Dada una matriz cuadrada de tamaño N, encuentre la suma
de todos los elementos que no son de la 'periferia' de
la matriz.

EJEMPLO:
+-----+---+---+---+---+---+
|     ¦ 1 | 2 | 3 | 4 | 5 |
+-----+===+===+===+===+===+
|  1  ¦ 3 | 5 | 8 | 9 | 2 |
+-----+---+---+---+---+---+
|  2  ¦ 1 | 4 | 2 | 1 | 0 |
+-----+---+---+---+---+---+
|  3  ¦ 4 | 5 | 4 | 8 | 1 |
+-----+---+---+---+---+---+
|  4  ¦ 9 | 8 | 1 | 0 | 3 |
+-----+---+---+---+---+---+
|  5  ¦ 7 | 2 | 1 | 1 | 3 |
+-----+---+---+---+---+---+
S = 4 + 2 + 1 + 5 + 4 + 8 + 8 + 1 + 0 = 33
"
*/

package programas;
import javax.swing.JOptionPane;

public class Arreglos_Tarea3 {
	public static void main(String[] args) {
		int filas = 0, columnas = 0, suma = 0;
		int[][] matriz, matrizSinPeriferia;
		String sumaStr = "";
		try {
			filas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas filas tendrá la matriz?",
					   "Arreglos, práctica 3 - Yahir Saavedra, 21490577",
					   JOptionPane.QUESTION_MESSAGE));
			if (filas >= 3) {
				columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas columnas tendrá la matriz?",
					   "Arreglos, práctica 3 - Yahir Saavedra, 21490577",
					   JOptionPane.QUESTION_MESSAGE));
				if (columnas == filas) {
					matriz = new int[filas][columnas];
					matrizSinPeriferia = new int[filas - 2][columnas - 2];
					for (int i = 0; i < filas; i++) {
						for (int j = 0; j < columnas; j++) {
							matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número entero " +
									   "para el valor de la MATRIZ[" + i + "][" + j + "]:",
									   "Arreglos, práctica 3 - Yahir Saavedra, 21490577",
									   JOptionPane.QUESTION_MESSAGE));
						}
					}
					System.out.println("VALORES INGRESADOS EN LA MATRIZ:\n");
					for (int i = 0; i < matriz.length; i++) {
						System.out.print("FILA " + i + ": ");
						for (int j = 0; j < matriz[i].length; j++) {
							if (j == matriz[i].length - 1) {
								System.out.print("[" + j + "] = " + matriz[i][j] + "\n");
							} else {
								System.out.print("[" + j + "] = " + matriz[i][j] + " // ");
							}
						}
					}
					System.out.println("\nVALORES INGRESADOS SIN CONTAR LOS BORDES DE LA MATRIZ (O PERIFERIA):\n");
					for (int i = 0; i < matriz.length; i++) {
						if (i == 0 || i == matriz.length - 1) {
							continue;
						} else {
							for (int j = 0; j < matriz[i].length; j++) {
								if (j == 0 || j == matriz.length - 1) {
									continue;
								} else {
									matrizSinPeriferia[i - 1][j - 1] = matriz[i][j];
								}
							}
						}
					}
					for (int i = 0; i < matrizSinPeriferia.length; i++) {
						System.out.print("FILA " + i + ": ");
						for (int j = 0; j < matrizSinPeriferia[i].length; j++) {
							if (j == matrizSinPeriferia[i].length - 1) {
								System.out.print("[" + j + "] = " + matrizSinPeriferia[i][j] + "\n");
							} else {
								System.out.print("[" + j + "] = " + matrizSinPeriferia[i][j] + " // ");
							}
							if (i == 0 && j == 0 && matrizSinPeriferia[i].length > 1 && matrizSinPeriferia[j].length > 1) {
								sumaStr = matrizSinPeriferia[i][j] + " + ";
							} else if (i == matrizSinPeriferia[i].length - 1) {
								sumaStr = sumaStr + matrizSinPeriferia[i][j] + " = ";
							} else {
								sumaStr = sumaStr + matrizSinPeriferia[i][j] + " + ";
							}
							suma = suma + matrizSinPeriferia[i][j];
						}
					}
					sumaStr = sumaStr + suma;
					System.out.print("\nSUMA DE CADA VALOR:\n" + sumaStr);
					JOptionPane.showMessageDialog(null, "Los valores ingresados han sido impresos en la consola.\n" +
							   "Tómalos como referencia para el resultado del ejercicio.\n\n" +
							   "El resultado de la suma de los elementos que no se encuentran\nen la periferia de la " +
							   "matriz es igual a " + suma + ".",
							   "Arreglos, práctica 3 - Yahir Saavedra, 21490577", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "La matriz debe tener la misma cantidad de filas y columnas,\n" +
							"porque el ejercicio requiere una matriz rectangular.\n\nIntenta de nuevo.",
						    "Arreglos, práctica 3 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "La matriz debe tener como mínimo tres filas. Intenta de nuevo.",
					    "Arreglos, práctica 3 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrió un error interno en el programa. Intenta de nuevo.",
				    "Arreglos, práctica 3 - Yahir Saavedra, 21490577", JOptionPane.ERROR_MESSAGE);
		}
	}
}