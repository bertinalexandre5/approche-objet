package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {

        ArrayList<Ville> villes = new ArrayList<>();

        Path pathFile = Paths.get("C:/Users/berti/Documents/DIGINAMIC/COURS/JAVA/recensement.csv");
        List<String> lignes = Files.readAllLines(pathFile);

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i);
            String[] tokens = ligne.split(";");


            String nom = tokens[1];
            String codeDep = tokens[2];
            String region = tokens[6];
            String population = tokens[9].trim().replaceAll(" ", "");
            int populationTotale = Integer.parseInt(population);

            Ville ville = new Ville(nom, codeDep, region, populationTotale);
            villes.add(ville);
        }

        List<String> lignesSortie = new ArrayList<>();

        // 2. AJOUTER L'EN-TÊTE en première ligne
        lignesSortie.add("Nom;CodeDepartement;Region;Population");
//        System.out.println(villes);
        for (int i = 0; i < villes.size(); i++) {
            Ville ville = villes.get(i);

            if (ville.getPopulation() > 25000) {
                String ligneVille = ville.getNom() + ";"
                        + ville.getCodeDep() + ";"
                        + ville.getRegion() + ";"
                        + ville.getPopulation();

                lignesSortie.add(ligneVille);
            }
        }
        Path pathSortie = Paths.get("C:/Users/berti/Documents/DIGINAMIC/COURS/JAVA/villes_25000.csv");
        Files.write(pathSortie, lignesSortie);

        System.out.println("Fichier généré : " + lignesSortie.size() + " lignes (en-tête compris)");
    }
    }
