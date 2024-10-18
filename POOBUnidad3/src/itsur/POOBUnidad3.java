/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itsur;

import itsur.especifico.Alumno;
import itsur.general.Persona;


/**
 *
 * @author paveg
 */
public class POOBUnidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String telefono = "1234567890";
        System.out.println(telefono.matches("[0-9]{10}"));
        telefono = "1";
        telefono = "sdfghjk";
        System.out.println(telefono.matches("[0-9]{10}"));
        telefono = "   A           B C    D              ";
        System.out.println("-" + telefono.replaceAll(" +", " ") + "-");

        Alumno a = new Alumno();
        a.setNombre("Luis");
        a.setApellidos("Lopez");
        a.setNoControl("S23120001");
        Alumno a2 = new Alumno();
        a2.setNombre("Luis");
        a2.setApellidos("Lopez");
        a2.setNoControl("s23120001");
        //a.nombre="Luis";
        System.out.println(a);
        System.out.println(a.toString());
        int x = 5, y = 5;
//        if(x==y){
//        
//        }
        //x=y;
        //a=a2;
        if (a == a2) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
        //if (a.equals("Luis Lopez")) {
        if (a.equals(null)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
        Object o=a;
        Persona p=new Alumno();
        
        Persona p1=new Persona();
        System.out.println(a.getClass());
        System.out.println(o.getClass());
        System.out.println(p.getClass());
        System.out.println("Hola".getClass());
        
        System.out.println(a instanceof Alumno); //True
        System.out.println(a instanceof Persona); //True
        System.out.println(o instanceof Persona); //True
        System.out.println(p instanceof Alumno); //True
        System.out.println(p1 instanceof Alumno);
        
        
    }

}
