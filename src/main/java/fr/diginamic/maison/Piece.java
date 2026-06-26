package fr.diginamic.maison;

public class Piece {
    private String nom;
    private double superficie;
    private int etage;

    public Piece (String nom, double superficie, int etage){
        this.nom = nom;
        this.superficie = superficie;
        this.etage = etage;
    }



    //Getter Setters
    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + " ( " + superficie+ " m², étage " + etage + ")";
    }
}
