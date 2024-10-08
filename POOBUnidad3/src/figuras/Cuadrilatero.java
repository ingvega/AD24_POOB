/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author paveg
 */
public class Cuadrilatero extends Figura {
    private int base;
    private int altura;

    public Cuadrilatero(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void aumentar(int cantidad) {
        if(cantidad>0){
            base+=cantidad;
            altura+=cantidad;
        }else{
            System.err.println("No se realizó incremento");
        }
    }

    public void disminuir(int cantidad) {
        if(cantidad>0 && base - cantidad >= 1 && altura - cantidad>=1) {
            base -= cantidad;
            altura -= cantidad;
        }else{
            System.err.println("No se realizó decremento");
        }
    }
    
     @Override
    public String toString() {
        return "Cuadrilatero con base=" + base + " altura=" +altura 
                + super.toString();
    }
    
}
