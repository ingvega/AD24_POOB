/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bcreacioninstancias;

/**
 *
 * @author paveg
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c;
        c=new Cliente();
        //c.empresa="Google";
        c.setEmpresa("          ");
        System.out.println(c.getEmpresa());
        c.setEmpresa("     a     ");
        System.out.println(c.getEmpresa());
        //System.out.println(c);
    }
    
}
