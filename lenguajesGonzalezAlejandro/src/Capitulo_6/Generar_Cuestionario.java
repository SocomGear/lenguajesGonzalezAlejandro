/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo_6;

import java.util.*;

/**
 *
 * @author T107
 */
public class Generar_Cuestionario {
    public static ArrayList<Pregunta> obtenerCuestionario(){
        
                Opcion op11=new Opcion("El Salvador",false);
                Opcion op21=new Opcion("Perú",false);
                Opcion op31=new Opcion("México",false);
                Opcion op41=new Opcion("Finlandia",true);
                
                ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
                
                opciones1.add(op11);
                opciones1.add(op21);
                opciones1.add(op31);
                opciones1.add(op41);
                
                Pregunta p1=new Pregunta(1,"1.-Cual es el pais con el mejor sistema educativo?",opciones1);
                
                ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
                cuestionario.add(p1);
                
                
                return cuestionario; 
                       
                        
    }
    
}
