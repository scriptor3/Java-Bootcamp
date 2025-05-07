package dia9.ejercicio1;

import dia9.ejercicio1.interfaces.Electrico;

public class auto extends ejercicio1 implements Electrico {

    private int capacidadBateria;
    private int Autonomia;

    @Override
    public int calcularAntiguedad(){
        return 0;
    }

    @Override
    public void cargaEnergia() {

    }
}
