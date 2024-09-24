/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itsur;

/**
 *
 * @author paveg
 */
public class POOBUnidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String telefono="1234567890";
        System.out.println(telefono.matches("[0-9]{10}"));
        telefono="1";
        telefono="sdfghjk";
        System.out.println(telefono.matches("[0-9]{10}"));
    }
    
}
