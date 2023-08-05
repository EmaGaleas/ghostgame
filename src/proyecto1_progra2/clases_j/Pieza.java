/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_progra2.clases_j;

import java.awt.Color;

public class Pieza {
    private String fantasma;
    private String imagePath;
    private String jugador;
    private int fila;
    private int columna;

    public Pieza(String fantasma, String jugador, String imagePath, int fila, int columna) {
        this.fantasma=fantasma;
        this.imagePath=imagePath;
        this.jugador=jugador;
        this.fila=fila;
        this.columna=columna;
    }

    public String getFantasma() {
        return fantasma;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getJugador() {
        return jugador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void limpia() {
        fantasma = null;
        imagePath = null;
        jugador = null;
        fila=-1;//no existe
        columna=-1;
    }

    void setBackground(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
