/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_progra2.clases_j;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random; 

public class GhostGame {
    private Pieza[][] matrizBotones; //de JButton a Pieza por valores
    private JButton botonSeleccionado;
    int modo=1;
    int cantPiezas=2;
    private Pieza piezaMover=null;


    public void GridLayout(JPanel tablero) {
        int filas = 6;
        int col = 6;
        GridLayout gridLayout = new GridLayout(filas, col);
        tablero.setLayout(gridLayout);
        matrizBotones = new Pieza[filas][col];
        posicionarPiezas();//si no ni carga
            for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 100));
                // Verificar pieza
                Pieza pieza = matrizBotones[i][j];
                if (pieza != null && pieza.getFantasma().length() > 0 && pieza.getImagePath().length() > 0) {
                    ImageIcon icon = new ImageIcon(pieza.getImagePath());
                    button.setIcon(icon);
                }
                final int fila = i; // final o error en actionlistener
                final int columna = j;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mover(fila, columna, button);
                    }
                });
                tablero.add(button);
            // if(j==0 && (i==0 && i==5) || j==5 && (i==0 && i==5)){
               //    button.setEnabled(false);
               //}
                button.setBackground(new Color(0xFFFFFF));
            }
        }
    }

    private void mostrarInformacionPieza(Pieza pieza) {
        if (pieza!=null) {
            String info="Tipo "+pieza.getFantasma()+"\nJugador "+pieza.getJugador()+"\nF"+pieza.getFila()+"\nC"+pieza.getColumna();
            JOptionPane.showMessageDialog(null, info, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void mover(int fila, int columna, JButton button) {
        mostrarInformacionPieza(matrizBotones[fila][columna]);
        button.setBackground(Color.BLACK);
        if (piezaMover == null) {
            piezaMover = matrizBotones[fila][columna];
            button.setBackground(Color.YELLOW);
            button.setSelected(false);
        }else if(button.equals(piezaMover)){
                        button.setSelected(false);

        }else {
            if (matrizBotones[fila][columna] == null) {
                button.setIcon(null);
               int filaAnterior = piezaMover.getFila();
                int columnaAnterior = piezaMover.getColumna();
                matrizBotones[fila][columna] = piezaMover;
                matrizBotones[filaAnterior][columnaAnterior] = null;

                ImageIcon icon = new ImageIcon(piezaMover.getImagePath());
                button.setIcon(icon);
                piezaMover.setFila(fila);
                piezaMover.setColumna(columna);
                piezaMover=null;
                button.setBackground(Color.BLACK);
                button.setSelected(false);            
                if (matrizBotones[filaAnterior][columnaAnterior]!=null) {
                    matrizBotones[filaAnterior][columnaAnterior].setBackground(new Color(0xFFFFFF));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se puede mover, casilla ocupada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            piezaMover.setBackground(Color.RED);
            button.setSelected(false);

        }
    }

    
    private int posicionRandom(int min, int max) {
        Random random=new Random();
        return random.nextInt(max-min+1)+min;
    }
/*
    private boolean busquedaVacio(int row, int col) {
        return matrizBotones[row][col].getFantasma().length() > 0;
    }
    
    
    public int modo(double modo){
       switch (modo){
            case 1:
                cantPiezas=2;
                break;
            case 3:
                cantPiezas=6;
                break;
            case 4:
                cantPiezas=8;
                break;
            default:
                cantPiezas=8;
        }
    }
    
    */
    public void posicionarPiezas() {
//        int filas = matrizBotones.length;
//        int col = matrizBotones[0].length;
        ArrayList<String> piezasJugadorUno = new ArrayList<>();
        ArrayList<String> piezasJugadorDos = new ArrayList<>();
        for (int p = 0; p < modo; p++) {//cuantos en array, <2 es 4, <3 es 6 <4 es 8
            piezasJugadorUno.add("BUENOS");
            piezasJugadorUno.add("MALOS");
            piezasJugadorDos.add("BUENOS");
            piezasJugadorDos.add("MALOS");
        }
        //castillos FIJO
        matrizBotones[0][0] = new Pieza("CASTILLO", "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 0);
        matrizBotones[0][5] = new Pieza("CASTILLO", "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 5);
        matrizBotones[5][0] = new Pieza("CASTILLO", "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 0);
        matrizBotones[5][5] = new Pieza("CASTILLO", "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 5);
         //jugador 1 f 4 y 5
        int contJugador1 = 0;
        while (contJugador1<cantPiezas){//p<3, entonces es 6, p<2 entonces es 4, p<4 entonces 8
            int randomRow=posicionRandom(4, 5);
            int randomCol=posicionRandom(0, 5);
            if (matrizBotones[randomRow][randomCol] == null) {
                int randomIndex = posicionRandom(0, piezasJugadorUno.size() - 1);
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorUno.get(randomIndex), "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasmaJ1.png", randomRow, randomCol);
                piezasJugadorUno.remove(randomIndex);
                contJugador1++;
            }
        }
        //jugador 2 f 0 y 1
       int contJugador2 = 0;
            while (contJugador2<cantPiezas){
            int randomRow = posicionRandom(0, 1);
            int randomCol = posicionRandom(0, 5);
            if (matrizBotones[randomRow][randomCol] == null) {
                int randomIndex = posicionRandom(0, piezasJugadorDos.size() - 1);
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorDos.get(randomIndex), "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasma.png", randomRow, randomCol);
                piezasJugadorDos.remove(randomIndex);
                contJugador2++;
            }
        }
    }
}/*
public void posicionarPiezas() {
        int filas = matrizBotones.length;
        int col = matrizBotones[0].length;

        ArrayList<String> piezasJugadorUno = new ArrayList<>();
        ArrayList<String> piezasJugadorDos = new ArrayList<>();
        for (int p = 0; p < 1; p++) {//AQUI ASIGNA CUANTOS EN EL ARRAY, EJ CON 1 SON 2 PIEZAS C/JUGADOR, 2 SON 4 Y 4 SON 8
            piezasJugadorUno.add("BUENOS");
            piezasJugadorUno.add("MALOS");
            piezasJugadorDos.add("BUENOS");
            piezasJugadorDos.add("MALOS");
        }

        // Posicionar los castillos FIJO
        matrizBotones[0][0] = new Pieza("CASTILLO", "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 0);
        matrizBotones[0][5] = new Pieza("CASTILLO", "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 5);
        matrizBotones[5][0] = new Pieza("CASTILLO", "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 0);
        matrizBotones[5][5] = new Pieza("CASTILLO", "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 5);

         //jugador 1 f 4 y 5
        int countJugador1 = 0;
        while (countJugador1 < 2) {
            int randomRow = posicionRandom(4, 5);
            int randomCol = posicionRandom(1, col - 2);
            if (matrizBotones[randomRow][randomCol] == null) {
                int randomIndex = posicionRandom(0, piezasJugadorUno.size() - 1);
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorUno.get(randomIndex), "JUGADOR1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasma.png", randomRow, randomCol);
                piezasJugadorUno.remove(randomIndex);
                countJugador1++;
            }
        }

        //jugador 2 f 0 y 1
         int countJugador2 = 0;
        while (countJugador1 < 2) {
            int randomRow = posicionRandom(0, 1);
            int randomCol = posicionRandom(1, col - 2);
            if (matrizBotones[randomRow][randomCol] == null) {
                int randomIndex = posicionRandom(0, piezasJugadorUno.size() - 1);
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorDos.get(randomIndex), "JUGADOR2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasma.png", randomRow, randomCol);
                piezasJugadorDos.remove(randomIndex);
                countJugador2++;
            }
        }
    /*
/*
    public void GridLayout(JPanel tablero) {
        int filas = 6;
        int col = 6;
        GridLayout gridLayout = new GridLayout(filas, col);
        tablero.setLayout(gridLayout);

        matrizBotones = new JButton[filas][col];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 100));
                matrizBotones[i][j] = button;
                tablero.add(button);

                if (j == 0 && i != 0 && i != filas - 1 || j== col- 1 && i != 0 && i != filas - 1) {
                    button.setEnabled(false);
                } else if ((i == 0 && j == 0) || (i == 0 && j == col- 1) || (i == filas - 1 && j == 0) || (i == filas - 1 && j == col- 1)) {
                    String imagePath = "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg";
                    ImageIcon icon = new ImageIcon(imagePath);
                    button.setIcon(icon);
                } else {
                    String imagePath = "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasma.png";
                    ImageIcon icon = new ImageIcon(imagePath);
                    button.setIcon(icon);
                }
                button.setBackground(new Color(0xFFFFFF));
            }
        }
    }
*/


