/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo7;

import java.io.*;

public class Guardar_Usuario {
    public static void guardar(Usuario u) throws Exception{
        File file=new File("archivaldo.xxx");
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
    }
        public  synchronized static Usuario leer() throws Exception{
            File file=new File("archivaldo.xxx");
            FileInputStream fis=new FileInputStream (file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Usuario u=(Usuario) ois.readObject();
            return u;
        }
        
    }

