/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tarea2;

/**
 *
 * @author socom_000
 */
public class TestImagen {

   
    public static void main(String[] args) {
        Imagen foto=new Imagen();
        
        foto.setAlto(-50);
        foto.setAncho(-10);
        
        
       System.out.println(foto.getAlto());
       System.out.println(foto.getAncho());
    }
    
}
