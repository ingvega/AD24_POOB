/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.Cuarto;
/**
 *
 * @author paveg
 */
public class CuartoCuidadoIntensivo extends Cuarto {
    private String[] equipos;
    
    public void imprimirNumero(){
        System.out.println(numero);
    }
    
    public static void main(String[] args) {
        //numero=10;
        CuartoCuidadoIntensivo obj=
                new CuartoCuidadoIntensivo();
        obj.numero=20;
        //obj.capacidad=2;
        obj.imprimirNumero();
    }
}
