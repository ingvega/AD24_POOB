/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eAuto;

/**
 *
 * @author paveg
 */
public class Auto {

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    private boolean encendido;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void encender() {
        if (encendido == true) {
            System.out.println("El auto ya esta encendido");
        } else {
            encendido = true;
        }
    }

    public void apagar() {
        if (encendido == true) {
            velocidad = 0;
            encendido = false;
        } else {
            System.out.println("El auto ya esta apagado");
        }
    }

    public void acelerar(int velocidad) {
        if (encendido) {
            int velocidadProbable = this.velocidad + velocidad;
            if (velocidadProbable > velocidadMaxima) {
                this.velocidad = velocidadMaxima;
            } else {
                this.velocidad = velocidadProbable;
            }
        } else {
            System.out.println("No se puede acelerar cuando el auto está apagado");

        }

    }

    public void frenar() {
        if (encendido) {
            int velocidadFrenado;
            velocidadFrenado = velocidad / 5;
            for (int i = 4; i >= 0; i--) {
                velocidad = velocidad - velocidadFrenado;
                System.out.print(" " + velocidad);
            }
            if (velocidad > 0) {
                velocidad = 0;
            }
        } else {
            System.out.println("No se puede frenar cuando el auto está apagado");
        }

    }

    public void acelerar() {
        if (encendido) {
            int velocidadIncremento;
            velocidadIncremento = (velocidadMaxima - velocidad) / 5;
            for (int i = 5; i > 0; i--) {
                velocidad += velocidadIncremento;
                System.out.println("La velocidad" + velocidad);
            }
            //TODO: Revisar como si la velocidad llegó a la velocidad máxima
        }
    }
}
