package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez renseigner le code du département");
        String codeDep = scanner.nextLine();

        int sommePopDep = 0;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getDepartement().equals(codeDep)) {
                sommePopDep += ville.getPopulation();
            }
        }

        if (sommePopDep > 0) {
            System.out.println("La population du département " + codeDep + " est de : " + sommePopDep + " habitants.");
        } else {
            System.out.printf("Département non trouvé : ");

        }
    }
}
