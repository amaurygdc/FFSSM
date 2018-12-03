/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Plongee {
    public HashSet<Plongeur> lesPlongeurs;

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
        lesPlongeurs = new HashSet();
    }

    public void ajouteParticipant(Plongeur participant) {
         lesPlongeurs.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
        boolean res = false;
         for(Plongeur p : lesPlongeurs){
             if (p.estConforme(date))
                 res = true;
         }
         return res;
    }

}
