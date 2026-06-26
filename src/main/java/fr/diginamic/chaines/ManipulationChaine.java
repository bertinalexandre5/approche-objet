package fr.diginamic.chaines;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int longueurCaractere = chaine.length();
        System.out.println("Longeur chaine: " + longueurCaractere);

        int indexCaractere = chaine.indexOf(";");
        System.out.println("Index de la lettre ; : " + indexCaractere);

        String exclusion = chaine.substring(0, 6);
        System.out.println("Exclusion des 6 premiers index " + exclusion);

        String exclusionIndex = chaine.substring(0, indexCaractere);
        System.out.println("Extraire nom de famille " + exclusionIndex);

        String maj = exclusionIndex.toUpperCase();
        System.out.println("Nom en MAJ " + maj);

        String min = exclusionIndex.toLowerCase();
        System.out.println("Nom en MIN " + min);

        String[] tableauNom = chaine.split(";");
        System.out.println("1er nom dans tableau " + (tableauNom[0]) );
        System.out.println("2eme nom dans tableau " + (tableauNom[1]) );

    }
}
