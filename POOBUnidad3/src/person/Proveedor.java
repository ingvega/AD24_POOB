/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Milan
 */
public class Proveedor extends Persona {
    private int organizacion = Organizacion.comites;

    public Proveedor(String nombre, String apellidos, String direccion,
            String telefono, String email, int organizacion) {
        super(nombre,apellidos,direccion,telefono,email);
//        setNombre(nombre);
//        setApellidos(apellidos);
//        setDireccion(direccion);
//        setTelefono(telefono);
//        setEmail(email);
        setOrganizacion(organizacion);
    }
    public int getOrganizacion() {
        return organizacion;
    }
    
    public void setOrganizacion(int organizacion) {
        
        if(organizacion>=1 && organizacion<=5){
          this.organizacion = organizacion;  
        }
        else{
            System.out.println("Solo existen 5 tipos de organizacion ");
            
        }
    }

    @Override
    public String toString() {
        return super.toString() + +
           "\nOrganizacion: " + organizacion;
    }

    @Override
    public boolean equals(Object o) {
        Proveedor otroProveedor = (Proveedor) o;
        if (this.organizacion == otroProveedor.getOrganizacion()) {
            return true;
        }
        return false;
    }
    
    
    
}

