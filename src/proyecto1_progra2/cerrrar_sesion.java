/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class cerrrar_sesion extends javax.swing.JFrame {
  private String username;

    public cerrrar_sesion(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_si = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();
        f_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_si.setBackground(new java.awt.Color(229, 139, 6));
        btn_si.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        btn_si.setForeground(new java.awt.Color(255, 255, 255));
        btn_si.setText("SI");
        btn_si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_siMouseClicked(evt);
            }
        });

        btn_no.setBackground(new java.awt.Color(229, 139, 6));
        btn_no.setFont(new java.awt.Font("Doctor Soos Bold", 0, 50)); // NOI18N
        btn_no.setForeground(new java.awt.Color(255, 255, 255));
        btn_no.setText("NO");
        btn_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_noMouseClicked(evt);
            }
        });

        f_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_cerrar_sesion.png"))); // NOI18N
        f_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(btn_si, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(btn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(f_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 1286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_si, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_no, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(f_cerrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siMouseClicked
        menu_inicio inicio=new menu_inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_siMouseClicked

    private void btn_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_noMouseClicked
        menu_principal volver=new menu_principal(username);
        volver.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_btn_noMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_si;
    private javax.swing.JLabel f_cerrar;
    // End of variables declaration//GEN-END:variables
}
