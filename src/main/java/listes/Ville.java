package listes;

public class Ville {
    private String nom;
    private int nb;

    public Ville(String nom, int nb) {
        this.nom = nom;
        this.nb = nb;
    }

    @Override
    public String toString() {
        return  nom + "-" + nb ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }
}
