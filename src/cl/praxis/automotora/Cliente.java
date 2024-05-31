package cl.praxis.automotora;

public class Cliente extends Persona{

    private Integer edad;

    public Cliente() {
    }

    public Cliente(Integer rut, String nombre, Integer edad) {
        super(rut, nombre, edad);
    }

    @Override
    public Integer getEdad() {
        return edad;
    }

    @Override
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
