package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale(15,"Rue du Haut", 21000, "inconnu");


        Personne sujet1 = new Personne("Bertin", "Alex");

        Personne sujet2 = new Personne("Bertin", "Alex", a1);
    }
}
