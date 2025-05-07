package dia6.ejercicio3;

public class MainVerdura {

    public static void main(String[] args) {
        Verdura[] verduras = new Verdura[5];

        verduras[0] = new Verdura(1, "Tomate", "Rojo", 23, false);
        verduras[1] = new Verdura(2, "Ajo", "Blanco", 149, true);
        verduras[2] = new Verdura(3, "Jengibre", "Amarillo", 80, true);
        verduras[3] = new Verdura(4, "Col", "Verde", 25, false);
        verduras[4] = new Verdura(5, "Guisante", "Verde", 81, true);

        System.out.println("Nombre y calorías de cada verdura:");
        for (Verdura v : verduras){
            System.out.println("Nombre: " + v.getNombre());
            System.out.println("Calorías: " + v.getCalorias());


        }

        System.out.println("Cambiar datos de Ajo y Guisante");
        verduras[2].setId(6);
        verduras[2].setNombre("Espinaca");
        verduras[2].setColor("Verde");
        verduras[2].setCalorias(23);
        verduras[2].setDebeCocinarse(true);

        verduras[5].setId(7);
        verduras[5].setNombre("Remolacha");
        verduras[5].setColor("Morado");
        verduras[5].setCalorias(44);
        verduras[5].setDebeCocinarse(true);

        //Datos actualizados.
        System.out.println("Datos actualizados de las verduras: ");
        for (Verdura v : verduras){
            v.toString();
        }

        //Datos de verduras verdes.
        System.out.println("Verduras de color verde:");
        for (Verdura v : verduras){
            if (v.getColor().equalsIgnoreCase("Verde")){
                v.toString();
            }
        }
    }
}
