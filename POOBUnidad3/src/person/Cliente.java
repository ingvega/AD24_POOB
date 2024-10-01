/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Milan
 */
public class Cliente extends Persona {
    private int tipoCliente = TipoDeCliente.comun;
    private int organizacion = Organizacion.comites;

    public Cliente(){
        //super(null,null,null,null,null);
        //super();
        System.out.println("Constructor de cliente");
    }
    
    public int getTipoCliente() {
        return tipoCliente;
    }

    public int getOrganizacion() {
        return organizacion;
    }

    public void setTipoCliente(int tipoCliente) {
        
        if(tipoCliente>=1 && tipoCliente<=3){
            this.tipoCliente = tipoCliente;
        }
        else
        {
            System.out.println("Solo existen 3 tipos de clientes  ");
            this.tipoCliente=1;
        }
  
    }

    public void setOrganizacion(int organizacion) {
        
        if(organizacion>=1 && organizacion<=5){
          this.organizacion = organizacion;  
        }
        else
        {
            System.out.println("Solo existen 3 tiposd de comites ");
            
        }
    }
    
    
    public double calcularDescuento(){
        if(tipoCliente==1)
        {
            return 13/100;
        }
        else if(tipoCliente==2){
            return 9/100;
        }
        else
        {
            return 0;
        }
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + 
               "\nEl tipo de cliente: " + tipoCliente +
               "\nOrganizacion: " + getOrganizacion() ;
    }
    
    @Override
    public boolean equals(Object o){
        Cliente otroCliente=(Cliente)o;
        if(this.getNombre().equalsIgnoreCase(otroCliente.getNombre()) && 
            this.getOrganizacion()==otroCliente.getOrganizacion()){
            return true;
        }
        return false;
    }
    
    
}