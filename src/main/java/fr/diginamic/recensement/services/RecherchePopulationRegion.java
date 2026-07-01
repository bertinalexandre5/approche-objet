package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez renseigner le nom d'une région");
        String nomRegion = scanner.nextLine();

        int sommeRegion = 0;

        for (int i= 0; i < recensement.getVilles().size(); i++) {
            Ville ville = recensement.getVilles().get(i);
            if (ville.getRegion().equals(nomRegion)) {
                sommeRegion += ville.getPopulation();
            }
        }

        if (sommeRegion > 0)  {
            System.out.println("La population de la région " + nomRegion + " est de " + sommeRegion + " habitant");
        } else {
            System.out.println("Région non trouvée");
        }
    }
}
