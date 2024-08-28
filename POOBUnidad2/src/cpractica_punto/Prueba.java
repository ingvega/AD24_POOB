/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpractica_punto;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Punto p1=new Punto();
        //p1.x++;
        p1.setX(p1.getX()+1);
        int y=p1.getY();
        p1.setY(y+10);
        p1.setX(-2);
        p1.setY(3);
        System.out.println(p1.getX()+","+p1.getY());
    }
}
