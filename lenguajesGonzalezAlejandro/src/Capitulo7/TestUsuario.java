/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo7;

/**
 *
 * @author T107
 */
public class TestUsuario {
     

    
    public static void main(String[] args) throws Exception{
      Usuario u=new Usuario("Juan",19,"email@msn.com");
      Guardar_Usuario nu=new Guardar_Usuario();
              nu.guardar(u);
              
       
    }
    
}
