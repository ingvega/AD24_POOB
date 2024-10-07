/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author paveg
 */
public class Triangulo extends Figura {

    private int base;
    private int altura;
    private int tipo = TipoTriangulo.ISOSCELES;

    public Triangulo(int base, int altura, int tipo) {
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
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
        if (cantidad > 0) {
            base += cantidad;
            altura += cantidad;
        } else {
            System.err.println("No se realizó incremento");
        }
    }

    public void disminuir(int cantidad) {
        if (cantidad > 0 && base - cantidad >= 1 && altura - cantidad >= 1) {
            base -= cantidad;
            altura -= cantidad;
        } else {
            System.err.println("No se realizó decremento");
        }
    }

    
    @Override
    public String toString() {
        String tipo="Equilátero";
        if(this.tipo==1){
            tipo="Rectángulo";
        }else if(this.tipo==2){
            tipo="Isósceles";
        }
        return "Triangulo con base=" + base + " altura=" +altura +
                " de tipo=" + tipo
                + super.toString();
//        return "Triangulo con base=" + base + " altura=" +altura +
//                " de tipo=" + (tipo==1?"Rectángulo":tipo==2?"Isósceles":"Equilátero")
//                + super.toString();
    }
}
