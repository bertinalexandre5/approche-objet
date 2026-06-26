package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Dupont", "Marie", 2500);
        salarie.afficherDonnees();


        Pigiste pigiste = new Pigiste("Durand", "Robert", 150, 8);
        pigiste.afficherDonnees();
    }
}
