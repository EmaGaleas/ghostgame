/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class menu_principal extends javax.swing.JFrame {
  private String username;

    public menu_principal(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_juego = new javax.swing.JButton();
        btn_confi = new javax.swing.JButton();
        btn_perfil = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        f_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        btn_juego.setBackground(new java.awt.Color(18, 29, 35));
        btn_juego.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        btn_juego.setForeground(new java.awt.Color(255, 255, 255));
        btn_juego.setText("JUGAR GHOSTS");

        btn_confi.setBackground(new java.awt.Color(18, 29, 35));
        btn_confi.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        btn_confi.setForeground(new java.awt.Color(255, 255, 255));
        btn_confi.setText("CONFIGURACIÓN");
        btn_confi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_confiMouseClicked(evt);
            }
        });

        btn_perfil.setBackground(new java.awt.Color(18, 29, 35));
        btn_perfil.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        btn_perfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_perfil.setText("MI PERFIL");
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_perfilMouseClicked(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(18, 29, 35));
        btn_reportes.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        btn_reportes.setForeground(new java.awt.Color(255, 255, 255));
        btn_reportes.setText("REPORTES");
        btn_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportesMouseClicked(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(18, 29, 35));
        btn_cerrar.setFont(new java.awt.Font("Doctor Soos Light", 0, 32)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cerrar.setText("CERRAR SESIÓN");
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(864, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_confi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_juego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btn_juego)
                .addGap(43, 43, 43)
                .addComponent(btn_confi)
                .addGap(43, 43, 43)
                .addComponent(btn_perfil)
                .addGap(43, 43, 43)
                .addComponent(btn_reportes)
                .addGap(43, 43, 43)
                .addComponent(btn_cerrar)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        f_menu.setBackground(new java.awt.Color(0, 0, 0));
        f_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_menu.png"))); // NOI18N
        f_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(f_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(f_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_confiMouseClicked
        configuracion confi=new configuracion(username);
        confi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_confiMouseClicked

    private void btn_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseClicked
        perfil per=new perfil(username);
        per.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_perfilMouseClicked

    private void btn_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseClicked
        reportes rep=new reportes(username);
        rep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reportesMouseClicked

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        cerrrar_sesion cerrar=new cerrrar_sesion(username);
        cerrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cerrarMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_confi;
    private javax.swing.JButton btn_juego;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel f_menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
