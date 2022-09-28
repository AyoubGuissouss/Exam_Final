/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ayoub
 */
public class RegistreUtilisateur {
    ArrayList<Utilisateur> liste = new ArrayList<>();

    public RegistreUtilisateur() {
    }

    public ArrayList<Utilisateur> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Utilisateur> liste) {
        this.liste = liste;
    }

    @Override
    public String toString() {
        return "RegistreUtilisateur{" + "liste=" + liste + '}';
    }

    public void ajouterUtil(Utilisateur util) {
        liste.add(util);
    }
   
    
}
