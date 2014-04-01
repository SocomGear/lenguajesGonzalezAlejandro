/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo_6;

import java.util.*;

public class Pregunta {
    private int id;
    private String titulo;
    private ArrayList <Opcion>Opciones;

    public Pregunta(int id, String titulo, ArrayList<Opcion> Opciones) {
        this.id = id;
        this.titulo = titulo;
        this.Opciones = Opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList <Opcion> getOpciones() {
        return Opciones;
    }

    public void setOpciones(ArrayList <Opcion> Opciones) {
        this.Opciones = Opciones;
    }
}