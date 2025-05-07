package piramides;

public class pirRep {

    public static void Piramide(int altura){

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
            }

            System.out.println();
        }
    }
}
