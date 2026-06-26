package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {

        Maison maison = new Maison();

        maison.ajouterPiece(new Piece("Cuisine", -13, 0));
        maison.ajouterPiece(new Piece("Salon", 35, 0));
        maison.ajouterPiece(new Piece("Chambre", 15, 1));
        maison.ajouterPiece(new Piece("WC", 6, 0));
        maison.ajouterPiece(new Piece("SalleDeBain", 12, 2));
        maison.ajouterPiece(new Piece("Chambre", 12, 2));



        System.out.println("Superficie totale maison : "+maison.superficieMaison()+ "m²");

        System.out.println("-------------");
        System.out.println("Superficie RDC : "+maison.superficieEtage(0)+ "m²");
        System.out.println("Superficie 1er atage : "+maison.superficieEtage(1)+ "m²");
        System.out.println("Superficie 2eme atage : "+maison.superficieEtage(2)+ "m²");
        System.out.println("Superficie total de chambres : " + maison.getSuperficieParType("Chambre"));




    }
}
