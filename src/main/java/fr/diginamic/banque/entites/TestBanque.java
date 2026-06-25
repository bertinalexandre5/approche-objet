package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt = new Compte("FR78", 1000.00);
        System.out.println(cpt);
    }
}
