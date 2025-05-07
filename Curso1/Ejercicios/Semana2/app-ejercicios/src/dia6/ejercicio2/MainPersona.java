package dia6.ejercicio2;

public class MainPersona {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1, "Robert", 30, "Madrid", "649837461");
        personas[1] = new Persona(2, "Laura", 19, "Galicia", "659208954");
        personas[2] = new Persona(3, "Pablo", 41, "Salamanca", "631274051");
        personas[3] = new Persona(4, "Carletes", 25, "Segovia", "673649028");
        personas[4] = new Persona(5, "Joao", 21, "Palencia", "618349219");

        System.out.println("Nombres y edades:");
        for (Persona p : personas){
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());

        }

        System.out.println("Antes de cambiar:");
        personas[1].mostrarDatos(); //Robert
        personas[3].mostrarDatos(); //Pablo


        personas[1].setNombre("Manolo");
        personas[3].setNombre("Eufrasio");

        System.out.println("Después de cambiar:");
        personas[1].mostrarDatos();
        personas[3].mostrarDatos();

        //D (personas mayores de 30 años):

        System.out.println("Personas mayores de 30 años:");
        for (Persona p : personas){
            if (p.getEdad() > 30){
                p.mostrarDatos();
            }
        }
    }
}
