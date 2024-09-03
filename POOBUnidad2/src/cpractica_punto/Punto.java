/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpractica_punto;

/**
 *
 * @author paveg
 */
public class Punto {
    private int x;
    private int y;
    
    /**
     * Crea un punto en la coordenada 1,1
     */
    public Punto(){
        x=y=1;
//        x=1;
//        y=1;
    }
    /**
     * Crea un punto con valores aleatorios para x y y,
     * con valores entre 0 y límite
     * @param limite limite máximo (positivo) para x y y
     */
    public Punto(int limite){
        limite++;
        x=(int)(Math.random()*limite)+1;
        y=(int)(Math.random()*limite)+1;
    }
    
    /**
     * Genera un objeto con los valores que se reciben como
     * parametro
     * @param x
     * @param y 
     */
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        if(x>=0)
            this.x=x;
        else
            System.err.println("El valor de x no acepta negativos");
    }
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        if(y>=0)
            this.y=y;
        else
            System.err.println("El valor de y no acepta negativos");
    }
}
