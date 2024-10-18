/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur.especifico;

import itsur.general.Persona;

/**
 *
 * @author paveg
 */
public final class Docente extends Empleado{
    private String carrera;
    private int horasClase;
    private char ubicacion;

    public String getNombrePropietario(){
        //Persona p=new Persona();
        //Docente p=new Docente();
        Empleado p=new Empleado();
        return p.apellidos;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public char getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(char ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String toString(){
        return getNombre() + " " + apellidos;
    }
    
}
