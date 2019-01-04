
package view;

import view.Personagens.AScout;
import view.Personagens.Demoman;
import view.Personagens.ISpy;
import view.Personagens.HSniper;
import view.Personagens.GMedic;
import view.Personagens.EHeavy;
import view.Personagens.FEnginner;
import view.Personagens.CPyro;
import view.Personagens.BSoldier;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;

public class MenuClasses extends javax.swing.JFrame {
    public MenuClasses() {
        initComponents();
        setTitle("Class Menu");
        setSize(675, 580);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbRareWeaponsOff = new javax.swing.JButton();
        jbRandomizer = new javax.swing.JButton();
        Scout = new javax.swing.JButton();
        Soldier = new javax.swing.JButton();
        Pyro = new javax.swing.JButton();
        Demoman = new javax.swing.JButton();
        heavy = new javax.swing.JButton();
        Enginner = new javax.swing.JButton();
        Medic = new javax.swing.JButton();
        Sniper = new javax.swing.JButton();
        Spy = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jbRareWeaponsOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RareWeaponsInfo.png"))); // NOI18N
        jbRareWeaponsOff.setContentAreaFilled(false);
        jbRareWeaponsOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRareWeaponsOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRareWeaponsOffActionPerformed(evt);
            }
        });
        getContentPane().add(jbRareWeaponsOff);
        jbRareWeaponsOff.setBounds(530, 510, 140, 40);

        jbRandomizer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Randomizer.png"))); // NOI18N
        jbRandomizer.setContentAreaFilled(false);
        jbRandomizer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRandomizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRandomizerActionPerformed(evt);
            }
        });
        getContentPane().add(jbRandomizer);
        jbRandomizer.setBounds(260, 190, 150, 40);

        Scout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/scout.png"))); // NOI18N
        Scout.setContentAreaFilled(false);
        Scout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Scout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoutActionPerformed(evt);
            }
        });
        getContentPane().add(Scout);
        Scout.setBounds(160, 230, 80, 80);

        Soldier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/soldier.png"))); // NOI18N
        Soldier.setContentAreaFilled(false);
        Soldier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Soldier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoldierActionPerformed(evt);
            }
        });
        getContentPane().add(Soldier);
        Soldier.setBounds(300, 230, 80, 80);

        Pyro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/pyro.png"))); // NOI18N
        Pyro.setContentAreaFilled(false);
        Pyro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pyro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PyroActionPerformed(evt);
            }
        });
        getContentPane().add(Pyro);
        Pyro.setBounds(440, 230, 80, 80);

        Demoman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/demoman.png"))); // NOI18N
        Demoman.setContentAreaFilled(false);
        Demoman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Demoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemomanActionPerformed(evt);
            }
        });
        getContentPane().add(Demoman);
        Demoman.setBounds(160, 340, 80, 80);

        heavy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/heavy.png"))); // NOI18N
        heavy.setContentAreaFilled(false);
        heavy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        heavy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heavyActionPerformed(evt);
            }
        });
        getContentPane().add(heavy);
        heavy.setBounds(300, 340, 80, 80);

        Enginner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/engineer.png"))); // NOI18N
        Enginner.setContentAreaFilled(false);
        Enginner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnginnerActionPerformed(evt);
            }
        });
        getContentPane().add(Enginner);
        Enginner.setBounds(440, 340, 80, 80);

        Medic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/medic.png"))); // NOI18N
        Medic.setContentAreaFilled(false);
        Medic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicActionPerformed(evt);
            }
        });
        getContentPane().add(Medic);
        Medic.setBounds(160, 450, 80, 80);

        Sniper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/sniper.png"))); // NOI18N
        Sniper.setContentAreaFilled(false);
        Sniper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sniper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SniperActionPerformed(evt);
            }
        });
        getContentPane().add(Sniper);
        Sniper.setBounds(300, 450, 80, 80);

        Spy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatars/spy.png"))); // NOI18N
        Spy.setContentAreaFilled(false);
        Spy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Spy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpyActionPerformed(evt);
            }
        });
        getContentPane().add(Spy);
        Spy.setBounds(440, 450, 80, 80);

        or.setFont(new java.awt.Font("TF2", 3, 36)); // NOI18N
        or.setText("Choose Your Class or");
        getContentPane().add(or);
        or.setBounds(130, 140, 430, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tf2_bg___red_respawn_area_by_belaboy.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 670, 560);

        setSize(new java.awt.Dimension(686, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ScoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoutActionPerformed
            AScout s = new AScout();
            s.setVisible(true);
            dispose();
    }//GEN-LAST:event_ScoutActionPerformed

    private void SoldierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoldierActionPerformed
            BSoldier s = new BSoldier();
            s.setVisible(true);
            dispose();
    }//GEN-LAST:event_SoldierActionPerformed

    private void PyroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PyroActionPerformed
            CPyro p = new CPyro();
            p.setVisible(true);
            dispose();
    }//GEN-LAST:event_PyroActionPerformed

    private void DemomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemomanActionPerformed
            Demoman d = new Demoman();
            d.setVisible(true);
            dispose();
    }//GEN-LAST:event_DemomanActionPerformed

    private void heavyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heavyActionPerformed
            EHeavy h = new EHeavy();
            h.setVisible(true);
            dispose();
    }//GEN-LAST:event_heavyActionPerformed

    private void EnginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnginnerActionPerformed
            FEnginner e = new FEnginner();
            e.setVisible(true);
            dispose();
    }//GEN-LAST:event_EnginnerActionPerformed

    private void MedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicActionPerformed
            GMedic m = new GMedic();
            m.setVisible(true);
            dispose();
    }//GEN-LAST:event_MedicActionPerformed

    private void SniperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SniperActionPerformed
            HSniper s = new HSniper();
            s.setVisible(true);
            dispose();
    }//GEN-LAST:event_SniperActionPerformed

    private void SpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpyActionPerformed
            ISpy s = new ISpy();
            s.setVisible(true);
            dispose();
    }//GEN-LAST:event_SpyActionPerformed

    private void jbRandomizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRandomizerActionPerformed
        Random r = new Random();
        int n = 1 + r.nextInt(8);
        switch(n){
            case 1:
                    AScout scout = new AScout();
                    scout.setVisible(true);
                    dispose();
                break;
            case 2:
                    BSoldier soldier = new BSoldier();
                    soldier.setVisible(true);
                    dispose();
                break;
            case 3:
                    CPyro p = new CPyro();
                    p.setVisible(true);
                    dispose();
                break;
            case 4:
                    Demoman d = new Demoman();
                    d.setVisible(true);
                    dispose();
                break;
            case 5:
                    EHeavy h = new EHeavy();
                    h.setVisible(true);
                    dispose();
                break;
            case 6:
                    FEnginner e = new FEnginner();
                    e.setVisible(true);
                    dispose();
                break;
            case 7:
                    GMedic m = new GMedic();
                    m.setVisible(true);
                    dispose();
                break;
            case 8:
                    HSniper sniper = new HSniper();
                    sniper.setVisible(true);
                    dispose();
                break;
            case 9:
                    ISpy spy = new ISpy();
                    spy.setVisible(true);
                    dispose();
                break;
            default:
            JOptionPane.showMessageDialog(null, "A aleatóriedade do random pda bugou.. Tente novamente");
            break;
        }
    }//GEN-LAST:event_jbRandomizerActionPerformed

    private void jbRareWeaponsOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRareWeaponsOffActionPerformed
        RareWeaponsInfo rwi = new RareWeaponsInfo();
        rwi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbRareWeaponsOffActionPerformed

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
            java.util.logging.Logger.getLogger(MenuClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClasses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Demoman;
    private javax.swing.JButton Enginner;
    private javax.swing.JButton Medic;
    private javax.swing.JButton Pyro;
    private javax.swing.JButton Scout;
    private javax.swing.JButton Sniper;
    private javax.swing.JButton Soldier;
    private javax.swing.JButton Spy;
    private javax.swing.JLabel bg;
    private javax.swing.JButton heavy;
    private javax.swing.JButton jbRandomizer;
    private javax.swing.JButton jbRareWeaponsOff;
    private javax.swing.JLabel or;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icones/tf2.png")));
    }
}
