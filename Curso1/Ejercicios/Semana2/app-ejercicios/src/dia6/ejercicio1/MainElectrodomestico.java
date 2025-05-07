package dia6.ejercicio1;

public class MainElectrodomestico {

    public static void main(String[] args) {

        Electrodomestico num1 = new Electrodomestico("120", "Ibiza", "Pork2", "B++", "Azul");
        Electrodomestico num2 = new Electrodomestico("302", "Sony", "Vegas", "A", "Violeta");
        Electrodomestico num3 = new Electrodomestico("953", "Apple", "MacOS", "C-", "Blanco");

        Electrodomestico num4 = new Electrodomestico();


        System.out.println("Electrodoméstico número 1: " + num1.marca + ", " + num1.modelo + ", " + num1.consumo);
        System.out.println("Electrodoméstico número 2: " + num2.marca + ", " + num2.modelo + ", " + num2.consumo);
        System.out.println("Electrodoméstico número 3: " + num3.marca + ", " + num3.modelo + ", " + num3.consumo);

        System.out.println("Electrodoméstico sin parámetros, su marca: " + num4.marca);
    }
}
