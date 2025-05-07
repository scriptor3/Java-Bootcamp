package dia6.ejercicio1;

public class Electrodomestico {
    //Atributos
    String cod;
    String marca;
    String modelo;
    String consumo;
    String color;

    //Con parametros.
    public Electrodomestico(String cod, String marca, String modelo, String consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    //Sin parametros.
    public Electrodomestico(){

    }
}

