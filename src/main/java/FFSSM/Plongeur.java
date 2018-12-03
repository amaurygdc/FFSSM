package FFSSM;

import java.util.Calendar;
import java.util.HashSet;

public class Plongeur extends Personne {

    public int niveau;
    private HashSet<Licence> lesLicences = new HashSet<>();
    private GroupeSanguin gs;

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome, GroupeSanguin gs) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = numeroDiplome;
    }
    
    public void ajouterLicence(Licence l){
        lesLicences.add(l);
    }
    public HashSet<Licence> getLicences(){
        return this.lesLicences;
    }
    public void setGS(){
        this.gs=gs;
    }
    public GroupeSanguin getGS(){
        return gs;
    }
    public void setNiveau(){
        this.niveau= niveau;
    }
    public int getNiveau(){
        return niveau;
    }
    
    public boolean estConforme(Calendar d){
        boolean res = false;
        for(Licence l : lesLicences){
            
            if(l.estValide(d)){
                res = true;
            }
        }
        return res;
        
    }
}
