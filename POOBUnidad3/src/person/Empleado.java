/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Milan
 */
public sealed class Empleado 
        extends Persona 
        permits Administrativo, Intendente, Docente {
    
    private double sueldoHora;
    private int numHoras;
    private int turno=Turno.Matutino;

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        
        if(sueldoHora>=248.93){
            this.sueldoHora = sueldoHora;
        }else{
            System.err.println("El sueldo tiene que ser mayor o igual al sueldo minimo que es 248.93 pesos por dia ");
        }
        
        
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        
        if(numHoras<=8 && numHoras>=0){
            this.numHoras = numHoras;
        }else{
            System.err.println("Tu horas de trabajo deben ser mayores a 0 o iguales o menores a 8 ");
        }
          
    }
    

    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno){
        if(turno==1 && turno==2){
            
            this.turno=turno;
        }else{
            System.err.println("Solo puede ser 1: MAtutino o 2: Despertino");
        }
    }
    
    public double calcularSueldo(){
        return  (numHoras)*(sueldoHora)*2;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
               "\nSueldo por Hora: " + getSueldoHora() +
               "\nNumero de Horas: " + getNumHoras() +
               "\nTurno: " + getTurno();
    }
    
    @Override
    public boolean equals(Object o){
        Empleado otroEmpleado=(Empleado)o;
        
        if(this.getNombre().equalsIgnoreCase(otroEmpleado.getNombre()) 
                && this.getDireccion().equalsIgnoreCase(otroEmpleado.getDireccion())){
            return true;
        }
        return false;
        
        
    }
    
    
}

