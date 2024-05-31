package cl.praxis.automotora;

public class Vendedor extends Persona{

    private String direccion;


    public Vendedor(String direccion) {
    }

    public Vendedor(Integer rut, String nombre, Integer edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
