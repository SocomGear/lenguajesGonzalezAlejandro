
package Tarea2;

/**
 *
 * @author socom_000
 */
public class Tarjeta {
    private int numeroTarjeta;
    private String nombreCliente;

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        if(nombreCliente==null)nombreCliente="Juan";
        this.nombreCliente = nombreCliente;
    }

}
