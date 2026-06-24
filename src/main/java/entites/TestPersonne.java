package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale();
        a1.numeroRue = 15;
        a1.libelleRue = "rue du haut";
        a1.codePostal = "21000";
        a1.ville = "inconnu"

        Personne sujet1 = new Personne();
        sujet1.nom = "Bertin";
        sujet1.prenom = "Alex";
        sujet1.adresse = a1;


    }
}
