package fr.diginamic.essais;

import fr.diginamic.banque.entites.Salarie;

public class TestSalarie {
    public static void main(String[] args) {

        String personne = "Dupont; Marie; 2 523.5";

        String[] morceaux = personne.split(";");
        String nom = morceaux[0];
        String prenom = morceaux[1];
        String salaireTexte = morceaux[2];

        String salaireSansEspace = salaireTexte.replace(" ", "");
        //System.out.println(salaireSansEspace);

        double salaire = Double.parseDouble(salaireSansEspace);
        System.out.println(salaire);

        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println(salarie);

    }
}
