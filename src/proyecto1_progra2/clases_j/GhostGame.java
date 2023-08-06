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
    private int turno=1;


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
                        piezaMover = matrizBotones[fila][columna]; // Establecer la pieza a mover
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
    private boolean noEsCastillo(int filaDestino, int columnaDestino) {
        if (piezaMover != null) {
            String destino = matrizBotones[filaDestino][columnaDestino].getFantasma();
            if ("CASTILLO".equals(destino) && !"BUENOS".equals(destino) && !"MALOS".equals(destino)) {
                return false;
            }
        }
        return true; 
    }


    private boolean esMovimientoValido(int filaDestino, int columnaDestino) {
        if (piezaMover != null) {
            if ("J1".equals(piezaMover.getJugador()) && noEsCastillo(filaDestino, columnaDestino)) {
                return true;
            } else if ("J2".equals(piezaMover.getJugador()) && noEsCastillo(filaDestino, columnaDestino)) {
                return true;
            }
        }
        return false;
    }
    private boolean esMovimientoValidoJugador1(int nuevaFila, int nuevaColumna, int filaActual, int columnaActual) {
        if (esMovimientoValido(nuevaFila,nuevaColumna)&& noEsCastillo(nuevaFila,nuevaColumna)) {
            if ((nuevaFila == filaActual + 1 || nuevaFila == filaActual - 1) && (nuevaColumna == columnaActual+1||nuevaColumna == columnaActual-1)) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }
    private boolean esMovimientoValidoJugador2(int nuevaFila, int nuevaColumna, int filaActual, int columnaActual) {
        if (esMovimientoValido(nuevaFila,nuevaColumna) && noEsCastillo(nuevaFila,nuevaColumna)) {
            if ((nuevaFila == filaActual + 1 || nuevaFila == filaActual - 1) && (nuevaColumna == columnaActual+1||nuevaColumna == columnaActual-1)) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }

    private void mover(int fila, int columna, JButton button) {
    if (turno == 1) {
        if (piezaMover != null && "J1".equals(piezaMover.getJugador())) {
            if (esMovimientoValidoJugador1(fila, columna, piezaMover.getFila(), piezaMover.getColumna())) {
                button.setBackground(Color.BLACK);
                turno = 2;
            } else {
                JOptionPane.showMessageDialog(null, "Movimiento inválido para el jugador 1", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "TURNO DE JUGADOR 1\nUsa piezas con cinta ROJA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else if (turno == 2) {
            if (piezaMover != null && "J2".equals(piezaMover.getJugador())) {
                if (esMovimientoValido(fila, columna)) {
                    button.setBackground(Color.BLACK);
                    turno = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Movimiento inválido para el jugador 2", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "TURNO DE JUGADOR 2\nUsa piezas con cinta NEGRA", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        button.setBackground(Color.WHITE);
    }

/*
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
*/
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
    private int posicionRandom(int min, int max) {
        Random random=new Random();
        return random.nextInt(max-min+1)+min;
    }
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
        matrizBotones[0][0] = new Pieza("CASTILLO", "J2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 0);
        matrizBotones[0][5] = new Pieza("CASTILLO", "J2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 0, 5);
        matrizBotones[5][0] = new Pieza("CASTILLO", "J1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 0);
        matrizBotones[5][5] = new Pieza("CASTILLO", "J1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\castillo.jpg", 5, 5);
         //jugador 1 f 4 y 5
        int contJugador1 = 0;
        while (contJugador1<cantPiezas){//p<3, entonces es 6, p<2 entonces es 4, p<4 entonces 8
            int randomRow=posicionRandom(4, 5);
            int randomCol=posicionRandom(0, 5);
            if (matrizBotones[randomRow][randomCol] == null) {
                int randomIndex = posicionRandom(0, piezasJugadorUno.size() - 1);
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorUno.get(randomIndex), "J1", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasmaJ1.png", randomRow, randomCol);
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
                matrizBotones[randomRow][randomCol] = new Pieza(piezasJugadorDos.get(randomIndex), "J2", "C:\\Users\\pcast\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\proyecto1_progra2\\src\\imagenes\\juego\\fantasma.png", randomRow, randomCol);
                piezasJugadorDos.remove(randomIndex);
                contJugador2++;
            }
        }
    }
} 