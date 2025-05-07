package dia4;
import java.util.Scanner;
public class ejercicio4 {

    // Ejercicio Nº 4 - Matrices.
    //  Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
    //   Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
    //   Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
    //   Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
    //   A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
    //   El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] asientos = new String[5][5];


        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                        asientos[i][j] = "O";
                    }
                }

                boolean continuar = true;

                while (continuar) {

                    System.out.println("\nMapa de Asientos (O = vacío, X = ocupado):");
                    for (int i = 0; i < asientos.length; i++) {
                        for (int j = 0; j < asientos[i].length; j++) {
                            System.out.print(asientos[i][j] + " ");
                        }
                        System.out.println();
                    }


                    System.out.print("\nIngrese número de fila (1 a 5): ");
                    int fila = scanner.nextInt() - 1;

                    System.out.print("Ingrese número de asiento (1 a 5): ");
                    int asiento = scanner.nextInt() - 1;


                    if (fila >= 0 && fila < 5 && asiento >= 0 && asiento < 5) {
                        if (asientos[fila][asiento].equals("O")) {
                            asientos[fila][asiento] = "X";
                            System.out.println("Asiento reservado con éxito.");
                        } else {
                            System.out.println("Ese asiento ya está ocupado. Elija otro, por favor.");
                        }
                    } else {
                        System.out.println("Fila o asiento fuera de rango. Intentelo de nuevo.");
                    }


                    System.out.print("\n¿Desea hacer otra reserva? (s/n): ");
                    String respuesta = scanner.next();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        continuar = false;
                        System.out.println("¡Gracias! Sistema de reservas finalizado.");
            }
        }
    }
}
