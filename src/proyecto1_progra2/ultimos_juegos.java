/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class ultimos_juegos extends javax.swing.JFrame {
    private String username;

    public ultimos_juegos(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_reportes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_ultimos_juegos = new javax.swing.JTextArea();
        f_ultimos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_reportes.setBackground(new java.awt.Color(229, 139, 6));
        btn_reportes.setFont(new java.awt.Font("Doctor Soos Light", 0, 30)); // NOI18N
        btn_reportes.setForeground(new java.awt.Color(255, 255, 255));
        btn_reportes.setText("REPORTES");
        btn_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportesMouseClicked(evt);
            }
        });

        texto_ultimos_juegos.setEditable(false);
        texto_ultimos_juegos.setColumns(20);
        texto_ultimos_juegos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_ultimos_juegos.setRows(5);
        texto_ultimos_juegos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(texto_ultimos_juegos);

        f_ultimos.setBackground(new java.awt.Color(0, 0, 0));
        f_ultimos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_ultimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_ultimos_juegos.png"))); // NOI18N
        f_ultimos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(557, 557, 557))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_ultimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_reportes)
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_ultimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseClicked
        reportes volver=new reportes(username);
        volver.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_btn_reportesMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel f_ultimos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto_ultimos_juegos;
    // End of variables declaration//GEN-END:variables
}
