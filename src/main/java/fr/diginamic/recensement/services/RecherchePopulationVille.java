package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez renseigner le nom de la ville :");
        String nomVille = scanner.nextLine();

        Ville villeTrouvee = null;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equals(nomVille)) {
                villeTrouvee = ville;
                break;
            }
        }

        if (villeTrouvee != null) {
            System.out.println("Population de la ville de " + villeTrouvee.getNomCommune() + " est de " + villeTrouvee.getPopulation() + " habitants");
        } else {
            System.out.println("Ville introuvable : " + nomVille);
        }


    }

}
