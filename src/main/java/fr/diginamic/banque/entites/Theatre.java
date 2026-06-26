package fr.diginamic.banque.entites;

public class Theatre {
    private String nom;
    private int capacite;
    private int nbInscrit;
    private double recette;


    // METHODE INSCRIRE
    public void inscrire (int nbClients, double prix) {
    int placeRestante = capacite - nbInscrit;
        if (nbClients <= placeRestante                                          ) {
            nbInscrit += nbClients;
            double recetteEnCours = nbClients * prix;
            recette += recetteEnCours;
        } else {
            System.out.println("Désolé, plus de place disponible, il ne reste que "+placeRestante);
        }
    }

    //GETTER SETTER
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNbInscrit() {
        return nbInscrit;
    }

    public void setNbInscrit(int nbInscrit) {
        this.nbInscrit = nbInscrit;
    }

    public double getRecette() {
        return recette;
    }

    public void setRecette(double recette) {
        this.recette = recette;
    }
}
