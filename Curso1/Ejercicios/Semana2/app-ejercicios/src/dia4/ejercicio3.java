package dia4;

import java.util.Scanner;

public class ejercicio3 {


    // Ejercicio Nº 3 - Arreglos: Vectores.
    //  Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
    //  Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura máxima del día" + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            suma += temperaturas[i];


            double promedio = suma / temperaturas.length;
            System.out.println("La temperatura máxima aproximada de la semana ha sido: " + promedio + "ºC.");
        }
    }
}
