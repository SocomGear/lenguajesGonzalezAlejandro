
package Ejercicio1;

/**
 *
 * @author socom_000
 */
public class Usuario {
    public String Nombre;
    private float edad;        

    

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        if(edad<18){
            System.out.println("No es mayor de edad");
        }

        
        this.edad = edad;
    }
}
