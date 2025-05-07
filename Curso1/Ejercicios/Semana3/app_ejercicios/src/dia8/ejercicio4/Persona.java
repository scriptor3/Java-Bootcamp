package dia8.ejercicio4;

public class Persona {
    private String nombre;
    private Direccion direccion;

    public class Direccion {

        private String calle;
        private String ciudad;

        //Constructor
        public Direccion(String calle, String ciudad) {
            this.calle = calle;
            this.ciudad = ciudad;

        }
    }

    public Persona(String nombre, String calle, String ciudad) {
        this.nombre = nombre;
        this.direccion = new Direccion(calle, ciudad);

    }
}