package gestionContratsTravail;

import classesMetier.ContratCession;
import classesMetier.ContratTravail;
import classesMetier.Representation;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;
import static nezdames.serialisation.NezDamesSerialisation.lesContratsCession;

/**
 *
 * @author gaellecastel
 */
public class ContratTravailDetails extends javax.swing.JFrame {
    
    private ArrayList<Representation> liste;

    DefaultListModel modele = new DefaultListModel();

    public ContratTravailDetails(int laLigneSelectionnee) {
        initComponents();
        
        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        
        //chargement des éléments des détails du contrat de travail
        txtNumContratTravail.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getNumContratTravail())));
        txtNomIntermittent.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getLintermittent().getNomIntermittent())));
        txtNbrHeure.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getNombreHeures())));
        //txtDate.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getLesRepresentations())));
        txtRole.setText(String.valueOf((((ContratTravail) NezDamesSerialisation.lesContratsTravail.get(laLigneSelectionnee)).getRole())));
 
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
        btnFermer = new javax.swing.JButton();
        lblNumeroContratCession = new javax.swing.JLabel();
        txtNomIntermittent = new javax.swing.JTextField();
        lblMontantContrat = new javax.swing.JLabel();
        txtNumContratTravail = new javax.swing.JTextField();
        lblTitreSpectacle = new javax.swing.JLabel();
        txtNbrHeure = new javax.swing.JTextField();
        lblImageManu = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("DÉTAILS D'UN CONTRAT DE TRAVAIL");

        btnFermer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        lblNumeroContratCession.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblNumeroContratCession.setForeground(new java.awt.Color(255, 153, 51));
        lblNumeroContratCession.setText("Numéro du contrat de travail");

        txtNomIntermittent.setEditable(false);
        txtNomIntermittent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomIntermittentActionPerformed(evt);
            }
        });

        lblMontantContrat.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblMontantContrat.setForeground(new java.awt.Color(255, 153, 51));
        lblMontantContrat.setText("Nom et prénom Intermittent");

        txtNumContratTravail.setEditable(false);

        lblTitreSpectacle.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblTitreSpectacle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitreSpectacle.setText("Nombre d'heure");

        txtNbrHeure.setEditable(false);
        txtNbrHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNbrHeureActionPerformed(evt);
            }
        });

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        txtRole.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Rôle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblImageManu)
                .addGap(41, 41, 41)
                .addComponent(lblTitre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lblImageOlivier)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitreSpectacle)
                    .addComponent(lblMontantContrat)
                    .addComponent(lblNumeroContratCession)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumContratTravail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRole, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtNbrHeure)
                    .addComponent(txtNomIntermittent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFermer)
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitre1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageOlivier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroContratCession)
                    .addComponent(txtNumContratTravail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMontantContrat)
                    .addComponent(txtNomIntermittent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNbrHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitreSpectacle))
                .addGap(18, 18, 18)
                .addComponent(btnFermer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(698, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void txtNomIntermittentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomIntermittentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomIntermittentActionPerformed

    private void txtNbrHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNbrHeureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNbrHeureActionPerformed

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
            java.util.logging.Logger.getLogger(ContratTravailDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratTravailDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratTravailDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratTravailDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ContratProductionDetails().setVisible(true);
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
                new ContratCessionDetails().setVisible(true);
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
                new ContratProductionDetails().setVisible(true);
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
                new ContratCessionDetails().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblMontantContrat;
    private javax.swing.JLabel lblNumeroContratCession;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblTitreSpectacle;
    private javax.swing.JTextField txtNbrHeure;
    private javax.swing.JTextField txtNomIntermittent;
    private javax.swing.JTextField txtNumContratTravail;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables
}
