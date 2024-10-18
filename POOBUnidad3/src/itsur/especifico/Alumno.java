/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur.especifico;

import itsur.general.Persona;
import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public final class Alumno extends Persona {
    private String noControl;
    private String carrera;
    private short creditosAcumulados;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private String estatus;

    public String getNombreCompleto(){
        return apellidos + " " + getNombre();
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public short getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(short creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    //Sobrecarga
//    public String toString(String separador){
//    
//    }
    
    //Sobreescritura (reemplazar el comportamiento heredado)
    //Misma firma (puede cambiar el modificador de acceso)
    @Override
    public String toString(){
        return "NoControl: " + noControl + 
                "\nNombre: " + getNombre() + " " + getApellidos() +
                "\nCarrera: " + carrera;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        
        //Es un alumno o algun derivado de alumno
        //if(!(o instanceof Alumno)) return false;
        //Revisa que el tipo de dato de o sea el mismo tipo
        //que de this (Alumno)
        if(!this.getClass().equals(o.getClass())) return false;
        Alumno otroAlumno=(Alumno)o;
        return this.noControl.equalsIgnoreCase(otroAlumno.getNoControl());
//        if(this.noControl.equalsIgnoreCase(otroAlumno.getNoControl())){
//            return true;
//        }else{
//            return false;
//        }
    }
}
