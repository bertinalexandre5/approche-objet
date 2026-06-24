package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale(15,"Rue du Haut", "21000", "inconnu");

        Personne sujet1 = new Personne("Bertin", "Alex");

        Personne sujet2 = new Personne("Dupont", "Marie", a1);
        sujet1.afficher();
        sujet2.afficher();
        AdressePostale a2 = new AdressePostale(25, "Rue de la bas", "95000", "paris");

        sujet2.setAdresse(a2);

        System.out.println(sujet2.getNom() + " " + sujet2.getPrenom() + sujet2.getAdresse());

    }

}
