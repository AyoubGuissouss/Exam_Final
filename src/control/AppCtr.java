/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import ui.FenAcc;

/**
 *
 * @author Ayoub
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ouvrir fenêtre d'acceuil
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenAcc().setVisible(true);
            }
        });
    }

}
