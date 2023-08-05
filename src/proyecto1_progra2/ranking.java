/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class ranking extends javax.swing.JFrame {
    private String username;

    public ranking(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        texto_ranking = new javax.swing.JTextArea();
        btn_reportes = new javax.swing.JButton();
        f_ranking = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        texto_ranking.setEditable(false);
        texto_ranking.setColumns(20);
        texto_ranking.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        texto_ranking.setRows(5);
        texto_ranking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(texto_ranking);

        btn_reportes.setBackground(new java.awt.Color(229, 139, 6));
        btn_reportes.setFont(new java.awt.Font("Doctor Soos Light", 0, 30)); // NOI18N
        btn_reportes.setForeground(new java.awt.Color(255, 255, 255));
        btn_reportes.setText("REPORTES");
        btn_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reportesMouseClicked(evt);
            }
        });

        f_ranking.setBackground(new java.awt.Color(0, 0, 0));
        f_ranking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_ranking.png"))); // NOI18N
        f_ranking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_reportes)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseClicked
        reportes volver=new reportes(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reportesMouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel f_ranking;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto_ranking;
    // End of variables declaration//GEN-END:variables
}
