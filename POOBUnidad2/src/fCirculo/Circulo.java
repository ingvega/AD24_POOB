/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fCirculo;

import java.awt.Color;

/**
 *
 * @author paveg
 */
public class Circulo {
    private int radio=1;
    public Punto centro;
    private Color color;

    public Circulo(int radio, Color color) {
        
        this(radio,new Punto(0,0),color);
    }

    public Circulo(int radio, Punto centro, Color color) {
        if(radio>0)
            this.radio = radio;
        else{
            System.out.println("No se puede crear un circulo de radio "
                    + radio+  " se creará un círculo de radio 1");
            //this.radio=1;
        }
        this.color=color;
        this.centro = centro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public String datosCirculo(){
        return "Circulo con posicion: ( "
                + centro.getX() + " , "
                + centro.getY() + " ). Radio: " + radio;
    }
    
    public String toString(){
        return "Circulo con posicion: ( "
                + centro.getX() + " , "
                + centro.getY() + " ). Radio: " + radio;
    }
}
