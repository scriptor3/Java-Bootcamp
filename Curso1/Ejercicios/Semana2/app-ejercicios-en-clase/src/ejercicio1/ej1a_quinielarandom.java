package ejercicio1;
import java.util.Random;

public class ej1a_quinielarandom {

    public static void quinielaResultadosRandom(int cantidad){
        Random random = new Random();
        for (int i = 1; i <= cantidad; i++) {
            int resultado = random.nextInt(3);
            String simbolo = (resultado == 0) ? "1" : (resultado == 1) ? "X" : "2";
            System.out.println("RESULTADO " + i + ": " + simbolo);
        }
    }
}
