/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur.especifico;

import itsur.especifico.Administrativo;
import itsur.especifico.Docente;
import itsur.especifico.Intendente;
import itsur.general.Persona;
import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public sealed class Empleado 
        extends Persona
        permits Administrativo, Docente, Intendente
{
    private int clave;
    private LocalDate fechaContratacion;
    private float sueldoXHora;

    public Empleado(){
        System.out.println("2");
    }
    
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public float getSueldoXHora() {
        return sueldoXHora;
    }

    public void setSueldoXHora(float sueldoXHora) {
        this.sueldoXHora = sueldoXHora;
    }
    
    
}
