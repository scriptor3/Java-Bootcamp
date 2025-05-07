package dia9.ejercicio1;

public abstract class ejercicio1 {
    //Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces

    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int date;
    private double coste;

    public ejercicio1() {
    }

    public ejercicio1(int id, String placa, String marca, String modelo, int date, double coste) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.date = date;
        this.coste = coste;
    }

    public abstract int calcularAntiguedad();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Vehículo {" +
                "id =" + id +
                ", placa ='" + placa + '\'' +
                ", marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", date =" + date +
                ", coste =" + coste +
                '}';
    }
}
