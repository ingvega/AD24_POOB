package aejemplopaquetes.paquete1;


import java.util.Date;
import aejemplopaquetes.paquete2.subpaquete.Padecimiento;
import aejemplopaquetes.paquete3.subpaquete.PacienteCuarto;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Paciente {
    private String nombre;
    Date fechaNac;
    
    private Padecimiento[] padecimientos;
    private PacienteCuarto pacienteCuartos[];
    
    public int calcularEdad(){
        return 0;
    }
}



