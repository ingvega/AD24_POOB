/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpruebadate;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Date fecha1=new Date();
        fecha1.setMonth(12);
        System.out.println(fecha1);
        if(fecha1.getMonth()==7){
            System.out.println("tienes descuento");
        }else{
            System.out.println("no tienes descuento");
        }
        
        LocalDate fecha2=LocalDate.now();
        
        if(fecha2.getMonthValue()==8){
            System.out.println("tienes descuento");
        }else{
            System.out.println("no hay descuento");
        }
        System.out.println(fecha2);
        
    }
}
