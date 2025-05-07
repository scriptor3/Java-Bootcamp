package dia2;

import java.util.Scanner;

public class ejercicio1 {

    // Ejercicio Nº 1 - Sintaxis básica.
    //  a) Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
    //  b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenido al sistema”.

    public static void main(String[] args) {
        System.out.println("Hola, bienvenido al sistema.");

        //b)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + "! bienvenido al sistema.");
    }



}
