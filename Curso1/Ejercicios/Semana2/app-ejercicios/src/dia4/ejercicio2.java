package dia4;

import java.util.Scanner;

public class ejercicio2 {

    // Ejercicio Nº 2 - Estructuras Repetitivas
    //  Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
    //  Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, total = 0;

        while (true){
            System.out.println("Ingrese el precio de su producto, para terminar su total, inserte 0: ");
            precio = scanner.nextDouble();

            if (precio <= 0){
                break;

            }
            total += precio;
        }

        System.out.println("El total de su compra es: " + total + " €.");
    }
}
