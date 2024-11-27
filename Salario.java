/*
Yahir Alejandro Saavedra Gallardo
Número de control: 21490577
Ingeniería en Sistemas Computacionales

Problema a resolver:
Dada las horas trabajadas de una persona y el valor por hora.
Calcular su salario e imprimirlo por pantalla.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {
    public static void main(String args[]) {
        int horas;
        double valorHora, salario;
        DecimalFormat redondeo = new DecimalFormat("##.00");
        /*
        NOTA: DecimalFormat es una librería que no hemos explorado,
        pero básicamente solo es para que el número se muestre en
        dos decimales, el resultado se presente más claro y no salgan
        ahí demasiados números.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el numero de horas que trabajaste: ");
        horas = entrada.nextInt();
        System.out.print("Ingresa la cantidad que te pagan por hora: ");
        valorHora = entrada.nextDouble();
        
        salario = valorHora * horas;

        System.out.println("Tu salario deberia ser de $" + redondeo.format(salario));
    }
}