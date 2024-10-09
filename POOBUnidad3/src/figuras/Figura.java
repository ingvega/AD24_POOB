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
public class Figura {
    private Color color;
    private Punto puntoReferencia;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Punto getPuntoReferencia() {
        return puntoReferencia;
    }

    public void setPuntoReferencia(Punto puntoReferencia) {
        this.puntoReferencia = puntoReferencia;
    }
    
//    public double calcularArea(){
//    
//    }
    public void desplazar(int ajusteX, int ajusteY){
        int x=puntoReferencia.getX();
        int y=puntoReferencia.getY();
        puntoReferencia.setX(x+ajusteX);
        puntoReferencia.setY(y+ajusteY);
    }
    
    public double calcularArea(){
        return 0;
    }

    @Override
    public String toString() {
        return " en la posicion " + puntoReferencia;
    }
    
    
}
