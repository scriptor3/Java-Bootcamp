package dia2;

import java.util.Scanner;

public class ejercicio4 {

    // Ejercicio Nº 4 - Operaciones de Lectura.
    //  Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese su primer número ENTERO:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese su segundo número ENTERO:");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        System.out.println("OPERACIONES:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0){
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        }
        else {
            System.out.println("División: Imposible dividir por 0.");
        }



    }
}
