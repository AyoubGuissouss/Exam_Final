/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.JFileChooser;
import model.RegistreUtilisateur;
import util.FileTypeFIlter;
import util.ManipulationFichier;

/**
 *
 * @author Ayoub
 */
public class FenAcc extends javax.swing.JFrame {

    //Déclarer et instancier la liste d'utilisateur (Stocker ajouts)
    private RegistreUtilisateur listeUtil = new RegistreUtilisateur();
    //Déclarer et instancier la liste d'utilisateur (Stocker utilsateurs du fichier)
    private RegistreUtilisateur listeUtilIn = new RegistreUtilisateur();

    /**
     * Creates new form FenAcc
     */
    public FenAcc() {
        initComponents();
    }

    FenAcc(RegistreUtilisateur listeUtil) {
        this();
        this.listeUtil = listeUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAjouter = new javax.swing.JButton();
        btnLireFichier = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kiosque d'information");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Kiosque d'information");

        btnAjouter.setText("Ajouter utilisateur");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnLireFichier.setText("Lire fichier");
        btnLireFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLireFichierActionPerformed(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addComponent(btnAjouter)
                        .addGap(64, 64, 64)
                        .addComponent(btnLireFichier)
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuitter)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAjouter)
                            .addComponent(btnLireFichier))
                        .addGap(44, 44, 44)))
                .addComponent(btnQuitter)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLireFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLireFichierActionPerformed
        JFileChooser fs = new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Charger liste commerciaux");
        fs.setFileFilter(new FileTypeFIlter(".txt", "Text File"));
        int result = fs.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fi = fs.getSelectedFile();
            ManipulationFichier.lireFichierUtil(listeUtilIn, fi.getPath());
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenAfficherContenuFichier(listeUtilIn).setVisible(true);
            }
        });
        //listeUtilIn.getListe().clear();
    }//GEN-LAST:event_btnLireFichierActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenAjoutUtil(listeUtil).setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_btnAjouterActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnLireFichier;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
