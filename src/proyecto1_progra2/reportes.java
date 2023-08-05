/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_progra2;


public class reportes extends javax.swing.JFrame {
    private String username;
 
    public reportes(String username) {
        this.username=username;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ultimos = new javax.swing.JButton();
        btn_ranking = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        f_reportes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_ultimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_ultimos_juegos_R.png"))); // NOI18N
        btn_ultimos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ultimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ultimosMouseClicked(evt);
            }
        });

        btn_ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones/btn_ranking_R.png"))); // NOI18N
        btn_ranking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rankingMouseClicked(evt);
            }
        });

        btn_menu.setBackground(new java.awt.Color(229, 139, 6));
        btn_menu.setFont(new java.awt.Font("Doctor Soos Light", 0, 30)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("MENU PRINCIPAL");
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_menuMouseClicked(evt);
            }
        });

        f_reportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo/f_reportes.png"))); // NOI18N
        f_reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(btn_ultimos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btn_ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(btn_menu)))
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ranking)
                    .addComponent(btn_ultimos))
                .addGap(103, 103, 103)
                .addComponent(btn_menu)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ultimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ultimosMouseClicked
        ultimos_juegos ultimo=new ultimos_juegos(username);
        ultimo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ultimosMouseClicked

    private void btn_rankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rankingMouseClicked
        ranking rank=new ranking(username);
        rank.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_rankingMouseClicked

    private void btn_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseClicked
        menu_principal volver=new menu_principal(username);
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menuMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_ranking;
    private javax.swing.JButton btn_ultimos;
    private javax.swing.JLabel f_reportes;
    // End of variables declaration//GEN-END:variables
}
