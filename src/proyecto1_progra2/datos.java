/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class datos extends javax.swing.JFrame {
  private String username;

    public datos(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_perfil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_datos = new javax.swing.JTextArea();
        f_datos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        texto_datos.setEditable(false);
        texto_datos.setColumns(20);
        texto_datos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        texto_datos.setRows(5);
        texto_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(texto_datos);

        f_datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_mis_datos.png"))); // NOI18N
        f_datos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_perfil)
                .addGap(559, 559, 559))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_perfil)
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseClicked
        perfil volver=new perfil(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_perfilMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_perfil;
    private javax.swing.JLabel f_datos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto_datos;
    // End of variables declaration//GEN-END:variables
}
