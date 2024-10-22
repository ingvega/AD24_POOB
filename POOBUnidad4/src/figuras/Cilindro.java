/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author paveg
 */
public class Cilindro extends Circulo implements Figuras3D {
    private int altura;
    public Cilindro(int radio, int altura) {
        super(radio);
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        if(altura<=0){ 
            System.err.println("No puedes ingresar un valor menor o igual a cero.");
            return;}
        this.altura = altura;
    }

    @Override
    public double getVolumen() {
        return altura * super.getArea();
    }
    
    @Override
    public double getArea() {
        return 
        super.getArea()*2+
        super.getPerimetro()*altura;
    }
    
    @Override
    public double getPerimetro() {
        return super.getPerimetro()*2+
                altura*2;
    }
}
