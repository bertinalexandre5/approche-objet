package fr.diginamic.recensement;

import fr.diginamic.recensement.services.RecherchePopulationVille;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {

        Recensement recensement = new Recensement();

        Path pathFichier = Paths.get("C:/Users/berti/Documents/DIGINAMIC/COURS/JAVA/recensement.csv");
        List<String> lignes = Files.readAllLines(pathFichier);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i);
            String[] tokens = ligne.split(";");

            String codeRegion = tokens[0];
            String region = tokens[1];
            String departement = tokens[2];
            String codeCommune = tokens[5];
            String nomCommune = tokens[6];
            String population = tokens[9];

            String populationTexte = tokens[9].trim().replaceAll(" ", "");
            int populationTotale = Integer.parseInt(populationTexte);

            Ville ville = new Ville(codeRegion, region, departement,
                    codeCommune, nomCommune, populationTotale);
            recensement.ajouterVille(ville);
        }


//        String regionsPlusPeuplees;
//        String departementsPlusPeuplees;
//        String villesPlusPeupleesDep;
//        String villesPlusPeupleesRegion;
//        String villesPlusPeupleesFr;


        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        while (choix != 9) {
            System.out.println("----- MENU -----");
            System.out.println("1. Population d’une ville donnée");
            System.out.println("2. Population d’un département donné");
            System.out.println("3. Population d’une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");





            choix = scanner.nextInt();
            scanner.nextLine();


            switch (choix) {
                case 1:
                    RecherchePopulationVille villeRecherche = new RecherchePopulationVille();
                    villeRecherche.traiter(recensement,scanner);
                    break;
//                case 2:
//                    System.out.println("Veuillez renseigner le nom du département :");
//                    String nomDep = scanner.nextLine();
//                    break;
//                case 3:
//                    System.out.println("Veuillez renseigner le nom de la région :");
//                    String nomRegion = scanner.nextLine();
//                    break;
//                case 4:
//                    System.out.println("Les 10 régions les plus peuplées sont : " + regionsPlusPeuplees);
//                    break;
//                case 5:
//                    System.out.println("Les 10 département les plus peuplées sont : " + departementsPlusPeuplees);
//                    break;
//                case 6:
//                    System.out.println("Veuillez renseigner le nom d'un département :");
//                    String nomMaxVilleDep = scanner.nextLine();
//                    break;
//                case 7:
//                    System.out.println("Veuillez renseigner le nom d'une région :");
//                    String nomMaxVilleRegion = scanner.nextLine();
//                    break;
//                case 8:
//                    System.out.println("Les 10 villes les plus peuplées en France sont : " + regionsPlusPeuplees);
//                    break;
//                case 9:
//                    System.out.println("Session terminée");
//                    break;
                default:
                    System.out.println("Choix non valide, réessayez");
            }

        }

    }
}
