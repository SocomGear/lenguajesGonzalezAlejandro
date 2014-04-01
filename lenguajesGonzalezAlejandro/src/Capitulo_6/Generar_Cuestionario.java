
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
                
                Opcion op12=new Opcion("Brazilia",false);
                Opcion op22=new Opcion("DF",false);
                Opcion op32=new Opcion("Taskent",true);
                Opcion op42=new Opcion("Berlín",true);
                
                ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
                
                opciones1.add(op11);
                opciones1.add(op21);
                opciones1.add(op31);
                opciones1.add(op41);
                
                ArrayList<Opcion> opciones2=new ArrayList<Opcion>();
                
                opciones2.add(op12);
                opciones2.add(op22);
                opciones2.add(op32);
                opciones2.add(op42);
                
                
                Pregunta p1=new Pregunta(1,"1.-Cual es el pais con el mejor sistema educativo?",opciones1);
                Pregunta p2=new Pregunta(2,"2.-Cual es la capital de Uzbekistan?",opciones2);
                
                ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
                cuestionario.add(p1);
                cuestionario.add(p2);
                
                
                return cuestionario; 
                       
                        
    }
    
}
