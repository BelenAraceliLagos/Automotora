package cl.praxis.automotora;

public abstract class Bus extends Vehiculo{

    private Integer cantidadDeAsientos;

    public Bus() {
    }

    public Bus(String color, String patente, Integer cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public Integer getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(Integer cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int asientosDisponibles(int cantidadDeAsientos){
        System.out.println("hay " + cantidadDeAsientos + "asientos disponibles");
        return cantidadDeAsientos;
    }

}
