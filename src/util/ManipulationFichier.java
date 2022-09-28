/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import control.AppCtr;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.RegistreUtilisateur;
import model.Utilisateur;

/**
 *
 * @author Ayoub
 */
public class ManipulationFichier {

    public static void chargerUtil(RegistreUtilisateur listeUtil, String nomFichier) {
        File file = new File(nomFichier);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            //ecriture
            bw.write("nom|prénom|age|téléphone");
            bw.newLine();
            for (Utilisateur util : listeUtil.getListe()) {
                bw.write(formerLigne(util));
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "La liste des utilisateurs a été chargé avec succès", "Succès chargement", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static String formerLigne(Utilisateur util) {
        return util.getNom() + "|" + util.getPrenom() + "|" + util.getAge() + "|" + util.getTelephone();
    }

    public static void lireFichierUtil(RegistreUtilisateur listeUtilIn, String nomFichier) {
        File file = new File(nomFichier);

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            //lecture
            String c;
            while ((c = br.readLine()) != null) {
                Utilisateur util = parserLigne(c);
                //Ajouter utilisateur dans la liste
                listeUtilIn.ajouterUtil(util);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static Utilisateur parserLigne(String c) {
        String[] token = c.split(",");
        String nom = token[0];
        String prenom = token[1];
        int age = Integer.parseInt(token[2]);
        String tel = token[3];

        return new Utilisateur(nom, prenom, age, tel);
    }

}
