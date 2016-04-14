/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nezdames.serialisation;

import classesMetier.ContratCession;
import classesMetier.ContratTravail;
import java.util.ArrayList;
import classesMetier.Intermittent;
import classesMetier.Lieu;
import classesMetier.Spectacle;
import classesMetier.User;

/**
 *
 * @author gaellecastel
 */
public class NezDamesSerialisation {

     // déclaration des collections
    public static ArrayList<Intermittent> lesIntermittents = new ArrayList();
    public static ArrayList<User> lesUsers = new ArrayList();
    public static ArrayList<Spectacle> lesSpectacles = new ArrayList();
    public static ArrayList<ContratCession> lesContratsCession = new ArrayList();
    public static ArrayList<ContratTravail> lesContratsTravail = new ArrayList();
    public static ArrayList<Lieu> lesLieux = new ArrayList();
    public static int index =-1 ;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPrincipal monMenuPrincipal = new MenuPrincipal();
        monMenuPrincipal.setVisible(true);
    }
    
}
