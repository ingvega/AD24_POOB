/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aejemplopaquetes.paquete1;

import java.util.Date;

/**
 *
 * @author paveg
 */
public class PruebaMismoPaquete {
    public static void main(String[] args) {
        Paciente obj=new Paciente();
        obj.fechaNac=new Date();
        System.out.println(obj.fechaNac);
    }
}
