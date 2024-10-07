/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.Color;

/**
 *
 * @author paveg
 */
public class Circulo extends Figura {

    private int radio = 1;

    public Circulo(int radio, Color color) {
        this(radio, new Punto(0, 0), color);
    }

    public Circulo(int radio, Punto centro, Color color) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("No se puede crear un circulo de radio "
                    + radio + " se creará un círculo de radio 1");
            //this.radio=1;
        }
        setColor(color);
        setPuntoReferencia(centro);
    }

    public int getRadio() {
        return radio;
    }

    public void aumentar(int cantidad) {
        if(cantidad>0){
            radio+=cantidad;
        }else{
            System.err.println("No se realizó incremento");
        }
    }

    public void disminuir(int cantidad) {
        if(cantidad>0 && radio - cantidad >= 1) {
            radio -= cantidad;
        }else{
            System.err.println("No se realizó decremento");
        }
    }

    @Override
    public String toString() {
        return "Circulo con radio=" + radio + super.toString();
    }

    
}
