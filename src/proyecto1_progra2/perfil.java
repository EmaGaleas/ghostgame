/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class perfil extends javax.swing.JFrame {
  private String username;

    public perfil(String username) {
        this.username=username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_datos = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_cambiar_contra = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        f_perfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_datos.setBackground(new java.awt.Color(229, 139, 6));
        btn_datos.setFont(new java.awt.Font("Doctor Soos Light", 0, 40)); // NOI18N
        btn_datos.setForeground(new java.awt.Color(255, 255, 255));
        btn_datos.setText("MIS DATOS");
        btn_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datosMouseClicked(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(229, 139, 6));
        btn_eliminar.setFont(new java.awt.Font("Doctor Soos Light", 0, 40)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR CUENTA");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        btn_cambiar_contra.setBackground(new java.awt.Color(229, 139, 6));
        btn_cambiar_contra.setFont(new java.awt.Font("Doctor Soos Light", 0, 40)); // NOI18N
        btn_cambiar_contra.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiar_contra.setText("CAMBIAR PASSWORD");
        btn_cambiar_contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cambiar_contraMouseClicked(evt);
            }
        });

        btn_menu.setBackground(new java.awt.Color(229, 139, 6));
        btn_menu.setFont(new java.awt.Font("Doctor Soos Light", 0, 40)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("MENU PRINCIPAL");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });

        f_perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_perfil.png"))); // NOI18N
        f_perfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cambiar_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addComponent(btn_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(465, 465, 465))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btn_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_cambiar_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datosMouseClicked
        datos data=new datos(username);
        data.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_datosMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        eliminar delete=new eliminar(username);
        delete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_cambiar_contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cambiar_contraMouseClicked
        cambiar_contraseña cambiar=new cambiar_contraseña(username);
        cambiar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cambiar_contraMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        menu_principal volver=new menu_principal(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menuMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cambiar_contra;
    private javax.swing.JButton btn_datos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel f_perfil;
    // End of variables declaration//GEN-END:variables
}
