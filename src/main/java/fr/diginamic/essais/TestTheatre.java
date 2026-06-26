package fr.diginamic.essais;

import fr.diginamic.banque.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        theatre.setNom("Le Capitole");
        theatre.setCapacite(100);

        theatre.inscrire(40, 12.50);
        theatre.inscrire(20, 12.50);

        System.out.println("---------");
        System.out.println("Total client : " + theatre.getNbInscrit()+"/100");
        System.out.println("Recette totale : " + theatre.getRecette());

        theatre.inscrire(20, 12.50);

        System.out.println("---------");
        System.out.println("Total client : " + theatre.getNbInscrit() +"/100");
        System.out.println("Recette totale : " + theatre.getRecette());

        theatre.inscrire(30, 12.50);

        System.out.println("---------");
        System.out.println("Total client : " + theatre.getNbInscrit()+"/100");
        System.out.println("Recette totale : " + theatre.getRecette());


    }
}
