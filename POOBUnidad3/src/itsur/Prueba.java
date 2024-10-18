/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

import itsur.especifico.Administrativo;
import itsur.especifico.Alumno;
import itsur.general.Persona;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        
        Administrativo bibliotecario=new Administrativo();
        bibliotecario.setDepartamento("Centro de informacion");
        bibliotecario.setNombre("Angelica");
        bibliotecario.setClave(10);
        Persona p=new Persona();
        System.out.println(p.getEstadoCivil());
        Alumno a=(Alumno)p;
        p= bibliotecario;
        bibliotecario=(Administrativo)p;
        
    }
}
