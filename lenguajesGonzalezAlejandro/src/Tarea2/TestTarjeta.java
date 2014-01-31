

package Tarea2;

/**
 *
 * @author socom_000
 */
public class TestTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarjeta AB =new Tarjeta();
        
         AB.setNombreCliente(null);
         AB.setNumeroTarjeta(45784);
         // Si se coloca null aparece el nombre Juan y sI pone otro Nombre por ejemplo Alejandro 
         //se elimina Juan y aparece Alejandro
        
        
       System.out.println(AB.getNombreCliente());
       System.out.println(AB.getNumeroTarjeta());
    }
    
}
