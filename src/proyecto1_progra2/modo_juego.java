/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package proyecto1_progra2;


public class modo_juego extends javax.swing.JFrame {
    private String username;

    public modo_juego(String username) {
        this.username=username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_configuracion = new javax.swing.JButton();
        btn_aleatorio = new javax.swing.JButton();
        btn_manual = new javax.swing.JButton();
        f_modo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_configuracion.setBackground(new java.awt.Color(229, 139, 6));
        btn_configuracion.setFont(new java.awt.Font("Doctor Soos Bold", 0, 30)); // NOI18N
        btn_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        btn_configuracion.setText("CONFIGURACIÓN");
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseClicked(evt);
            }
        });

        btn_aleatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_aleatorio_C.png"))); // NOI18N
        btn_aleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aleatorioMouseClicked(evt);
            }
        });

        btn_manual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_manual_C.png"))); // NOI18N
        btn_manual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_manualMouseClicked(evt);
            }
        });

        f_modo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_modo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_modo.png"))); // NOI18N
        f_modo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(btn_aleatorio)
                        .addGap(145, 145, 145)
                        .addComponent(btn_manual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(btn_configuracion)))
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(f_modo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manual)
                    .addComponent(btn_aleatorio))
                .addGap(98, 98, 98)
                .addComponent(btn_configuracion)
                .addGap(53, 53, 53))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_modo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseClicked
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_configuracionMouseClicked

    private void btn_aleatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aleatorioMouseClicked
        //codigo para guardar eleccion
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_aleatorioMouseClicked

    private void btn_manualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manualMouseClicked
        //codigo para guardar eleccion
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_manualMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aleatorio;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_manual;
    private javax.swing.JLabel f_modo;
    // End of variables declaration//GEN-END:variables

}
