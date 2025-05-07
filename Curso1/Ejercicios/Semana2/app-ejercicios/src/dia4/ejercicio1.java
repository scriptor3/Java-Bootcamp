package dia4;

import java.util.Scanner;

public class ejercicio1 {

    //Ejercicio Nº 1 - Estructuras Condicionales
    //Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();


        if (edad >= 18)
            System.out.println("Puede ingresar.");
        else
            System.out.println("No puede ingresar. Debe tener 18 años o más.");
    }
}
