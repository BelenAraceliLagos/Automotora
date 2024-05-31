package cl.praxis.automotora;

public class MiniBus extends Bus{
    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String color, String patente, Integer cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus(){
        System.out.println(super.getColor());
        System.out.println(super.getPatente());
        System.out.println(tipoViaje);
        System.out.println(getCantidadDeAsientos());
    }




}


