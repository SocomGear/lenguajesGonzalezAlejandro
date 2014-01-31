

package Tarea2;

/**
 *
 * @author socom_000
 */
public class Imagen {
    private int alto;
    private int ancho;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if(alto<0)alto=-alto;
            System.out.println(alto);
        
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho<0)ancho=-ancho;
        System.out.println(ancho);
        this.ancho = ancho;
    }
}
