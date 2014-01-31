
package Tarea3;

/**
 *
 * @author socom_000
 */
//Ejemplo 1:
public class Test {
int x;
String y;
}

public class Main{
    public static void main(String org[]){
        Test algo=new Test();
        System.out.println(algo.x);
    }
}
// Cual es la salida del codigo?
//Es cero poque el constructor es por defecto.

//Ejemplo 2:

public class Test {
    public Test(){}
}
// Si compila porque es el constructor por defecto

//Ejemplo 3:

public class Test {
    Test();
}
//No compila porque ya se esta usando el constructor por el punto y coma.

//Ejemplo 4:

public class Test {
    public void Test(){}
}

//Si compila porque el void lo hace metodo.

//Ejemplo 5:
public class Test {
    public Test(){
        int y=5;
    }
// Si compila proque esta inicializado la variable
    
//Ejemplo 6:
public class Test {
    public Test(){
        int y;
        System.out.println(y);
    }
    //No compila porque la variable no esta inicializada
    
    //Ejemplo 7:
    
   public class Test {
    int x;
   }
   
   public class Main{
       public static void main(String w[]){
           int x;
           Test S=new Text();
           System.out.println(x);
       }
   }
   
   //No compila porque la variable es local y no esta inicializada
       
   
