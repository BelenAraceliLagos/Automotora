package cl.praxis.automotora;

public class Persona {

    private Integer rut;
    private String nombre;
    private Integer edad;

    public Persona(){
    }

    public Persona(Integer rut, String nombre, Integer edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}


