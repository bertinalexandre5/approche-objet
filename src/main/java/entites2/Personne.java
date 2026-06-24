package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne (String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
}

    public Personne (String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }

    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    public void setAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // Getters (accesseurs)
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public AdressePostale getAdresse() {
        return this.adresse;
    }


}
