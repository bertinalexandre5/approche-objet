package fr.diginamic.banque.entites;

import fr.diginamic.banque.Compte;

public class CompteTaux extends Compte {

    private double tauxRemuneration;


    public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString(){
        return super.toString() +" - Taux : "+tauxRemuneration +" %";
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

}
