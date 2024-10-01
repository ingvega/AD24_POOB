/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

/**
 *
 * @author Milan
 */
public class Persona {
    //declaracion de variables 

    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    
    public Persona(){
        System.out.println("Constructor de persona");
    }
    
    public Persona(String nombre, String apellidos, String direccion,
            String telefono, String email) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        nombre = nombre.trim().replaceAll(" +", " ");
        if (nombre.length() > 1 && nombre.length() <= 40) {
            this.nombre = nombre;
        } else {
            System.out.println("Tu nombre de tener entre 1 y 40 caracteres");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        apellidos = apellidos.trim().replaceAll(" +", " ");
        if (apellidos.length() > 1 && apellidos.length() <= 40) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Tus apellidos deben tener 1 y 40 caracteres");
        }
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        direccion = direccion.trim().replaceAll(" +", " ");
        if (direccion.length() > 4 && direccion.length() <= 100 && direccion.contains(String.valueOf("#"))) {
            this.direccion = direccion;
        } else {
            System.out.println("la dirreccion no es valida ");
        }
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        telefono = telefono.replaceAll(" +", "").trim();
        if (telefono.length() == 10 && telefono.matches("[0-9]{10}")) {
            this.telefono = telefono;
        } else {
            System.err.println("Debe tener un minimo de 10 caracteres ");
        }
        
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        email = email.trim();
        if (email.contains(String.valueOf("@"))) {
            this.email = email;
        } else {
            System.err.println("Debes incluir un @ para ser valido ");
        }
        
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " " + getApellidos()
                + "\n Direccion: " + getDireccion()
                + "\n Telefono: " + getTelefono()
                + "\n Correo electronico: " + getEmail();
    }
    
}
