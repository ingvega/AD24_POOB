/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

import java.time.LocalDate;

/**
 *
 * @author paveg
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String curp;
    private int estadoCivil = EstadoCivil.SOLTERO;
    private String direccion;
    private int edad;
    private LocalDate fechaNacimiento;
    private char sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        telefono = telefono.trim();
        if (telefono.matches("[0-9]{10}")) {
            this.telefono = telefono;
        } else {
            System.out.println("El telefono solo puede tener digitos");
        }
/*
        if (telefono.length() == 10) {
            boolean correcto = true;
            for (int i = 0; i < telefono.length(); i++) {
                char c = telefono.charAt(i);
                if (!(c >= 48 && c <= 57)) {
                    correcto = false;
                    break;
                }
//                if(!(c=='0' || c=='1' ||...)){
//                correcto=false;
//                    break;
//                }
//                if(!(Character.isDigit(c))){
//                    correcto=false;
//                    break;
//                }
            }
            if (correcto) {
                this.telefono = telefono;
            } else {
                System.out.println("El telefono solo puede tener digitos");
            }
        } else {
            System.out.println("El telefono debe tener 10 digitos");
        }
*/
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        curp = curp.trim().toUpperCase();
        if (curp.matches("[A-Z]{4}[0-9]{6}[MH][A-Z]{5}[A-Z0-9]{2}")) {
            this.curp = curp;
        } else {
            System.out.println("La CURP debe tener un formato valido");
        }
        //Obtener y asignar la fecha de nacimiento
        //Obtener la edad
        //Obtener el sexo
        this.curp = curp;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

}
