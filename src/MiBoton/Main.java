package MiBoton;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnolaMain = new javax.swing.JButton();
        lblola = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnolaMain.setBackground(new java.awt.Color(66, 0, 99));
        btnolaMain.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnolaMain.setText("Click para saludar");
        btnolaMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnolaMainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnolaMainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnolaMainMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnolaMainMousePressed(evt);
            }
        });
        btnolaMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnolaMainActionPerformed(evt);
            }
        });

        lblola.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        lblola.setForeground(new java.awt.Color(102, 0, 102));
        lblola.setText("Saludo!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblola, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(btnolaMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(btnolaMain, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnolaMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnolaMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnolaMainActionPerformed

    private void btnolaMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolaMainMouseClicked
        System.out.println("Hola Java Swing");
        lblola.setText("Hola java Swing");
    }//GEN-LAST:event_btnolaMainMouseClicked

    private void btnolaMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolaMainMousePressed
        lblola.setText("");
    }//GEN-LAST:event_btnolaMainMousePressed

    private void btnolaMainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolaMainMouseEntered
        btnolaMain.setText("estas en el boton");
    }//GEN-LAST:event_btnolaMainMouseEntered

    private void btnolaMainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnolaMainMouseExited
        btnolaMain.setText("no estas en el boton");
    }//GEN-LAST:event_btnolaMainMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnolaMain;
    private javax.swing.JLabel lblola;
    // End of variables declaration//GEN-END:variables
}
