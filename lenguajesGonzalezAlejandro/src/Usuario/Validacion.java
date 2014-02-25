/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Usuario;

/**
 *
 * @author socom_000
 */
public class Validacion {
    public static void validarEdad(int edad) throws EdadNoNegativaException {
     if (edad < 18 )throw new EdadNoNegativaException();
    }

}
