package cl.praxis.automotora;

public class Taxi extends Vehiculo{
    private Integer valorPasaje;

    public Taxi(){
    }

    public Taxi(String color, String patente, Integer valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public Integer getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(Integer valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int pasaje){
        int vuelto = 0;
        if (pasaje >= getValorPasaje()){
            vuelto = getValorPasaje() - pasaje; 
        }
        return vuelto; 
    }
}


