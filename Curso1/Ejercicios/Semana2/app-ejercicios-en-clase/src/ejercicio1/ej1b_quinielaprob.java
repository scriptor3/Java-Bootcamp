package ejercicio1;

import java.util.Random;

public class ej1b_quinielaprob {

    public static void quinielaResultadosProbabilidad(int cantidad){
        Random random = new Random();
        for (int i = 01; i <= cantidad; i++) {
          int numero = random.nextInt(100);
          String resultado;

          if (numero < 60)
              resultado = "1";
          else if (numero < 90)
              resultado = "X";
          else
              resultado = "2";
            System.out.println("El resultado es " + i + ": " + resultado);
        }
    }
}
