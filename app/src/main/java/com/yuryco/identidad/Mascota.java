package com.yuryco.identidad;

public class Mascota {

    private String nombre;
    private int numRaiting;
    private boolean estadoRaiteado;
    private int foto;

    public Mascota(String nombre, int numRaiting, boolean estadoRaiteado, int foto) {
        this.nombre = nombre;
        this.numRaiting = numRaiting;
        this.estadoRaiteado = estadoRaiteado;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumRaiting() {
        return numRaiting;
    }

    public void setNumRaiting(int numRaiting) {
        this.numRaiting = numRaiting;
    }

    public boolean isEstadoRaiteado() {
        return estadoRaiteado;
    }

    public void setEstadoRaiteado(boolean estadoRaiteado) {
        this.estadoRaiteado = estadoRaiteado;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
