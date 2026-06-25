package fr.diginamic.banque;

public class Compte {

        private String numeroCompte;
        private double soldeCompte;

    public Compte(String numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public String toString() {
    return "Numero de compte : " +numeroCompte+" - Solde : "+soldeCompte;
}

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}

