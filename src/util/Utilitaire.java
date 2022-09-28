/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.JOptionPane;
import model.Utilisateur;

/**
 *
 * @author Ayoub
 */
public class Utilitaire {

    public static void afficherMessageSucces(Utilisateur util) {
        JOptionPane.showMessageDialog(null, util,
                "Ajout avec succes", JOptionPane.INFORMATION_MESSAGE);
    }

    public static Utilisateur creerUtil(String nom, String prenom, int age, String tel)throws champVideException {
        if (nom.equals("")) {
            throw new champVideException("Entrez un nom!");
        }else if (prenom.equals("")){
            throw new champVideException("Entrez un prénom!");
        }else if (tel.equals("")){
            throw new champVideException("Entrez un numéro de téléphone!");
        }
        return new Utilisateur(nom, prenom, age, tel);
    }
}
