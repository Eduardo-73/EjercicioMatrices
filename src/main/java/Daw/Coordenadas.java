/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daw;

/**
 *
 * @author eduar
 */
public class Coordenadas {

    private int columna;
    private int fila;

    public Coordenadas(int columna, int fila) {
        this.columna = columna;
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.columna;
        hash = 83 * hash + this.fila;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordenadas other = (Coordenadas) obj;
        if (this.columna != other.columna) {
            return false;
        }
        return this.fila == other.fila;
    }

    @Override
    public String toString() {
        return "Coordenadas{" + "columna=" + columna + ", fila=" + fila + '}';
    }
    
}
