package nezdames.serialisation;

import gestionSpectacles.SpectaclesLister;
import gestionSpectacles.SpectacleAjouter;
import gestionIntermittents.IntermittentsLister;
import gestionIntermittents.IntermittentModifierMotPasse;
import gestionIntermittents.IntermittentAjouter;
import gestionContratsCession.ContratCessionAjouter;
import gestionContratsCession.ContratCessionLister;
import gestionRepresentations.RepresentationLister;
import gestionRepresentations.RepresentationAjouter;
import classesMetier.Spectacle;
import classesMetier.Intermittent;
import classesMetier.ContratCession;
import classesMetier.ContratTravail;
import classesMetier.Lieu;
import gestionContratsCession.ContratCessionListerEditer;
import gestionContratsTravail.ContratTravailAjouter;
import gestionContratsTravail.ContratTravailLister;
import gestionContratsTravail.ContratTravailListerEditer;
import gestionLieux.LieuAjouter;
import gestionLieux.LieuxLister;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gaellecastel
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBanniere = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuIntermittents = new javax.swing.JMenu();
        jMenuItemAjouterIntermittents = new javax.swing.JMenuItem();
        jMenuItemModifierMotPasse = new javax.swing.JMenuItem();
        jMenuItemListerIntermittents = new javax.swing.JMenuItem();
        jMenuSpectacles = new javax.swing.JMenu();
        jMenuAjouterSpectacle = new javax.swing.JMenuItem();
        jMenuItemListerSpectacles = new javax.swing.JMenuItem();
        jMenuContratsProduction = new javax.swing.JMenu();
        jMenuItemAjouterContratProduction = new javax.swing.JMenuItem();
        jMenuItemAjouterRepresentation = new javax.swing.JMenuItem();
        SupprRepréCc = new javax.swing.JMenuItem();
        jMenuItemListerContratsProduction = new javax.swing.JMenuItem();
        EditeCc = new javax.swing.JMenuItem();
        jMenuContratTravail = new javax.swing.JMenu();
        jMenuAjouterContratTravail = new javax.swing.JMenuItem();
        jMenuItemListerContratsTravail = new javax.swing.JMenuItem();
        EditeCt = new javax.swing.JMenuItem();
        menuItemLieux = new javax.swing.JMenu();
        jMenuItemAjouterLieu = new javax.swing.JMenuItem();
        jMenuItemListerLieux = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelBanniere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banniere2.png")));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banniereEcole2.png")));

        jMenuIntermittents.setText("Intermittents");
        jMenuIntermittents.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemAjouterIntermittents.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemAjouterIntermittents.setText("Ajouter un intermittent");
        jMenuItemAjouterIntermittents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjouterIntermittentsActionPerformed(evt);
            }
        });
        jMenuIntermittents.add(jMenuItemAjouterIntermittents);

        jMenuItemModifierMotPasse.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemModifierMotPasse.setText("Modifier le mot de passe d'un intermittent");
        jMenuItemModifierMotPasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModifierMotPasseActionPerformed(evt);
            }
        });
        jMenuIntermittents.add(jMenuItemModifierMotPasse);

        jMenuItemListerIntermittents.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerIntermittents.setText("Lister, modifier, supprimer les intermittents");
        jMenuItemListerIntermittents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerIntermittentsActionPerformed(evt);
            }
        });
        jMenuIntermittents.add(jMenuItemListerIntermittents);

        jMenuBar.add(jMenuIntermittents);

        jMenuSpectacles.setText("Spectacles");
        jMenuSpectacles.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuAjouterSpectacle.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuAjouterSpectacle.setText("Ajouter un spectacle");
        jMenuAjouterSpectacle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjouterSpectacleActionPerformed(evt);
            }
        });
        jMenuSpectacles.add(jMenuAjouterSpectacle);

        jMenuItemListerSpectacles.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerSpectacles.setText("Lister, modifier, supprimer les spectacles");
        jMenuItemListerSpectacles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerSpectaclesActionPerformed(evt);
            }
        });
        jMenuSpectacles.add(jMenuItemListerSpectacles);

        jMenuBar.add(jMenuSpectacles);

        jMenuContratsProduction.setText("Contrats de cession");
        jMenuContratsProduction.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemAjouterContratProduction.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemAjouterContratProduction.setText("Ajouter un contrat de cession");
        jMenuItemAjouterContratProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjouterContratProductionActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(jMenuItemAjouterContratProduction);

        jMenuItemAjouterRepresentation.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemAjouterRepresentation.setText("Ajouter une représentation à un contrat de cession");
        jMenuItemAjouterRepresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjouterRepresentationActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(jMenuItemAjouterRepresentation);

        SupprRepréCc.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        SupprRepréCc.setText("Lister, supprimer les représentations des contrats de cession");
        SupprRepréCc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprRepréCcActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(SupprRepréCc);

        jMenuItemListerContratsProduction.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerContratsProduction.setText("Lister, modifier, supprimer les contrats de cession");
        jMenuItemListerContratsProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerContratsProductionActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(jMenuItemListerContratsProduction);

        EditeCc.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        EditeCc.setText("Éditer/Imprimer un contrat de cession");
        EditeCc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditeCcActionPerformed(evt);
            }
        });
        jMenuContratsProduction.add(EditeCc);

        jMenuBar.add(jMenuContratsProduction);

        jMenuContratTravail.setText("Contrats de Travail");
        jMenuContratTravail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuAjouterContratTravail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuAjouterContratTravail.setText("Ajouter un contrat de travail");
        jMenuAjouterContratTravail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjouterContratTravailActionPerformed(evt);
            }
        });
        jMenuContratTravail.add(jMenuAjouterContratTravail);

        jMenuItemListerContratsTravail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItemListerContratsTravail.setText("Lister, modifier, supprimer les contrats de travail");
        jMenuItemListerContratsTravail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerContratsTravailActionPerformed(evt);
            }
        });
        jMenuContratTravail.add(jMenuItemListerContratsTravail);

        EditeCt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        EditeCt.setText("Éditer/Imprimer un contrat de travail");
        EditeCt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditeCtActionPerformed(evt);
            }
        });
        jMenuContratTravail.add(EditeCt);

        jMenuBar.add(jMenuContratTravail);

        menuItemLieux.setText("Lieux");
        menuItemLieux.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N

        jMenuItemAjouterLieu.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemAjouterLieu.setText("Ajouter un lieu");
        jMenuItemAjouterLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjouterLieuActionPerformed(evt);
            }
        });
        menuItemLieux.add(jMenuItemAjouterLieu);

        jMenuItemListerLieux.setFont(new java.awt.Font("Hannotate SC", 0, 14)); // NOI18N
        jMenuItemListerLieux.setText("Lister, modifier, supprimer les lieux");
        jMenuItemListerLieux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListerLieuxActionPerformed(evt);
            }
        });
        menuItemLieux.add(jMenuItemListerLieux);

        jMenuBar.add(menuItemLieux);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBanniere)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBanniere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(931, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListerIntermittentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerIntermittentsActionPerformed
        new IntermittentsLister().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerIntermittentsActionPerformed

    private void jMenuItemAjouterIntermittentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterIntermittentsActionPerformed
        new IntermittentAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuItemAjouterIntermittentsActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // this.dispose();
            //sérialisation
            try {
                // sérialisation des intermittents
                FileOutputStream fichierIntermittents = new FileOutputStream("lesIntermittents.txt");
                ObjectOutputStream fluxIntermittents = new ObjectOutputStream(fichierIntermittents);
                fluxIntermittents.writeObject(NezDamesSerialisation.lesIntermittents);
                //fluxIntermittents.close();
                
                // sérialisation des spectacles
                FileOutputStream fichierSpectacles = new FileOutputStream("lesSpectacles.txt");
                ObjectOutputStream fluxSpectacles = new ObjectOutputStream(fichierSpectacles);
                fluxSpectacles.writeObject(NezDamesSerialisation.lesSpectacles);
                //fluxSpectacles.close();
                
                // sérialisation des contrats de production
                FileOutputStream fichierContratsCession = new FileOutputStream("lesContratsCession.txt");
                ObjectOutputStream fluxContratsCession = new ObjectOutputStream(fichierContratsCession);
                fluxContratsCession.writeObject(NezDamesSerialisation.lesContratsCession);
                //fluxContratsCession.close();
                
               // sérialisation des contrats de travail
                FileOutputStream fichierContratsTravail = new FileOutputStream("lesContratsTravail.txt");
                ObjectOutputStream fluxContratsTravail = new ObjectOutputStream(fichierContratsTravail);
                fluxContratsTravail.writeObject(NezDamesSerialisation.lesContratsTravail);
                //fluxContratsTravail.close();
                
                 // sérialisation des lieux
                FileOutputStream fichierLieux = new FileOutputStream("lesLieux.txt");
                ObjectOutputStream fluxLieux = new ObjectOutputStream(fichierLieux);
                fluxLieux.writeObject(NezDamesSerialisation.lesLieux);
                //fluxLieux.close();
                
                this.dispose();
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Problème d'entrée/sortie");
            }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // chargement des intermittents
            FileInputStream fichierIntermittents = new FileInputStream("lesIntermittents.txt");
            ObjectInputStream fluxIntermittents = new ObjectInputStream(fichierIntermittents);
            NezDamesSerialisation.lesIntermittents = (ArrayList<Intermittent>) fluxIntermittents.readObject();
            
            // chargement des spectacles
            FileInputStream fichierSpectacles = new FileInputStream("lesSpectacles.txt");
            ObjectInputStream fluxSpectacles = new ObjectInputStream(fichierSpectacles);
            NezDamesSerialisation.lesSpectacles = (ArrayList<Spectacle>) fluxSpectacles.readObject();
            
            // chargement des contrats de production
            FileInputStream fichierContratsCession = new FileInputStream("lesContratsCession.txt");
            ObjectInputStream fluxContratsCession = new ObjectInputStream(fichierContratsCession);
            NezDamesSerialisation.lesContratsCession = (ArrayList<ContratCession>) fluxContratsCession.readObject();
            
           // chargement des contrats de Travail
            //si pas en commentaire message "nouveaux fichier" afficher à chaque fois
            FileInputStream fichierContratsTravail = new FileInputStream("lesContratsTravail.txt");
            ObjectInputStream fluxContratsTravail = new ObjectInputStream(fichierContratsTravail);
            NezDamesSerialisation.lesContratsTravail = (ArrayList<ContratTravail>) fluxContratsTravail.readObject();
            
             // chargement des lieux
            FileInputStream fichierLieux = new FileInputStream("lesLieux.txt");
            ObjectInputStream fluxLieux = new ObjectInputStream(fichierLieux);
            NezDamesSerialisation.lesLieux = (ArrayList<Lieu>) fluxLieux.readObject();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Nouveaux fichiers");
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Problème");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemModifierMotPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModifierMotPasseActionPerformed
        new IntermittentModifierMotPasse().setVisible(true);
    }//GEN-LAST:event_jMenuItemModifierMotPasseActionPerformed

    private void jMenuItemListerSpectaclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerSpectaclesActionPerformed
        new SpectaclesLister().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerSpectaclesActionPerformed

    private void jMenuAjouterSpectacleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjouterSpectacleActionPerformed
        new SpectacleAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuAjouterSpectacleActionPerformed

    private void jMenuItemListerContratsProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerContratsProductionActionPerformed
        new ContratCessionLister().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerContratsProductionActionPerformed

    private void jMenuItemAjouterContratProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterContratProductionActionPerformed
        new ContratCessionAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuItemAjouterContratProductionActionPerformed

    private void jMenuItemAjouterRepresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterRepresentationActionPerformed
        new RepresentationAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuItemAjouterRepresentationActionPerformed

    private void jMenuItemAjouterLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterLieuActionPerformed
        new LieuAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuItemAjouterLieuActionPerformed

    private void jMenuItemListerLieuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerLieuxActionPerformed
        new LieuxLister().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerLieuxActionPerformed

    private void SupprRepréCcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprRepréCcActionPerformed
        new RepresentationLister().setVisible(true);
    }//GEN-LAST:event_SupprRepréCcActionPerformed

    private void EditeCcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditeCcActionPerformed
        new ContratCessionListerEditer().setVisible(true);
    }//GEN-LAST:event_EditeCcActionPerformed

    private void jMenuAjouterContratTravailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjouterContratTravailActionPerformed
        new ContratTravailAjouter().setVisible(true);
    }//GEN-LAST:event_jMenuAjouterContratTravailActionPerformed

    private void jMenuItemListerContratsTravailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListerContratsTravailActionPerformed
        new ContratTravailLister().setVisible(true);
    }//GEN-LAST:event_jMenuItemListerContratsTravailActionPerformed

    private void EditeCtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditeCtActionPerformed
        new ContratTravailListerEditer().setVisible(true);
    }//GEN-LAST:event_EditeCtActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EditeCc;
    private javax.swing.JMenuItem EditeCt;
    private javax.swing.JMenuItem SupprRepréCc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBanniere;
    private javax.swing.JMenuItem jMenuAjouterContratTravail;
    private javax.swing.JMenuItem jMenuAjouterSpectacle;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuContratTravail;
    private javax.swing.JMenu jMenuContratsProduction;
    private javax.swing.JMenu jMenuIntermittents;
    private javax.swing.JMenuItem jMenuItemAjouterContratProduction;
    private javax.swing.JMenuItem jMenuItemAjouterIntermittents;
    private javax.swing.JMenuItem jMenuItemAjouterLieu;
    private javax.swing.JMenuItem jMenuItemAjouterRepresentation;
    private javax.swing.JMenuItem jMenuItemListerContratsProduction;
    private javax.swing.JMenuItem jMenuItemListerContratsTravail;
    private javax.swing.JMenuItem jMenuItemListerIntermittents;
    private javax.swing.JMenuItem jMenuItemListerLieux;
    private javax.swing.JMenuItem jMenuItemListerSpectacles;
    private javax.swing.JMenuItem jMenuItemModifierMotPasse;
    private javax.swing.JMenu jMenuSpectacles;
    private javax.swing.JMenu menuItemLieux;
    // End of variables declaration//GEN-END:variables
}
