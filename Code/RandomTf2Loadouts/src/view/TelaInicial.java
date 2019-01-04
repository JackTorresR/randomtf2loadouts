
package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Toolkit;
import java.net.URL;

public class TelaInicial extends javax.swing.JFrame {

    public String nomeMusic = "MainTheme";
    public static boolean musicOff=false;
    
    URL url = TelaInicial.class.getResource(nomeMusic+".wav");
    AudioClip audio = Applet.newAudioClip(url);
    
    public TelaInicial() {
        initComponents();
        setTitle("Random Team Fortress 2 Loadout Simulator");
        setSize(665, 588);
        setIcon();
        tirarBotoes();
        verificarSom();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCredits = new javax.swing.JButton();
        jbGo = new javax.swing.JButton();
        jbMute = new javax.swing.JButton();
        jbUnMute = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jbCredits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/credits.png"))); // NOI18N
        jbCredits.setContentAreaFilled(false);
        jbCredits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(jbCredits);
        jbCredits.setBounds(510, 510, 140, 40);

        jbGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/start.png"))); // NOI18N
        jbGo.setContentAreaFilled(false);
        jbGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoActionPerformed(evt);
            }
        });
        getContentPane().add(jbGo);
        jbGo.setBounds(180, 410, 280, 100);

        jbMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mute.png"))); // NOI18N
        jbMute.setContentAreaFilled(false);
        jbMute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMuteActionPerformed(evt);
            }
        });
        getContentPane().add(jbMute);
        jbMute.setBounds(20, 480, 70, 60);

        jbUnMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UnMute.png"))); // NOI18N
        jbUnMute.setContentAreaFilled(false);
        jbUnMute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbUnMute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnMuteActionPerformed(evt);
            }
        });
        getContentPane().add(jbUnMute);
        jbUnMute.setBounds(20, 480, 70, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_Início.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 660, 559);

        setSize(new java.awt.Dimension(676, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoActionPerformed
        audio.stop();
        MenuClasses mn = new MenuClasses();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbGoActionPerformed

    private void jbCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreditsActionPerformed
        audio.stop();
        Creditos c = new Creditos();
        c.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jbCreditsActionPerformed

    private void jbMuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMuteActionPerformed
        if(musicOff==false){
            musicOff = true;
            audio.stop();
            jbMute.setVisible(false);
            jbUnMute.setVisible(true);
        }
        
    }//GEN-LAST:event_jbMuteActionPerformed

    private void jbUnMuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnMuteActionPerformed
        if(musicOff==true){
            musicOff=false;
            audio.play();
            jbMute.setVisible(true);
            jbUnMute.setVisible(false);
        }
    }//GEN-LAST:event_jbUnMuteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jbCredits;
    private javax.swing.JButton jbGo;
    private javax.swing.JButton jbMute;
    private javax.swing.JButton jbUnMute;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icones/tf2.png")));
    }

    private void tirarBotoes() {
        jbUnMute.setVisible(false);
        jbMute.setVisible(true);
    }

    private void verificarSom() {
        if(musicOff==true){
            jbUnMute.setVisible(true);
            jbMute.setVisible(false);
        }else{
            audio.play();
            jbUnMute.setVisible(false);
            jbMute.setVisible(true);
        }
    }
}
