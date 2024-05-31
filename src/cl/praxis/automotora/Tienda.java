package cl.praxis.automotora;

public class Tienda {

    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private Integer stock;

    public Tienda(){
    }

    public Tienda(Vendedor vendedor, Vehiculo vehiculo, Integer stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void existeStock() {
        System.out.println("Existen " + stock + "vehiculos en stock");
    }
}
