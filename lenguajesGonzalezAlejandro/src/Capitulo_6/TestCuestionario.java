/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo_6;

/**
 *
 * @author T107
 */
public class TestCuestionario {

   
    public static void main(String[] args) {
     for(Pregunta pregunta: Generar_Cuestionario.obtenerCuestionario()){
         System.out.println(pregunta.getTitulo());
         for(Opcion opcion: pregunta.getOpciones()){
             System.out.println(pregunta.getTitulo()+ "valor" +opcion.isValor());
         }
     }   
    }
    
}
