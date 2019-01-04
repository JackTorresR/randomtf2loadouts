
package view;


import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Creditos extends javax.swing.JFrame {
    public Creditos() {
        initComponents();
        setTitle("Credits");
        setSize(675, 580);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbBack = new javax.swing.JButton();
        Credits = new javax.swing.JLabel();
        makeby = new javax.swing.JLabel();
        beargm = new javax.swing.JLabel();
        jbSteam = new javax.swing.JButton();
        ValveCorporation = new javax.swing.JLabel();
        soundtrack = new javax.swing.JLabel();
        UsedSoftware = new javax.swing.JLabel();
        Java8 = new javax.swing.JLabel();
        ThankYouForUsingThisSimulator = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        jbBack.setContentAreaFilled(false);
        jbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });
        getContentPane().add(jbBack);
        jbBack.setBounds(20, 500, 140, 40);

        Credits.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Credits.setText("Credits");
        Credits.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Credits);
        Credits.setBounds(150, 160, 190, 50);

        makeby.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        makeby.setText("Make by:");
        makeby.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(makeby);
        makeby.setBounds(170, 210, 130, 90);

        beargm.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        beargm.setForeground(new java.awt.Color(0, 204, 255));
        beargm.setText("BEARG'M");
        beargm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(beargm);
        beargm.setBounds(290, 230, 130, 50);

        jbSteam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/steam.png"))); // NOI18N
        jbSteam.setContentAreaFilled(false);
        jbSteam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSteamActionPerformed(evt);
            }
        });
        getContentPane().add(jbSteam);
        jbSteam.setBounds(420, 230, 50, 50);

        ValveCorporation.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ValveCorporation.setText("Valve Corporation");
        ValveCorporation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(ValveCorporation);
        ValveCorporation.setBounds(360, 290, 210, 60);

        soundtrack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        soundtrack.setText("Soundtrack by:");
        soundtrack.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(soundtrack);
        soundtrack.setBounds(170, 280, 190, 80);

        UsedSoftware.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        UsedSoftware.setText("Used Software:");
        UsedSoftware.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(UsedSoftware);
        UsedSoftware.setBounds(170, 340, 190, 80);

        Java8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Java8.setText("Java 8");
        Java8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Java8);
        Java8.setBounds(370, 350, 210, 60);

        ThankYouForUsingThisSimulator.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ThankYouForUsingThisSimulator.setText("Thank you for using this simulator :)");
        ThankYouForUsingThisSimulator.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(ThankYouForUsingThisSimulator);
        ThankYouForUsingThisSimulator.setBounds(130, 440, 450, 60);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tf2_bg___red_respawn_area_by_belaboy.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 670, 560);

        setSize(new java.awt.Dimension(686, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSteamActionPerformed
        String url="http://steamcommunity.com/id/beargm";
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jbSteamActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbBackActionPerformed

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
            java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Credits;
    private javax.swing.JLabel Java8;
    private javax.swing.JLabel ThankYouForUsingThisSimulator;
    private javax.swing.JLabel UsedSoftware;
    private javax.swing.JLabel ValveCorporation;
    private javax.swing.JLabel beargm;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbSteam;
    private javax.swing.JLabel makeby;
    private javax.swing.JLabel soundtrack;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icones/tf2.png")));
    }
}
