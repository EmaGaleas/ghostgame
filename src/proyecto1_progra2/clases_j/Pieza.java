/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_progra2.clases_j;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Pieza extends JButton {
    private String fantasma;
    private String imagePath;
    private String jugador;
    private int fila;
    private int columna;
    
    public Pieza(String fantasma, String jugador, String imagePath, int fila, int columna) {
        this.fantasma = fantasma;
        this.imagePath = imagePath;
        this.jugador = jugador;
        this.fila = fila;
        this.columna = columna;
    }
    public String getFantasma() {
        return fantasma;
    }
    public void setFantasma(String fantasma) {
        this.fantasma = fantasma;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
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
        fila = -1; //no existe
        columna = -1;
    }
}
