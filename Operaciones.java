/*
Yahir Alejandro Saavedra Gallardo
Número de control: 21490577
Ingeniería en Sistemas Computacionales

Problema a resolver:
Hacer una aplicación que permita ingresar 2 números y mostrar
sus operaciones básicas (suma, resta, multiplicación y división).
*/

import java.util.Scanner;

public class Operaciones {
    public static void main(String args[]) {
        int num1, num2, suma, resta, multi, div;
         
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2 = entrada.nextInt();
        entrada.close();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Estos son tus numeros aplicados en operaciones basicas:");
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " x " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
}