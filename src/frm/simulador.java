/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.awt.event.KeyEvent;

/**
 *
 * @author mary-
 */
public class simulador extends javax.swing.JFrame {

    int x = 620;
    int y = 480;

    /**
     * Creates new form simulador
     */
    public simulador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelaba1 = new javax.swing.JLabel();
        jLabellogito1 = new javax.swing.JLabel();
        jLabellogito2 = new javax.swing.JLabel();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DREADGAME1.0");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelaba1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelaba1.setForeground(new java.awt.Color(255, 0, 51));
        jLabelaba1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/der1.png"))); // NOI18N
        getContentPane().add(jLabelaba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 60, -1));

        jLabellogito1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabellogito1.setForeground(new java.awt.Color(255, 51, 51));
        jLabellogito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGITO4.png"))); // NOI18N
        jLabellogito1.setText("X");
        jLabellogito1.setMaximumSize(new java.awt.Dimension(75, 115));
        jLabellogito1.setMinimumSize(new java.awt.Dimension(75, 115));
        jLabellogito1.setPreferredSize(new java.awt.Dimension(75, 115));
        getContentPane().add(jLabellogito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 60, 80));

        jLabellogito2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabellogito2.setForeground(new java.awt.Color(255, 51, 51));
        jLabellogito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGITO4.png"))); // NOI18N
        jLabellogito2.setText("C");
        getContentPane().add(jLabellogito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/croquis.jpg"))); // NOI18N
        jLabelfondo.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabelfondo.setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 769));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                x = x + 5;
                jLabelaba1.setLocation(x, y);
                break;

            case KeyEvent.VK_UP:
                y = y - 5;
                jLabelaba1.setLocation(x, y);
                break;

            case KeyEvent.VK_LEFT:
                x = x - 5;
                jLabelaba1.setLocation(x, y);
                break;

            case KeyEvent.VK_DOWN:
                y = y + 5;
                jLabelaba1.setLocation(x, y);
                break;

            case KeyEvent.VK_X:
                
                Ventana info =new Ventana();
                info.setVisible(true);
                this.dispose();
              
                break;
             case KeyEvent.VK_C:
                
               // informacion info2 =new informacion();
               // info2.setVisible(true);
                this.dispose();
           
                break;
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelaba1;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLabellogito1;
    private javax.swing.JLabel jLabellogito2;
    // End of variables declaration//GEN-END:variables
}