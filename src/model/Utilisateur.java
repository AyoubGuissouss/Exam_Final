/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ayoub
 */
public class Utilisateur {
    //Attributs
    String nom, prenom;
    int age;
    String telephone;
    
    //Constructeurs

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, int age, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", telephone=" + telephone + '}';
    }
    
    
}
