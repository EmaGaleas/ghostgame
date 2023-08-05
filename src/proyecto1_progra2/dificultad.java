/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class dificultad extends javax.swing.JFrame {
  private String username;


    public dificultad(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_normal = new javax.swing.JButton();
        btn_genius = new javax.swing.JButton();
        btn_expert = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        f_dificultad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_normal_D.png"))); // NOI18N
        btn_normal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_normalMouseClicked(evt);
            }
        });

        btn_genius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_genius_D.png"))); // NOI18N
        btn_genius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_geniusMouseClicked(evt);
            }
        });

        btn_expert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_expert_D.png"))); // NOI18N
        btn_expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_expertMouseClicked(evt);
            }
        });

        btn_configuracion.setBackground(new java.awt.Color(229, 139, 6));
        btn_configuracion.setFont(new java.awt.Font("Doctor Soos Bold", 0, 30)); // NOI18N
        btn_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        btn_configuracion.setText("CONFIGURACIÓN");
        btn_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_configuracionMouseClicked(evt);
            }
        });

        f_dificultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_dificultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_dificultad.png"))); // NOI18N
        f_dificultad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btn_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btn_expert, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_genius, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_dificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_genius, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_expert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_dificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_normalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_normalMouseClicked
        //codigo para guardar eleccion
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_normalMouseClicked

    private void btn_geniusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_geniusMouseClicked
        //codigo para guardar eleccion
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_geniusMouseClicked

    private void btn_expertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_expertMouseClicked
        //codigo para guardar eleccion
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_expertMouseClicked

    private void btn_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_configuracionMouseClicked
        configuracion volver=new configuracion(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_configuracionMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_expert;
    private javax.swing.JButton btn_genius;
    private javax.swing.JButton btn_normal;
    private javax.swing.JLabel f_dificultad;
    // End of variables declaration//GEN-END:variables
}
