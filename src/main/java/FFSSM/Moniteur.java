/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Plongeur {

    public int numeroDiplome;
    
    private LinkedList<Embauche>  myEmployeur;

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance,int niveau, int numeroDiplome, GroupeSanguin gs) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance, niveau, gs);
        this.numeroDiplome = numeroDiplome;
        myEmployeur = new LinkedList();
    }

    public Club employeur() {
         int res = -1;
         for(int i=0;i<myEmployeur.size();i++){
             if(!myEmployeur.get(i).estTerminee()){
                 res=i;
             }
             
         }
         if(res<0){
             return null;
         }
         else{
             return myEmployeur.get(res).getEmployeur();
         }
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
         myEmployeur.add(new Embauche(debutNouvelle, this, employeur));
    }

    public List<Embauche> emplois() {
         return myEmployeur;
    }

}
