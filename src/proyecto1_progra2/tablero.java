/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;

import javax.swing.JOptionPane;
import proyecto1_progra2.clases_j.*;


public class tablero extends javax.swing.JFrame {
    
private GhostGame ghostGame;
    public tablero() {
        initComponents();
         ghostGame = new GhostGame(); 
        ghostGame.GridLayout(tablero);
        filaDestino.setEnabled(false);
        columnaDestino.setEnabled(false);
        setDestino.setEnabled(false);
        //ghostGame.instrucciones();
        //ghostGame.posicionarPiezas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fantasmasBJ1 = new javax.swing.JLabel();
        fantasmasMJ1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fantasmasBJ2 = new javax.swing.JLabel();
        fantasmasMJ2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        retiro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filaSeleccion = new javax.swing.JTextField();
        columnaSeleccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        getMover = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        filaDestino = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        columnaDestino = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        setDestino = new javax.swing.JButton();
        f2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablero = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        f1.setBackground(new java.awt.Color(18, 29, 62));

        jLabel2.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fanstasmas disponibles de J1:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fanstasmas disponibles de J2:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 201, 224));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buenos:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 201, 224));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Malos:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fantasmasBJ1.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        fantasmasBJ1.setForeground(new java.awt.Color(230, 201, 224));
        fantasmasBJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantasmasBJ1.setText("4");
        fantasmasBJ1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fantasmasMJ1.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        fantasmasMJ1.setForeground(new java.awt.Color(230, 201, 224));
        fantasmasMJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantasmasMJ1.setText("4");
        fantasmasMJ1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 201, 224));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buenos:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 201, 224));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Malos:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fantasmasBJ2.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        fantasmasBJ2.setForeground(new java.awt.Color(230, 201, 224));
        fantasmasBJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantasmasBJ2.setText("4");
        fantasmasBJ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fantasmasMJ2.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        fantasmasMJ2.setForeground(new java.awt.Color(230, 201, 224));
        fantasmasMJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantasmasMJ2.setText("4");
        fantasmasMJ2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TURNO DE:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        turno.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        turno.setForeground(new java.awt.Color(230, 201, 224));
        turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turno.setText("...");
        turno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        retiro.setBackground(new java.awt.Color(102, 0, 102));
        retiro.setFont(new java.awt.Font("Doctor Soos Light", 0, 20)); // NOI18N
        retiro.setForeground(new java.awt.Color(255, 255, 255));
        retiro.setText("RETIRARSE");
        retiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ingrese cordenadas de pieza a mover:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ingrese cordenadas de lugar a mover:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Doctor Soos Light", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(230, 201, 224));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fila:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Doctor Soos Light", 0, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(230, 201, 224));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Columna:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        filaSeleccion.setBackground(new java.awt.Color(204, 204, 204));
        filaSeleccion.setFont(new java.awt.Font("Doctor Soos Bold", 0, 24)); // NOI18N
        filaSeleccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        columnaSeleccion.setBackground(new java.awt.Color(204, 204, 204));
        columnaSeleccion.setFont(new java.awt.Font("Doctor Soos Bold", 0, 24)); // NOI18N
        columnaSeleccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        getMover.setBackground(new java.awt.Color(216, 55, 39));
        getMover.setFont(new java.awt.Font("Doctor Soos Light", 0, 18)); // NOI18N
        getMover.setForeground(new java.awt.Color(255, 255, 255));
        getMover.setText("GET");
        getMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getMoverMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Doctor Soos Light", 0, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(230, 201, 224));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Fila:");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        filaDestino.setBackground(new java.awt.Color(204, 204, 204));
        filaDestino.setFont(new java.awt.Font("Doctor Soos Bold", 0, 24)); // NOI18N
        filaDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setFont(new java.awt.Font("Doctor Soos Light", 0, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(230, 201, 224));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Columna:");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        columnaDestino.setBackground(new java.awt.Color(204, 204, 204));
        columnaDestino.setFont(new java.awt.Font("Doctor Soos Bold", 0, 24)); // NOI18N
        columnaDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDestino.setBackground(new java.awt.Color(216, 55, 39));
        setDestino.setFont(new java.awt.Font("Doctor Soos Light", 0, 18)); // NOI18N
        setDestino.setForeground(new java.awt.Color(255, 255, 255));
        setDestino.setText("SET");
        setDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setDestinoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout f1Layout = new javax.swing.GroupLayout(f1);
        f1.setLayout(f1Layout);
        f1Layout.setHorizontalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(f1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(fantasmasBJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fantasmasMJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(f1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(f1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(fantasmasBJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fantasmasMJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(turno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(f1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(columnaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getMover, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(columnaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addGroup(f1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(retiro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        f1Layout.setVerticalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fantasmasBJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantasmasMJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fantasmasBJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantasmasMJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(filaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(columnaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(retiro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        f2.setBackground(new java.awt.Color(18, 29, 62));

        jLabel1.setBackground(new java.awt.Color(230, 235, 255));
        jLabel1.setFont(new java.awt.Font("Doctor Soos Light", 0, 54)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GHOSTS GAME");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablero.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("1");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("2");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("3");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("4");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel22.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("5");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout f2Layout = new javax.swing.GroupLayout(f2);
        f2.setLayout(f2Layout);
        f2Layout.setHorizontalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f2Layout.createSequentialGroup()
                .addGroup(f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(f2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(f2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        f2Layout.setVerticalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(18, 29, 62));

        info.setBackground(new java.awt.Color(204, 204, 204));
        info.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N
        info.setText("?");
        info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("1");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("2");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel26.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("3");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("4");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel28.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("5");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel30.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Fila");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Doctor Soos Light", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Columna");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(37, 37, 37)
                .addComponent(jLabel23)
                .addGap(70, 70, 70)
                .addComponent(jLabel24)
                .addGap(73, 73, 73)
                .addComponent(jLabel25)
                .addGap(67, 67, 67)
                .addComponent(jLabel26)
                .addGap(58, 58, 58)
                .addComponent(jLabel27)
                .addGap(63, 63, 63)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        GhostGame info = new GhostGame();
        info.instrucciones();
    }//GEN-LAST:event_infoMouseClicked

    private void getMoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMoverMouseClicked

        
        String fSeleccion= filaSeleccion.getText().trim();
      String cSeleccion= columnaSeleccion.getText().trim();
      if (fSeleccion.isEmpty()||cSeleccion.isEmpty()){
          JOptionPane.showMessageDialog(null, "Llene las casillas", "Error", JOptionPane.WARNING_MESSAGE);
      }else{
          try{
              int filaSele=Integer.parseInt(fSeleccion);
              int cSele=Integer.parseInt(cSeleccion);
              if((filaSele<0 || filaSele>=6) || (cSele<0 || cSele>=6)){
                 JOptionPane.showMessageDialog(null, "Ingrese cordenadas dentro del rango 0-5", "Error en SELECCION", JOptionPane.WARNING_MESSAGE);
              }else{
                filaDestino.setEnabled(true);
                columnaDestino.setEnabled(true);
                setDestino.setEnabled(true);
              }

          }catch(Exception e){
             JOptionPane.showMessageDialog(null, "INGRESE NUMEROS", "Error en SELECCION", JOptionPane.ERROR_MESSAGE);
          }
      }
    }//GEN-LAST:event_getMoverMouseClicked

    private void setDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setDestinoMouseClicked
      String fDestino= filaDestino.getText().trim();
      String cDestino= columnaDestino.getText().trim();
      if (fDestino.isEmpty()||cDestino.isEmpty()){
          JOptionPane.showMessageDialog(null, "Llene las casillas", "Error", JOptionPane.WARNING_MESSAGE);
      }else{
          try{
              int filaDestiny=Integer.parseInt(fDestino);
              int cDestiny=Integer.parseInt(cDestino);
              if((filaDestiny<0 || filaDestiny>=6) || (cDestiny<0 || cDestiny>=6)){
                 JOptionPane.showMessageDialog(null, "Ingrese cordenadas dentro del rango 0-5", "Error en DESTINO", JOptionPane.WARNING_MESSAGE);
              }else{
                filaDestino.setEnabled(false);
                columnaDestino.setEnabled(false);
                setDestino.setEnabled(false);
              }

          }catch(Exception e){
             JOptionPane.showMessageDialog(null, "INGRESE NUMEROS", "Error en DESTINO", JOptionPane.ERROR_MESSAGE);
          }
      }
    }//GEN-LAST:event_setDestinoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnaDestino;
    private javax.swing.JTextField columnaSeleccion;
    private javax.swing.JPanel f1;
    private javax.swing.JPanel f2;
    private javax.swing.JLabel fantasmasBJ1;
    private javax.swing.JLabel fantasmasBJ2;
    private javax.swing.JLabel fantasmasMJ1;
    private javax.swing.JLabel fantasmasMJ2;
    private javax.swing.JTextField filaDestino;
    private javax.swing.JTextField filaSeleccion;
    private javax.swing.JButton getMover;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retiro;
    private javax.swing.JButton setDestino;
    private javax.swing.JPanel tablero;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}
