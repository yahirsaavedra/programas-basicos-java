/*
Yahir Alejandro Saavedra Gallardo
Número de control: 21490577
Ingeniería en Sistemas Computacionales

Problema a resolver:
Un colegio desea saber qué porcentaje de niños y qué porcentaje
de niñas hay en el curso actual. Diseñar una aplicación que
muestre la cantidad de alumnos en porcentaje.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Colegio {
    public static void main(String args[]) {
        int ninos, ninas, total;
        double porcentajeNinos, porcentajeNinas;
        DecimalFormat redondeo = new DecimalFormat("##.00");
        /*
        NOTA: DecimalFormat es una librería que no hemos explorado,
        pero básicamente solo es para que el número se muestre en
        dos decimales, el resultado se presente más claro y no salgan
        ahí demasiados números.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el numero de ninos: ");
        ninos = entrada.nextInt();
        System.out.print("Ingresa el numero de ninas: ");
        ninas = entrada.nextInt();
        entrada.close();

        total = ninos + ninas;
        porcentajeNinos = (ninos * 1.0 / total) * 100;
        porcentajeNinas = (ninas * 1.0 / total) * 100;

        System.out.println("Porcentaje de ninos: " + redondeo.format(porcentajeNinos) + "%");
        System.out.println("Porcentaje de ninas: " + redondeo.format(porcentajeNinas) + "%");
        System.out.println(total + " alumnos en total");
    }
}