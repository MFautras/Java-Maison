package gestionContratsTravail;

import classesMetier.ContratCession;
import classesMetier.ContratTravail;
import classesMetier.Intermittent;
import classesMetier.Representation;
import java.util.ArrayList;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static nezdames.serialisation.NezDamesSerialisation.lesContratsCession;

/**
 *
 * @author gaellecastel
 */
public class ContratTravailModifier extends javax.swing.JFrame {

    private int lIndexDuContratTravail;
    String numeroContrat;

    public ContratTravailModifier(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //on remplit la combobox intermittents
        Intermittent NomIntermitent = null;
        jComboBoxNom.removeAllItems();
        for (Intermittent unIntermittent : NezDamesSerialisation.lesIntermittents) {
            jComboBoxNom.addItem(unIntermittent.getNomIntermittent() + unIntermittent.getPrenomIntermittent());
            NomIntermitent = unIntermittent;
        }
        
        jComboBoxCCE.removeAllItems();
        //Date et Heure Représentation
        for (ContratCession unContratCession : lesContratsCession) {
            jComboBoxCCE.addItem(unContratCession.getNumeroContratCession());
        }
        
        //on remplit la JComboBox
        jComboBoxRole.removeAllItems();

        ArrayList<String> lesRoles = new ArrayList();

        lesRoles.add("Artiste");
        lesRoles.add("Costumier / Costumière");
        lesRoles.add("Metteur en scène");
        lesRoles.add("Technicien");
        lesRoles.add("Animateur");

        for (String unRole : lesRoles) {
            jComboBoxRole.addItem(unRole);
        }
        
        lIndexDuContratTravail = laLigneSelectionnee;

        
        //on charge les données sélectionné
        jComboBoxNom.setSelectedItem(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getLintermittent())));
        jComboBoxCCE.setSelectedItem(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getLeContratCession())));
        jComboBoxDate.setSelectedItem(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getLesRepresentations())));
        jComboBoxRole.setSelectedItem(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getRole())));
        txtEditer.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getEdition())));
        txtNbrHeure.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getNombreHeures())));
        txtJours.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)))));
        

        numeroContrat = String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getNumContratTravail()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitre1 = new javax.swing.JLabel();
        btnEnvoyer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        txtEditer = new javax.swing.JTextField();
        lblEditer = new javax.swing.JLabel();
        lblCCE = new javax.swing.JLabel();
        jComboBoxCCE = new javax.swing.JComboBox();
        lblImageManu = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        jComboBoxNom = new javax.swing.JComboBox();
        lblNomInter = new javax.swing.JLabel();
        jComboBoxDate = new javax.swing.JComboBox();
        jComboBoxNumeroRepresentation = new javax.swing.JComboBox();
        jComboBoxRole = new javax.swing.JComboBox();
        lblDateHeure = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtNbrHeure = new javax.swing.JTextField();
        lblNbrHeure = new javax.swing.JLabel();
        txtJours = new javax.swing.JTextField();
        lblJours = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("MODIFICATION D'UN CONTRAT DE TRAVAIL");

        btnEnvoyer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnEnvoyer.setText("Modifier le contrat");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        txtEditer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditerActionPerformed(evt);
            }
        });

        lblEditer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblEditer.setForeground(new java.awt.Color(255, 153, 51));
        lblEditer.setText("Souhaiteriez-vous l'éditer plus tard ?");

        lblCCE.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblCCE.setForeground(new java.awt.Color(255, 153, 51));
        lblCCE.setText("Contrat de Cession Editer");

        jComboBoxCCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCCEActionPerformed(evt);
            }
        });

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        jComboBoxNom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNomInter.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblNomInter.setForeground(new java.awt.Color(255, 153, 0));
        lblNomInter.setText("Nom et prénom de l'intermittent");

        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxNumeroRepresentation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDateHeure.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblDateHeure.setForeground(new java.awt.Color(255, 153, 0));
        lblDateHeure.setText("Date et heure de la représentation");

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 153, 0));
        lblRole.setText("Rôle");

        lblNbrHeure.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblNbrHeure.setForeground(new java.awt.Color(255, 153, 0));
        lblNbrHeure.setText("Nombre d'heures");

        lblJours.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblJours.setForeground(new java.awt.Color(255, 153, 0));
        lblJours.setText("Quels Jours y allez-vous ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)
                        .addGap(24, 24, 24)
                        .addComponent(lblTitre1)
                        .addGap(18, 18, 18)
                        .addComponent(lblImageOlivier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnEnvoyer)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnnuler)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCCE, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomInter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDateHeure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNbrHeure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJours, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxNumeroRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxCCE, 0, 303, Short.MAX_VALUE)
                    .addComponent(jComboBoxNom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJours)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNbrHeure, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEditer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addComponent(jComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitre1))
                    .addComponent(lblImageOlivier)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomInter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCCE)
                    .addComponent(jComboBoxCCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNumeroRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateHeure))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditer))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNbrHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNbrHeure))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJours, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(lblJours))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyer)
                    .addComponent(btnAnnuler))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(781, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // test qui vérifie que les champs sont remplis

        //--------------MODIFICATION DU CONTRAT DE TRAVAIL-------------------------------------
        if (txtNbrHeure.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir le nombre d'heures travailler");
        }
        if (txtJours.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir les jours ou vous travaillez");
        }
        if (txtEditer.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Ecrivez oui ou non");
        } else {

            Intermittent NomIntermitent = null;
            jComboBoxNom.removeAllItems();
            for (Intermittent unIntermittent : NezDamesSerialisation.lesIntermittents) {
            jComboBoxNom.addItem(unIntermittent.getNomIntermittent() + unIntermittent.getPrenomIntermittent());
            NomIntermitent = unIntermittent;
        }
            
            ContratCession contratChoisi = null;
        //recherche du contrat de cession
        if (jComboBoxCCE.getItemCount() != 0) {
            for (ContratCession unContratCession : lesContratsCession) {
                if (jComboBoxCCE.getSelectedItem().toString().compareTo(unContratCession.getNumeroContratCession()) == 0) {
                    contratChoisi = unContratCession;
                }
            }
        }
            
            // recherche du Role
            ContratTravail theRole = null;

            for (ContratTravail unContratTravail : NezDamesSerialisation.lesContratsTravail) {
                if (unContratTravail.getRole().compareTo((String) jComboBoxRole.getSelectedItem()) == 0) {
                    theRole = unContratTravail;
                }
            }
            
            NezDamesSerialisation.lesContratsTravail.get(lIndexDuContratTravail).modifier(numeroContrat, jComboBoxRole.getSelectedItem().toString(), 
                    Integer.parseInt(txtNbrHeure.getText()), contratChoisi , NomIntermitent);
            JOptionPane.showMessageDialog(null, "Contrat de travail modifié.");

            this.dispose();

        }
    }//GEN-LAST:event_btnEnvoyerActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void txtEditerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditerActionPerformed

    private void jComboBoxCCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCCEActionPerformed
        // TODO add your handling code here:
        jComboBoxDate.removeAllItems();
        jComboBoxNumeroRepresentation.removeAllItems();
        ContratCession contratChoisi = null;
        //recherche du contrat de cession
        if (jComboBoxCCE.getItemCount() != 0) {
            for (ContratCession unContratCession : lesContratsCession) {
                if (jComboBoxCCE.getSelectedItem().toString().compareTo(unContratCession.getNumeroContratCession()) == 0) {
                    contratChoisi = unContratCession;
                }
            }
         //on remplit la jcombobox date
            //Date et Heure Représentation
            if (contratChoisi.getLesRepresentations().size() != 0) {
                for (Representation uneRepresentation : contratChoisi.getLesRepresentations()) {
                    jComboBoxDate.addItem(uneRepresentation.getDate() + " " + uneRepresentation.getHeureDebut() + " " + uneRepresentation.getLeLieu().getNom());
                    jComboBoxNumeroRepresentation.addItem(uneRepresentation.getIdRepresentation());
                }
            }
        }
        
    }//GEN-LAST:event_jComboBoxCCEActionPerformed

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
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratProductionModifier().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratCessionModifier().setVisible(true);
         }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratProductionModifier().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratTravailModifier(laLigneSelectionnee).setVisible(true);
         }
         });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JComboBox jComboBoxCCE;
    private javax.swing.JComboBox jComboBoxDate;
    private javax.swing.JComboBox jComboBoxNom;
    private javax.swing.JComboBox jComboBoxNumeroRepresentation;
    private javax.swing.JComboBox jComboBoxRole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCCE;
    private javax.swing.JLabel lblDateHeure;
    private javax.swing.JLabel lblEditer;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblJours;
    private javax.swing.JLabel lblNbrHeure;
    private javax.swing.JLabel lblNomInter;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JTextField txtEditer;
    private javax.swing.JTextField txtJours;
    private javax.swing.JTextField txtNbrHeure;
    // End of variables declaration//GEN-END:variables
}
