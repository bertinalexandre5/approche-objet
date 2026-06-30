package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("C:/Users/berti/Documents/DIGINAMIC/COURS/JAVA/recensement.csv");
        List<String> toutesLignes = Files.readAllLines(pathFile);

        List<String> centPremieres= new ArrayList<>();

        for (int i=0; i < 100; i++) {
            String ligne = toutesLignes.get(i);
            centPremieres.add(ligne);
        }

        Path pathDestination = Paths.get("C:/Users/berti/Documents/DIGINAMIC/COURS/JAVA/recensement_100.csv");
        Files.write(pathDestination, centPremieres);
    }
}
