package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class DesactivarBomba {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecret = random.nextInt(10) + 1;
        int intentos = 5;
        boolean bombaNoBoom = false;

        System.out.println("¡Hay una bomba! Tienes 5 intentos para desactivarla adivinando el número (del 1 al 10).");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingresa un número entre 1 y 10: ");
            int intentoUsuario = scanner.nextInt();

            if (intentoUsuario == numeroSecret) {
                System.out.println(" Has desactivado la bomba.");
                bombaNoBoom = true;
                break;
            } else {
                System.out.println("Número incorrecto.");
            }
        }

        if (!bombaNoBoom) {
            System.out.println("Explotó la bomba. El número era: " + numeroSecret);
        }

    }
}
