/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

import itsur.especifico.Alumno;
import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class PruebaLista {
    public static void main(String[] args) {
        Alumno[] alumnos=new Alumno[10];
        ArrayList<Alumno> lista=new ArrayList<>();
        Alumno a=new Alumno();
        a.setNoControl("S1");
        a.setNombre("Juan");
        a.setApellidos("Perez");
        a.setCarrera("Sistemas Computacionales");
        //alumnos[0]=a;
        lista.add(a);
        a=new Alumno();
        a.setNoControl("S23");
        a.setNombre("Ana");
        a.setApellidos("Lopez");
        a.setCarrera("Sistemas Computacionales");
        lista.add(a);
        a=new Alumno();
        a.setNoControl("S67");
        a.setNombre("Josue");
        a.setApellidos("Saavedra");
        a.setCarrera("Sistemas Computacionales");
        lista.add(a);
        Alumno a1=new Alumno();
        a1.setNoControl("S10");
        
        System.out.println(lista.contains(a1));
        a1.setNoControl("s67");
        System.out.println(lista.contains(a1));
    }
}
