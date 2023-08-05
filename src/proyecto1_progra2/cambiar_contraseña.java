/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;

import javax.swing.JOptionPane;
import proyecto1_progra2.clases_o.*;


public class cambiar_contraseña extends javax.swing.JFrame {
  private String username;

    public cambiar_contraseña(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_perfil = new javax.swing.JButton();
        btn_cambiar = new javax.swing.JButton();
        contra_actual = new javax.swing.JPasswordField();
        contra_nueva = new javax.swing.JPasswordField();
        f_cambiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_perfil.setBackground(new java.awt.Color(229, 139, 6));
        btn_perfil.setFont(new java.awt.Font("Doctor Soos Light", 0, 30)); // NOI18N
        btn_perfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_perfil.setText("MI PERFIL");
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_perfilMouseClicked(evt);
            }
        });

        btn_cambiar.setBackground(new java.awt.Color(229, 139, 6));
        btn_cambiar.setFont(new java.awt.Font("Doctor Soos Light", 0, 30)); // NOI18N
        btn_cambiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiar.setText("CAMBIAR");
        btn_cambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cambiarMouseClicked(evt);
            }
        });

        contra_actual.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N

        contra_nueva.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N

        f_cambiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_cambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_cambiar_contra.png"))); // NOI18N
        f_cambiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(btn_perfil)
                .addGap(117, 117, 117)
                .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contra_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(contra_nueva))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_cambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(contra_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(contra_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cambiar)
                    .addComponent(btn_perfil))
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_cambiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseClicked
        perfil volver=new perfil(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_perfilMouseClicked

    private void btn_cambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiarMouseClicked
        String contraA = contra_actual.getText();
        String contraN = contra_nueva.getText();
        boolean cambiar = Player.getInstancia().cambiarContraseña(username, contraA, contraN);

        if (cambiar) {
            JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.", "Cambiar contraseña", JOptionPane.INFORMATION_MESSAGE);
            menu_inicio volver = new menu_inicio();
            volver.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error al cambiar la contraseña.", "Cambiar contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cambiarMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JPasswordField contra_actual;
    private javax.swing.JPasswordField contra_nueva;
    private javax.swing.JLabel f_cambiar;
    // End of variables declaration//GEN-END:variables
}
