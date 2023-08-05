/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;
import javax.swing.JOptionPane;
import proyecto1_progra2.clases_o.*;


public class eliminar extends javax.swing.JFrame {
    private String username;

    public eliminar(String username) {
        this.username = username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contra_eliminar = new javax.swing.JPasswordField();
        btn_eliminar = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        f_eliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contra_eliminar.setFont(new java.awt.Font("Doctor Soos Light", 0, 36)); // NOI18N

        btn_eliminar.setBackground(new java.awt.Color(229, 139, 6));
        btn_eliminar.setFont(new java.awt.Font("Doctor Soos Bold", 0, 30)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_perfil.setBackground(new java.awt.Color(229, 139, 6));
        btn_perfil.setFont(new java.awt.Font("Doctor Soos Bold", 0, 30)); // NOI18N
        btn_perfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_perfil.setText("MI PERFIL");
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_perfilMouseClicked(evt);
            }
        });

        f_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_eliminar_cuenta.png"))); // NOI18N
        f_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(btn_perfil)
                        .addGap(139, 139, 139)
                        .addComponent(btn_eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(contra_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(contra_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btn_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        String contra=contra_eliminar.getText();
        boolean eliminar=Player.getInstancia().eliminar(username, contra);
        if (eliminar){
            JOptionPane.showMessageDialog(this, "Cuenta eliminada", "Eliminar cuenta", JOptionPane.INFORMATION_MESSAGE);
            menu_inicio volver=new menu_inicio();
            volver.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error: Contraseña incorrecta", "Eliminar cuenta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseClicked
        perfil volver=new perfil(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_perfilMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JPasswordField contra_eliminar;
    private javax.swing.JLabel f_eliminar;
    // End of variables declaration//GEN-END:variables
}
