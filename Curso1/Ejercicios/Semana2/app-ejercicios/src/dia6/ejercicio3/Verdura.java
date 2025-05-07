package dia6.ejercicio3;

public class Verdura {


    //Atributo
    private int id;
    private String nombre;
    private String color;
    private int calorias;
    private boolean debeCocinarse;

    //Constructor

    public Verdura(int id, String nombre, String color, int calorias, boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
    }

    //Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean isDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    //Mostrar datos

    @Override
    public String toString() {
        return "Verdura {" +
                "ID: " + id +
                "Nombre: " + nombre + '\'' +
                "Color: " + color + '\'' +
                "Calorias: " + calorias +
                "¿Se debe cocinar? " + debeCocinarse +
                '}';
    }
}
