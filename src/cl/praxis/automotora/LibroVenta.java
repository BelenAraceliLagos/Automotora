package cl.praxis.automotora;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibroVenta {

    public static String nombreVenta;
    public static String fechaVenta;

    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la venta: ");
        Scanner nv = new Scanner(System.in);
        nombreVenta = nv.nextLine();

        System.out.println("Ingrese la fecha de venta en formato '30122024': ");
        Scanner fv = new Scanner(System.in);
        fechaVenta = fv.nextLine();

        guardarVenta(new Cliente(18987, "pepita", 18), new Vehiculo("rosado", "999XD"));

    }


    public static void guardarVenta(Cliente cliente, Vehiculo vehiculo){

            File ficheros = new File("src/ficheros");

            if (!ficheros.exists()) {
                ficheros.mkdirs();
            }

            File archivo = new File(ficheros.getAbsoluteFile() + "/" + nombreVenta+ ".txt");
            try {
                if (!archivo.exists()) {
                    archivo.createNewFile();
                }
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Patente: "+ vehiculo.getPatente() + "\n");
                bw.write(" Edad: " + cliente.getEdad() + "\n");
                bw.write(" Fecha de venta " + getFechaVenta() + "\n");
                bw.write(" Nombre venta "+ getNombreVenta());

                bw.close();
                fw.close();

            } catch (IOException e) {
                System.out.println("Error al escribir el archivo");
                e.printStackTrace();
            }
    }



    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public static String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public static String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }




}
